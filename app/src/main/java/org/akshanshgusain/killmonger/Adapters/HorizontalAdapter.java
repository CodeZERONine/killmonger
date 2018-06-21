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
import org.w3c.dom.Text;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>{
    private ArrayList<SingleHorizontal> mDataList=new ArrayList<>();

        //Constructors
    public HorizontalAdapter(ArrayList<SingleHorizontal> mDataList) {
          this.mDataList=mDataList;
    }


//Meathods
    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_single_row,parent,false);
        HorizontalViewHolder vh=new HorizontalViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
          holder.description.setText(mDataList.get(position).getDesc());
          holder.title.setText(mDataList.get(position).getDesc());
          holder.pubDate.setText(mDataList.get(position).getPubDate());
          holder.image.setImageResource(mDataList.get(position).getImages());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    //ViewHolder Class
    public class HorizontalViewHolder extends RecyclerView.ViewHolder{
        TextView title,description,pubDate;
        ImageView image;
        public HorizontalViewHolder(View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.title);
            description=(TextView)itemView.findViewById(R.id.description);
            pubDate=(TextView)itemView.findViewById(R.id.published_date);
            image=(ImageView)itemView.findViewById(R.id.image_view);
        }
    }//End of viewHolder Class
}
