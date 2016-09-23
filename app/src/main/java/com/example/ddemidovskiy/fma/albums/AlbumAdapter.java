package com.example.ddemidovskiy.fma.albums;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;

import com.example.ddemidovskiy.fma.Holder;
import com.example.ddemidovskiy.fma.R;
import com.example.ddemidovskiy.fma.artists.ArtistsTable;
import com.squareup.picasso.Picasso;

/**
 * Created by student on 2016.
 */
public class AlbumAdapter extends CursorAdapter {
    public AlbumAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        Log.d("happy", "newView");
        View view = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        Holder holder = new Holder();
        holder.picture = (ImageView) view.findViewById(R.id.image);
        //populateView(holder, cursor, context);
        view.setTag(holder);

        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        Log.d("happy", "bindView");
        Holder holder = (Holder) view.getTag();
        populateView(holder, cursor, context);
    }

    private void populateView(Holder holder, Cursor cursor, Context context) {
        Picasso
                .with(context)
                .load(cursor.getString(cursor.getColumnIndex(AlbumsTable.COLUMN_IMAGE)))
                .fit()
                .centerCrop()
                .into(holder.picture);
    }
}
