package com.example.ddemidovskiy.fma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.ddemidovskiy.fma.artists.ArtistAdapter;

public class MainActivity extends AppCompatActivity  {

    private Retrofitter r = new Retrofitter();
    private Grid grid = new Grid();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r.init(this);
        r.loadMore();

        grid.init((GridView) findViewById(R.id.gridview));



        grid.getGridView().setAdapter(r.getAdapter());


    }

}
