package org.akshanshgusain.killmonger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.akshanshgusain.killmonger.Adapters.MainAdapter;
import org.akshanshgusain.killmonger.Model.SingleHorizontal;
import org.akshanshgusain.killmonger.Model.SingleVertical;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
          private ArrayList<Object> objects=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.main_recyclerView);
        MainAdapter adapter = new MainAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<Object> getObject() {
        objects.add(getVerticalData().get(0));
        objects.add(getHorizontalData().get(0));
        return objects;
    }
    public static ArrayList<SingleVertical> getVerticalData() {
        ArrayList<SingleVertical> singleVerticals = new ArrayList<>();
        singleVerticals.add(new SingleVertical("Goku", "Kaame haame haaa....!!!!!", R.drawable.ic_launcher_foreground));
        singleVerticals.add(new SingleVertical("Vageta", "Biggg Bang haaaa....!!!!!", R.drawable.ic_launcher_foreground_dark));
        singleVerticals.add(new SingleVertical("Gohan", "Cell Saga.......!!!!!!", R.drawable.ic_launcher_foreground_dark2));
        singleVerticals.add(new SingleVertical("Goku", "Kaame haame haaa....!!!!!", R.drawable.ic_launcher_foreground));
        singleVerticals.add(new SingleVertical("Vageta", "Biggg Bang haaaa....!!!!!", R.drawable.ic_launcher_foreground_dark));
        singleVerticals.add(new SingleVertical("Gohan", "Cell Saga.......!!!!!!", R.drawable.ic_launcher_foreground_dark2));
        singleVerticals.add(new SingleVertical("Goku", "Kaame haame haaa....!!!!!", R.drawable.ic_launcher_foreground));
        singleVerticals.add(new SingleVertical("Vageta", "Biggg Bang haaaa....!!!!!", R.drawable.ic_launcher_foreground_dark));
        singleVerticals.add(new SingleVertical("Gohan", "Cell Saga.......!!!!!!", R.drawable.ic_launcher_foreground_dark2)); singleVerticals.add(new SingleVertical("Goku", "Kaame haame haaa....!!!!!", R.drawable.ic_launcher_foreground));
        singleVerticals.add(new SingleVertical("Vageta", "Biggg Bang haaaa....!!!!!", R.drawable.ic_launcher_foreground_dark));
        singleVerticals.add(new SingleVertical("Gohan", "Cell Saga.......!!!!!!", R.drawable.ic_launcher_foreground_dark2));

        return singleVerticals;
    }


    public static ArrayList<SingleHorizontal> getHorizontalData() {
        ArrayList<SingleHorizontal> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontal(R.mipmap.ic_launcher_round, "Naruto", "Rasenshureken", "2010/2/1"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.ic_launcher_round, "Sasuke", "Susano", "2010/2/1"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.ic_launcher_round, "Sakura", ",Tetsu", "2010/2/1"));
        return singleHorizontals;
    }


}
