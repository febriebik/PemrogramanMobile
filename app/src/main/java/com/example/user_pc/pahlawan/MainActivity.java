package com.example.user_pc.pahlawan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Pahlawan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(PahlawanData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListPahlawanAdapter listPresidentAdapter = new ListPahlawanAdapter(this);
        listPresidentAdapter.setListPahlawan(list);
        rvCategory.setAdapter(listPresidentAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    private void showRecyclerGrid() {
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridPahlawanAdapter gridPahlawanAdapter = new GridPahlawanAdapter(this);
        gridPahlawanAdapter.setListPahlawan(list);
        rvCategory.setAdapter(gridPahlawanAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_grid:
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewPahlawanAdapter cardViewPahlawanAdapter = new CardViewPahlawanAdapter(this);
        cardViewPahlawanAdapter.setListPahlawan(list);
        rvCategory.setAdapter(cardViewPahlawanAdapter);
    }
}