package com.diam.recycler_view_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private ArrayList<String> titleText = new ArrayList<>();
    private ArrayList<String> subTitleText = new ArrayList<>();
    private ArrayList<Integer> image = new ArrayList<>();

    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        titleText.add("Le chat 1");
        titleText.add("Le chat 2");
        titleText.add("Le chat 3");
        titleText.add("Le chat 4");
        titleText.add("Le chat 5");
        titleText.add("Le chat 6");

        subTitleText.add("Description 1");
        subTitleText.add("Description 2");
        subTitleText.add("Description 3");
        subTitleText.add("Description 4");
        subTitleText.add("Description 5");
        subTitleText.add("Description 6");

        image.add(R.drawable.cat_im_1);
        image.add(R.drawable.cat_im_2);
        image.add(R.drawable.cat_im_3);
        image.add(R.drawable.cat_im_4);
        image.add(R.drawable.cat_im_5);
        image.add(R.drawable.cat_im_6);

        adapter = new RecyclerAdapter(titleText, subTitleText, image, MainActivity.this);

        recyclerView.setAdapter(adapter);
    }
}