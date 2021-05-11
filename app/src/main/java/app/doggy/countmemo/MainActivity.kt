package app.doggy.countmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var memoEditText: EditText
    lateinit var countText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Viewと変数の関連付け
        memoEditText = findViewById(R.id.memo_edit_text)
        countText = findViewById(R.id.count_text)

        //メモを入力した時の処理。
        memoEditText.addTextChangedListener(object : TextWatcher{

            override fun afterTextChanged(p0: Editable?) {
                val wordCount = memoEditText.text.length
                countText.text = wordCount.toString()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

        })

    }
}