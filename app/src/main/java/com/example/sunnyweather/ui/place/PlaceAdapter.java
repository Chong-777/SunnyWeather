package com.example.sunnyweather.ui.place;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sunnyweather.R;
import com.example.sunnyweather.logic.model.PlaceResponse;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView placeName;
        TextView placeAddress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            placeAddress = itemView.findViewById(R.id.placeAddress);
            placeName = itemView.findViewById(R.id.placeName);
        }
    }

    private Fragment fragment;
    private List<PlaceResponse.Place> placeList;

    public PlaceAdapter(Fragment fragment, List<PlaceResponse.Place> placeList) {
        this.fragment = fragment;
        this.placeList = placeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_item, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PlaceResponse.Place place = placeList.get(position);
        holder.placeName.setText(place.getName());
        holder.placeAddress.setText(place.getAddress());
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }
}
