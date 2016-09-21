package net.imperium.imperious.space.fragments;

/**
 * Created by blaze on 9/20/2016.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.imperium.imperious.space.R;
import net.imperium.imperious.space.adapters.RecyclerArticleAdapter;
import net.imperium.imperious.space.models.ArticlePreviewModel;


public class PlaceholderFragment extends Fragment {

    public interface OnButtonPressedListener {
        void onBtnPressed(ArticlePreviewModel article);
    }

    private RecyclerView mRecycler;
    private RecyclerArticleAdapter mAdapter;
    private OnButtonPressedListener btnListener;

    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        btnListener = (OnButtonPressedListener) context;
    }

    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mRecycler = (RecyclerView) rootView.findViewById(R.id.recycler_article);
        mAdapter = new RecyclerArticleAdapter() {
            @Override
            public void onClick2(View v, int position) {
                btnListener.onBtnPressed(new ArticlePreviewModel());
            }
        };
        mRecycler.setAdapter(mAdapter);
        mRecycler.setLayoutManager(new LinearLayoutManager(container.getContext()));
        return rootView;
    }

    public RecyclerView getmRecycler() {
        return mRecycler;
    }

    public RecyclerArticleAdapter getmAdapter() {
        return mAdapter;
    }
}