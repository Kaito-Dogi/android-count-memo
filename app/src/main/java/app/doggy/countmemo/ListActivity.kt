package app.doggy.countmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.room.Room

class ListActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).build()

        textView = findViewById(R.id.textView2)

        launch(db)

    }

    suspend fun launch(db: AppDatabase) {
        // 何らかの処理
        var memoList = db.memoDao().getAll()
        if(memoList.isNotEmpty()) {
            textView.text = memoList[0].content
        } else {
            textView.text = "I have no memo."
        }
    }
}