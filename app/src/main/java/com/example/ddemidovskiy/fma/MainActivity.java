package com.example.ddemidovskiy.fma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.ddemidovskiy.fma.artists.ArtistsLoad;

public class MainActivity extends AppCompatActivity  {

    private ArtistsLoad r = new ArtistsLoad();
    private Grid albumsGrid = new Grid();
    private Grid artistsGrid = new Grid();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r.init(this);
        r.startOver();

        artistsGrid.init((GridView) findViewById(R.id.artists_grid));
        albumsGrid.init((GridView) findViewById(R.id.albums_grid));

        artistsGrid.getGridView().setAdapter(r.getArtistAdapter());
        albumsGrid.getGridView().setAdapter(r.getAlbumAdapter());

    }

}
