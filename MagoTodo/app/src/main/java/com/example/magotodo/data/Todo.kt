package com.example.magotodo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
  @PrimaryKey(autoGenerate = true)
  val num: Int,
  val title: String,
  val completed: Boolean,
)
