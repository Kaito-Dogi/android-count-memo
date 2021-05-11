package app.doggy.countmemo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Memo::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun memoDao(): MemoDao
}