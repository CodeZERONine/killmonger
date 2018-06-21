package org.akshanshgusain.killmonger.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.akshanshgusain.killmonger.Model.SingleHorizontal;
import org.akshanshgusain.killmonger.Model.SingleVertical;
import org.akshanshgusain.killmonger.R;

import java.util.ArrayList;

import static org.akshanshgusain.killmonger.MainActivity.getHorizontalData;
import static org.akshanshgusain.killmonger.MainActivity.getVerticalData;

public class MainAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
     private ArrayList<Object> mObjectList=new ArrayList<>();
     private Context mContext;
     private static final int VERTICAL=1;
     private static final int HORIZONTAL=2;

    //Constructor
    public MainAdapter(Context mContext, ArrayList<Object> mObjectList) {
    this.mContext=mContext;
    this.mObjectList=mObjectList;
    }

    //Methods
    @Override
    public int getItemViewType(int position) {
            if(mObjectList.get(position) instanceof SingleHorizontal)
                return HORIZONTAL;
            if(mObjectList.get(position) instanceof SingleVertical)
                return VERTICAL;
            return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mLayoutInflater=LayoutInflater.from(parent.getContext());
        View mView;
         RecyclerView.ViewHolder mViewHolderObject;
         switch(viewType){
             case VERTICAL:
                 mView=mLayoutInflater.inflate(R.layout.vertical,parent,false);
                 mViewHolderObject=new ViewHolderVerticalView(mView);
                 return mViewHolderObject;
             case HORIZONTAL:
                 mView=mLayoutInflater.inflate(R.layout.horizontal,parent,false);
                 mViewHolderObject=new ViewHolderHorizontalView(mView);
                 return mViewHolderObject;
             default:HORIZONTAL :
             mView=mLayoutInflater.inflate(R.layout.horizontal,parent,false);
                 mViewHolderObject=new ViewHolderHorizontalView(mView);
                 return mViewHolderObject;
         }

    }//End of OnCreate ViewHolder

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
              if(holder.getItemViewType()==VERTICAL)
                    verticalView((ViewHolderVerticalView)holder);
              else if(holder.getItemViewType()==HORIZONTAL)
                    horizontalView((ViewHolderHorizontalView)holder);
    }//End of onBindViewHolder


    private void verticalView(ViewHolderVerticalView holder) {
        VerticalAdapter adapter1 = new VerticalAdapter(getVerticalData());
        holder.mVerticalRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        holder.mVerticalRecyclerView.setAdapter(adapter1);
    }

    private void horizontalView(ViewHolderHorizontalView holder) {
        HorizontalAdapter adapter = new HorizontalAdapter(getHorizontalData());
        holder.mHorizontalRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        holder.mHorizontalRecyclerView.setAdapter(adapter);
    }


    @Override
    public int getItemCount() {
        return mObjectList.size();
    }

    //View Holder For HorizontalView
     public class ViewHolderHorizontalView extends RecyclerView.ViewHolder{
        private  RecyclerView mHorizontalRecyclerView;
        public ViewHolderHorizontalView(View itemView) {
            super(itemView);
            mHorizontalRecyclerView=(RecyclerView)itemView.findViewById(R.id.horizontal_recyclerView);
        }
    }
    //View Holder For VerticalView
    public class ViewHolderVerticalView extends RecyclerView.ViewHolder{
        private RecyclerView mVerticalRecyclerView;
        public ViewHolderVerticalView(View itemView) {
            super(itemView);
            mVerticalRecyclerView=(RecyclerView)itemView.findViewById(R.id.vertical_recyclerView);
        }
    }


}
