package br.com.diegolandiribeiro.roomwordsample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import br.com.diegolandiribeiro.roomwordsample.dao.WordDao
import br.com.diegolandiribeiro.roomwordsample.dao.WordRoomDatabase
import br.com.diegolandiribeiro.roomwordsample.model.Word
import br.com.diegolandiribeiro.roomwordsample.repository.WordRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WordViewModel(application: Application, wordDao: WordDao) : AndroidViewModel(application) {

    private val repository: WordRepository = WordRepository(wordDao)
    val allWords: LiveData<List<Word>> = repository.allWords

    fun insert(word: Word) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(word)
    }
}