package com.desnutrapp.view.vaccines;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.desnutrapp.R;
import com.desnutrapp.interfaces.IReceiveId;
import com.desnutrapp.models.vaccineModel;
import com.google.android.material.textfield.TextInputLayout;

import java.util.List;
import java.util.Objects;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {

    List<vaccineModel> list;
    IReceiveId nIReceiveId;

    public Adapter(List<vaccineModel> list, IReceiveId nIReceiveId) {
        this.list = list;
        this.nIReceiveId = nIReceiveId;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_vaccine, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        vaccineModel history = list.get(position);
        holder.title.setText(String.format("%s", history.getTitle()));
        holder.date.setText(String.format("%s", history.getDate()));
        Objects.requireNonNull(holder.dose.getEditText()).setText(history.getType());

        holder.btnDelete.setOnClickListener(v -> {
            holder.btnDelete.setVisibility(View.GONE);
            holder.btnProgress.setVisibility(View.VISIBLE);
            viewDetail(list.get(position).conId);
        });
    }

    private void viewDetail(@NonNull String uid) {
        nIReceiveId.receiveId(uid);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class AdapterViewHolder extends RecyclerView.ViewHolder {

        TextInputLayout dose;
        TextView title;
        TextView date;
        Button btnDelete;
        ProgressBar btnProgress;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            dose = itemView.findViewById(R.id.dose_container);
            title = itemView.findViewById(R.id.vaccine_age);
            date = itemView.findViewById(R.id.vaccine_date);
            btnDelete = itemView.findViewById(R.id.delete_vaccine);
            btnProgress = itemView.findViewById(R.id.progress_vaccine_delete);
        }
    }
}
