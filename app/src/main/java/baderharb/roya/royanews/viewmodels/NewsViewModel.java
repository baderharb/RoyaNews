package baderharb.roya.royanews.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import baderharb.roya.royanews.model.NewsResponse;
import baderharb.roya.royanews.networking.NewsRepository;

public class NewsViewModel extends ViewModel {

    private MutableLiveData<NewsResponse> mutableLiveData;
    private NewsRepository newsRepository;
    private String page = "1";

    public void init() {
        if (mutableLiveData != null) {
            return;
        }
        newsRepository = NewsRepository.getInstance();
        mutableLiveData = newsRepository.getNews(this.page);
    }

    public LiveData<NewsResponse> getNewsRepository(String Page) {
        this.page = Page;
        return mutableLiveData;
    }
}
