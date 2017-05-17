package com.example.seele.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.seele.adapter.FruitAdapter;
import com.example.seele.bean.Fruit;
import com.example.seele.uiwidgettest.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruit();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置RecyclerView的滑动方向
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruit() {
        Fruit fruit1 = new Fruit("1",R.mipmap.ic_launcher);
        Fruit fruit2 = new Fruit("2",R.mipmap.ic_launcher);
        Fruit fruit3 = new Fruit("3",R.mipmap.ic_launcher);
        Fruit fruit4 = new Fruit("4",R.mipmap.ic_launcher);
        Fruit fruit5 = new Fruit("5",R.mipmap.ic_launcher);
        Fruit fruit6 = new Fruit("6",R.mipmap.ic_launcher);
        Fruit fruit7 = new Fruit("7",R.mipmap.ic_launcher);
        Fruit fruit8 = new Fruit("9",R.mipmap.ic_launcher);
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);
        fruitList.add(fruit5);
        fruitList.add(fruit6);
        fruitList.add(fruit7);
        fruitList.add(fruit8);




    }
}
