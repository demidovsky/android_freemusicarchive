package com.example.ddemidovskiy.fma;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.ddemidovskiy.fma.albums.AlbumsLoad;
import com.example.ddemidovskiy.fma.artists.ArtistsLoad;



public class GridFragment extends Fragment
{
    private static final String ARG_TYPE = "type";
    private String type;
    private static Context context;

    private Load load;
    private Grid grid;


    //private OnFragmentInteractionListener mListener;




    public GridFragment()
    {
        // Required empty public constructor
    }





    /**
     * Создаёт сетку с картинками
     *
     * @param type тип - артисты или альбомы
     * @return A new instance of fragment GridFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GridFragment newInstance(String type, Context context)
    {
        Log.d("dimmy", "GridFrag: newInstance");
        GridFragment fragment = new GridFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TYPE, type);
        fragment.setArguments(args);
        GridFragment.context = context;
        return fragment;
    }





    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d("dimmy", "GridFrag: onCreate");

        if (getArguments() != null)
        {
            type = getArguments().getString(ARG_TYPE);
            Log.d("dimmy", "GridFrag: type " + type);

            switch (type)
            {
                case "artists":
                {
                    load = new ArtistsLoad();
                    break;
                }
                case "albums":
                {
                    load = new AlbumsLoad();
                    break;
                }
            }
        }

        grid = new Grid();
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        Log.d("dimmy", "GridFrag: onCreateView");

        View view = inflater.inflate(R.layout.fragment_grid, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.fragment_grid);

        Log.d("dimmy", "GridFrag: onCreateView views set.");
        load.init(context);
        Log.d("dimmy", "GridFrag: load inited.");
        load.startOver();
        grid.init(gridView);
        gridView.setAdapter(load.getAdapter());

        Log.d("dimmy", "GridFrag: onCreateView finished.");

        return view;
    }






/*    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri)
    {
        if (mListener != null)
        {
            mListener.onFragmentInteraction(uri);
        }
    }*/






    @Override
    public void onAttach(Context context)
    {
        Log.d("dimmy", "GridFrag: onAttach");
        super.onAttach(context);
        /*if (context instanceof OnFragmentInteractionListener)
        {
            mListener = (OnFragmentInteractionListener) context;
        } else
        {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }*/
    }






    @Override
    public void onDetach()
    {
        Log.d("dimmy", "GridFrag: onDetach");
        super.onDetach();
        //mListener = null;
    }






    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    /*public interface OnFragmentInteractionListener
    {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }*/
}
