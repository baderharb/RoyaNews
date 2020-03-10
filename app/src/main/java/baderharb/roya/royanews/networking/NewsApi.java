package baderharb.roya.royanews.networking;

import baderharb.roya.royanews.model.NewsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NewsApi {
    @GET("section/get/1/info/{page}")
    Call<NewsResponse> getNewsList(@Path("page") String pageIndex);
}
