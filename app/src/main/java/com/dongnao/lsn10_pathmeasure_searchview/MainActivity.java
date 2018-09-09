package com.dongnao.lsn10_pathmeasure_searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        SearchView searchView = new SearchView(this);
        setContentView(searchView);
        searchView.setState(SearchView.SearchState.START);
    }
}
