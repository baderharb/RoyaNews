package baderharb.roya.royanews.networking;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import baderharb.roya.royanews.model.NewsResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsRepository {

    private static NewsRepository newsRepository;
    private NewsApi newsApi;

    public static NewsRepository getInstance() {
        if (newsRepository == null) {
            newsRepository = new NewsRepository();
        }
        return newsRepository;
    }

    public NewsRepository() {
        newsApi = RetrofitService.cteateService(NewsApi.class);
    }

    public MutableLiveData<NewsResponse> getNews(String Page) {
        MutableLiveData<NewsResponse> newsData = new MutableLiveData<>();
        newsApi.getNewsList(Page).enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()) {
                    newsData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Log.e("RetrofitError", t.getMessage());
//                newsData.setValue(null);
            }
        });
        return newsData;
    }
}