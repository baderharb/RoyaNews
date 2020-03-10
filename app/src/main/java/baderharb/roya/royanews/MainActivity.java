package baderharb.roya.royanews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;

import baderharb.roya.royanews.adapters.NewsAdapter;
import baderharb.roya.royanews.model.NewsResponse;
import baderharb.roya.royanews.viewmodels.NewsViewModel;

public class MainActivity extends AppCompatActivity {

    private NewsResponse articleArrayList;
    private NewsAdapter newsAdapter;
    private RecyclerView rvHeadline;
    private NewsViewModel newsViewModel;
    private boolean isLoading = false;
    private ProgressDialog progressDialog;
    private String page = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHeadline = findViewById(R.id.rvNews);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait…");
        progressDialog.setCancelable(false);

        setupRecyclerView();
        newsViewModel = ViewModelProviders.of(this).get(NewsViewModel.class);
        newsViewModel.init();
        newsViewModel.getNewsRepository(page).observe(this, newsResponse -> {
            newsAdapter.addData(newsResponse) ;
            if (progressDialog.isShowing()){
                progressDialog.dismiss();
            }
        }
        );
    }

    private void setupRecyclerView() {
        if (newsAdapter == null) {
            newsAdapter = new NewsAdapter(MainActivity.this, articleArrayList);
            rvHeadline.setLayoutManager(new LinearLayoutManager(this));
            rvHeadline.setAdapter(newsAdapter);
            rvHeadline.setItemAnimator(new DefaultItemAnimator());
            rvHeadline.setNestedScrollingEnabled(true);
        } else {
            newsAdapter.notifyDataSetChanged();
        }

        rvHeadline.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!isLoading) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == newsAdapter.getItemCount() - 1) {
//                        progressDialog.show();
                        page = "2";
                        newsViewModel.getNewsRepository(page);
                        isLoading = true;
                    }
                }
            }
        });
    }
}
