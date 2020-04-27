package com.example.databashantering;

import android.app.Application;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;

    private LiveData<List<Word>> mAllword;

    public WordViewModel (Application application){
        super(application);
        mRepository = new WordRepository(application);
        mAllword = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllword;
    }

    public void insert(Word word){ mRepository.insert(word); }
}
