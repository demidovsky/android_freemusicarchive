package com.example.ddemidovskiy.fma;

import android.content.Context;
import android.widget.CursorAdapter;

/**
 * Created by ddemidovskiy on 23.09.2016.
 */
public interface Load
{
    public void init(Context context);
    public void loadMore();
    public void startOver();
    public CursorAdapter getAdapter();
}
