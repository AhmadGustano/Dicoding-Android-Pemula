package com.example.ti2019dpc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListTeamAdapter extends RecyclerView.Adapter<ListTeamAdapter.ListViewHolder> {
    private ArrayList<Team> listTeam;
    private OnItemClickCallback onItemClickCallback;
    Context mcontext;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListTeamAdapter(Context context, ArrayList<Team> list) {
        this.mcontext = context;
        this.listTeam = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.team_row, viewGroup, false);
        return new ListViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Team team = listTeam.get(position);
        Glide.with(holder.itemView.getContext())
                .load(team.getLogo())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.Logo);
        holder.TVName.setText(team.getName());
        holder.TVDesc.setText(team.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listTeam.get(holder.getAdapterPosition()));
                Intent move = new Intent(mcontext, TeamDetail.class);
                move.putExtra("TEAM", team);
                move.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(move);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listTeam.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView Logo;
        TextView TVName,TVDesc;

        ListViewHolder(View itemView) {
            super(itemView);
            Logo = itemView.findViewById(R.id.item_logo);
            TVName = itemView.findViewById(R.id.item_name);
            TVDesc = itemView.findViewById(R.id.item_desc);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Team data);
    }
}
