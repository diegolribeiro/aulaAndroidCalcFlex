package br.com.diegolandiribeiro.roomwordsample.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.diegolandiribeiro.roomwordsample.model.Word

@Database(entities = [Word::class], version = 1)
public abstract class WordRoomDatabase : RoomDatabase() {
    abstract fun wordDao(): WordDao
}