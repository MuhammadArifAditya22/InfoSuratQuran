package com.example.tugas4_infosurat;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import com.example.tugas4_infosurat.InfoSurah.Response;
import com.example.tugas4_infosurat.InfoSurah.ChaptersItem;
import com.example.tugas4_infosurat.retrofit.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private AdapterMain adapter;
    private RecyclerView recyclerView;
    private List<ChaptersItem> results = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromApi();
        setUpView();
        setUpRecycleview();
    }

    private void setUpRecycleview() {
        adapter = new AdapterMain(results);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void setUpView() {
        recyclerView = findViewById(R.id.recycle);
    }

    private void getDataFromApi(){
        ApiService.endpoint().getSurah().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if (response.isSuccessful()){
                    List<ChaptersItem> result = response.body().getChapters();
                    Log.d("Main", result.toString());
                    adapter.setData(result);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.d("ErrorMain", toString());
            }
        });
    }
}