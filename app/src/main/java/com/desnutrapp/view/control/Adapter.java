package com.desnutrapp.view.control;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.desnutrapp.R;
import com.desnutrapp.interfaces.IReceiveId;
import com.desnutrapp.interfaces.IRecyclerViewMenuClickListener;

import com.desnutrapp.models.history;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {

    List<history> list;
    IReceiveId nIReceiveId;

    public Adapter(List<history> list, IReceiveId nIReceiveId) {
        this.list = list;
        this.nIReceiveId = nIReceiveId;
    }

    public void setList(List<history> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Adapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_control, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.AdapterViewHolder holder, int position) {
        history history = list.get(position);
        holder.titleItemNutritional.setText(String.format("%s %s %s", history.getLastNameP(), history.getLastNameM(), history.getNames()));

        holder.setMenuClickListener((view, position1) -> viewDetail(list.get(position1).conId));
    }

    private void viewDetail(@NonNull String uid) {
        nIReceiveId.receiveId(uid);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class AdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView titleItemNutritional;

        IRecyclerViewMenuClickListener clickListener;

        public void setMenuClickListener(IRecyclerViewMenuClickListener clickListener) {
            this.clickListener = clickListener;
        }

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            titleItemNutritional = itemView.findViewById(R.id.title_item_control);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener.onRecyclerMenuClick(view, getAdapterPosition());
        }
    }

}
