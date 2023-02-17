package com.google.luneblazetask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

private ArrayList<Model>modelArrayList;
private Context context;

    public TaskAdapter(ArrayList<Model> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public TaskAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new TaskAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskAdapter.ViewHolder holder, int position) {
      Model model = modelArrayList.get(position);
      holder.userTv.setText(model.getUserName());
          Picasso.get().load(model.getMedia_url()).into(holder.postIv);


      holder.articleTV.setText(model.getArticle());


    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView userIV;
        private TextView userTv;
        private ImageView postIv,informativeIv,thoughtsIv,shareIv;
        private TextView articleTV, informativeTv,thoughtsTv,shareTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userIV = itemView.findViewById(R.id.idCVUser);
            userTv = itemView.findViewById(R.id.idTVUserName);
            postIv = itemView.findViewById(R.id.idImgPost);
            informativeIv=itemView.findViewById(R.id.IVInformative);
            thoughtsIv=itemView.findViewById(R.id.IVThoughts);
            shareIv=itemView.findViewById(R.id.IVshare);
            informativeTv=itemView.findViewById(R.id.idTVInformative);
            thoughtsTv=itemView.findViewById(R.id.idTVThoughts);
            shareTv=itemView.findViewById(R.id.idTVshare);
            articleTV=itemView.findViewById(R.id.idTVArticle);

        }
    }
}
