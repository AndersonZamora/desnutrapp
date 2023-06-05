package com.desnutrapp.view.record;

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
import com.desnutrapp.interfaces.IRecyclerViewMenuClickListener;
import com.desnutrapp.models.control;
import com.google.android.material.textfield.TextInputLayout;

import java.util.List;
import java.util.Objects;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {

    List<control> list;
    IReceiveId nIReceiveId;

    public Adapter(List<control> list, IReceiveId nIReceiveId) {
        this.list = list;
        this.nIReceiveId = nIReceiveId;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_record_control, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        control control = list.get(position);
        holder.dateControl.setText(String.format("%s", control.conId));
        Objects.requireNonNull(holder.size.getEditText()).setText(String.format("%s%s", control.getSize(), "cm"));
        Objects.requireNonNull(holder.weight.getEditText()).setText(String.format("%s%s", control.getWeight(), "kg"));
        holder.delete.setOnClickListener(v -> {
            holder.delete.setVisibility(View.GONE);
            holder.deleteProgress.setVisibility(View.VISIBLE);
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

    static class AdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView dateControl;
        TextInputLayout size, weight;
        IRecyclerViewMenuClickListener clickListener;
        Button delete;
        ProgressBar deleteProgress;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            dateControl = itemView.findViewById(R.id.idlistDateControl);
            size = itemView.findViewById(R.id.id_sizeR);
            weight = itemView.findViewById(R.id.id_wheightR);
            delete = itemView.findViewById(R.id.delete_control);
            deleteProgress = itemView.findViewById(R.id.progress_circular_delete);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onRecyclerMenuClick(v, getAdapterPosition());
        }
    }

}
