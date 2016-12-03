package com.example.vaio.cardview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private List<Song> listSong;
    private Context context;
    private LayoutInflater inflater;

    public SongAdapter(Context context, List<Song> listSong){
        this.listSong= listSong;
        this.context=context;
        this.inflater=LayoutInflater.from(context);
    }


    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item, parent, false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        Song item= listSong.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvArtist.setText(item.getArtist());
        holder.tvYear.setText(String.valueOf(item.getYear()));
    }

    @Override
    public int getItemCount() {
        return listSong.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle;
        private TextView tvArtist;
        private TextView tvYear;

        public SongViewHolder(View itemView) {
            super(itemView);
            tvTitle=(TextView) itemView.findViewById(R.id.tv_title);
            tvArtist=(TextView) itemView.findViewById(R.id.tv_artist);
            tvYear=(TextView) itemView.findViewById(R.id.tv_year);
        }
    }
}
