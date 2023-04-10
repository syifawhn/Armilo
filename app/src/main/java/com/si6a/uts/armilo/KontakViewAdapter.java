package com.si6a.uts.armilo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.si6a.uts.armilo.DB.User;

import java.util.ArrayList;
import java.util.List;

public class KontakViewAdapter extends RecyclerView.Adapter<KontakViewAdapter.ViewHolder> {

    private List<User> data = new ArrayList<>();
    private View.OnClickListener listener;
    public void setData(List<User> data) {
        this.data = data = new ArrayList<>();
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public KontakViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemKontakBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull KontakViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
