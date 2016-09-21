package net.imperium.imperious.space.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.imperium.imperious.space.R;
import net.imperium.imperious.space.models.ArticlePreviewModel;

import java.util.ArrayList;

/**
 * Created by blaze on 9/20/2016.
 */

public abstract class RecyclerArticleAdapter extends RecyclerView.Adapter<RecyclerArticleAdapter.ArticleHolder> {

    private ArrayList<ArticlePreviewModel> articles = new ArrayList<>(30);

    @Override
    public ArticleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ArticleHolder(View.inflate(parent.getContext(), R.layout.article_card, null));
    }

    @Override
    public void onBindViewHolder(ArticleHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public ArrayList<ArticlePreviewModel> getArticles() {
        return articles;
    }

    public abstract void onClick2(View v, int position);

    class ArticleHolder extends RecyclerView.ViewHolder {

        private Button btnRead;
        private Button btnFavorite;
        private CardView mCardView;

        public ArticleHolder(View itemView) {
            super(itemView);
            btnRead = (Button) itemView.findViewById(R.id.article_read_btn);
            btnFavorite = (Button) itemView.findViewById(R.id.article_favorite_btn);
            mCardView = (CardView) itemView.findViewById(R.id.cardView);
            mCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClick2(view, getAdapterPosition());
                }
            });
        }
    }
}
