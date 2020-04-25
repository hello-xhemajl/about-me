package helo.mali.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            bakeNickName(it)
        }
    }

    private fun bakeNickName(button: View?) {
        val nicknameTextView: TextView = findViewById(R.id.nick_name_text_view)
        val nicknameEditText: EditText = findViewById(R.id.nick_name_edit_text)

        nicknameTextView.text = nicknameEditText.text
        nicknameTextView.visibility = View.VISIBLE

        nicknameEditText.visibility = View.GONE
        button!!.visibility =View.GONE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(button.windowToken, 0)

    }
}
