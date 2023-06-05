package com.desnutrapp.view.stimulation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.desnutrapp.R;
import com.desnutrapp.models.howStimulateModel;

import java.util.List;

public class AdapterHowStimulateModel extends RecyclerView.Adapter<AdapterHowStimulateModel.AdapterViewHolder> {

    List<howStimulateModel> list;

    public AdapterHowStimulateModel(List<howStimulateModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_stimulation, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {

        howStimulateModel model = list.get(position);
        holder.titleItemStimulation.setText(String.format("%s %s", "* ", model.getTitle()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class AdapterViewHolder extends RecyclerView.ViewHolder {

        TextView titleItemStimulation;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            titleItemStimulation = itemView.findViewById(R.id.title_item_stimulation);
        }
    }
}
