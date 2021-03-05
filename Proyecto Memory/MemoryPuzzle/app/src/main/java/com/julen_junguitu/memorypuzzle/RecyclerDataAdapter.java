package com.julen_junguitu.memorypuzzle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.RecyclerDataHolder> {

    private List<Score> score_list;

    public RecyclerDataAdapter( List<Score> scoreList) {

        this.score_list = scoreList;
    }

    @Override
    public RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataHolder holder, int position) {
        holder.assignData(score_list.get(position));
    }

    @Override
    public int getItemCount() {
        return this.score_list.size();
    }

    public class RecyclerDataHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView points;

        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.txtNombrePlayer);
            points = (TextView) itemView.findViewById(R.id.txtScore);

        }

        public void assignData(Score score){

        name.setText(score.getName() );
        points.setText(score.getPoints() + "pts");


        }


    }
}
