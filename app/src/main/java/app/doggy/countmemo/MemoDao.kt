package app.doggy.countmemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MemoDao {
    @Query("SELECT * FROM memo")
    fun getAll(): List<Memo>

    @Query("SELECT * FROM memo WHERE uid IN (:memoIds)")
    fun loadAllByIds(memoIds: IntArray): List<Memo>

//    @Query("SELECT * FROM memo WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): Memo

    @Insert
    fun insertAll(vararg memo: Memo)

    @Delete
    fun delete(memo: Memo)
}