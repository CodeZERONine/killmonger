package org.akshanshgusain.killmonger.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import org.akshanshgusain.killmonger.R;
import org.akshanshgusain.killmonger.Model.*;

import java.util.ArrayList;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>{
     private ArrayList<SingleVertical> mData=new ArrayList<>();

    public VerticalAdapter(ArrayList<SingleVertical> mData) {
                this.mData=mData;
    }

    // /Override Methods
    @NonNull
    @Override
    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_single_row,parent,false);
        VerticalViewHolder vvh=new VerticalViewHolder(view);
        return vvh;
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
                      holder.image.setImageResource(mData.get(position).getImage());
                      holder.title.setText(mData.get(position).getHeader());
                      holder.description.setText(mData.get(position).getSubHeader());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    //View Holder Class
    public class VerticalViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title,description;
        public VerticalViewHolder(View itemView) {
            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.image);
            title=(TextView)itemView.findViewById(R.id.title);
            description=(TextView)itemView.findViewById(R.id.description);
        }
    }
}
