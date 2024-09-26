package com.example.okhttp_practice.KoinModule;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.okhttp_practice.Model.Post;
import com.example.okhttp_practice.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private List<Post> postsLists;

    private TextView tvTitle;
    private TextView tvBody;

    public PostAdapter(List<Post> posts){
        this.postsLists = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post_item_xml, viewGroup, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder postViewHolder, int i) {
        Post post = postsLists.get(i);
        postViewHolder.tvTitle.setText(post.getTitle());
        postViewHolder.tvBody.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class PostViewHolder extends RecyclerView.ViewHolder {
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvBody = itemView.findViewById(R.id.tvBody);
        }
    }
}
