package com.example.dell.q_eats_orders;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Order> orderArrayList;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    public void onCreate(@androidx.annotation.Nullable Bundle savedInstanceState, @androidx.annotation.Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        orderArrayList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyler_view);


    }
public void setUpRecyclerViewAdapter()
{
recyclerViewAdapter=new RecyclerViewAdapter(orderArrayList,this);
recyclerView.setHasFixedSize(true);
recyclerView.setLayoutManager(new LinearLayoutManager());


}
}
