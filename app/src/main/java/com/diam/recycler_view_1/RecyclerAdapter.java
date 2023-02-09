package com.diam.recycler_view_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CatViewHolder> {
    private ArrayList<String> titleText;
    private ArrayList<String> subTitleText;
    private ArrayList<Integer> image;

    public RecyclerAdapter(ArrayList<String> titleText, ArrayList<String> subTitleText, ArrayList<Integer> image) {
        this.titleText = titleText;
        this.subTitleText = subTitleText;
        this.image = image;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_design, parent, false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        holder.titleTextView.setText(titleText.get(position));
        holder.subTitleTextView.setText(subTitleText.get(position));
        holder.imageView.setImageResource(image.get(position));
    }

    @Override
    public int getItemCount() {
        return titleText.size();
    }

    public class CatViewHolder extends RecyclerView.ViewHolder {

        private TextView titleTextView;
        private TextView subTitleTextView;
        private ImageView imageView;

        public CatViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.text_view_title_id);
            subTitleTextView = itemView.findViewById(R.id.text_view_subtitle_id);
            imageView = itemView.findViewById(R.id.circle_image_view);


        }
    }
}
