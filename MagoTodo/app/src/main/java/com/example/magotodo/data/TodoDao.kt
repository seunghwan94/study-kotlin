package com.example.magotodo.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
interface TodoDao {
    @Insert
    fun insert(todo:Todo)
    @Query("select * from todo")
    fun getAllTodos():List<Todo>

    @Update
    fun update(todo: Todo)

    @Delete
    fun delete(todo: Todo)
}
