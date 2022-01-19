package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.MainAdapter;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        refreshAdapter(10);

    }

    private void initViews() {
        context = this;
        recyclerView = findViewById(R.id.rv_main_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
    }

    private void refreshAdapter(int size) {
        MainAdapter adapter = new MainAdapter(context, size);
        recyclerView.setAdapter(adapter);
    }

}