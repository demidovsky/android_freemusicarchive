package com.example.ddemidovskiy.fma;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by ddemidovskiy on 21.09.2016.
 */
public class Grid
{
    private final int SCROLL_THRESHOLD = 40;

    private ArtistAdapter adapter;
    private GridView grid;

    // Настройка сетки: привязка адаптера, обработчик кликов, бесконечный скролл
    public void init(GridView grid)
    {
        this.grid = grid;

        adapter = new ArtistAdapter(
                grid.getContext(),
                null,
                0);

        grid.setAdapter(adapter);


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*Intent intent = new Intent(MainActivity.this, Detail.class);

                Cursor cursor = adapter.getCursor();
                cursor.moveToPosition(position);
                String url = cursor.getString(cursor.getColumnIndex(PhotosTable.COLUMN_URL));

                intent.putExtra(PHOTO_URL, url);

                startActivity(intent);*/
            }
        });


        grid.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                /*if (scrollState == SCROLL_STATE_IDLE)
                {
                    if (grid.getLastVisiblePosition() >= grid.getCount() - SCROLL_THRESHOLD && !loading)
                    {
                        //Toast.makeText(getApplicationContext(), "Загрузка...", Toast.LENGTH_SHORT).show();
                        loadMore(currentPage + 1, tag);
                    }
                }*/
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });
    }


}
