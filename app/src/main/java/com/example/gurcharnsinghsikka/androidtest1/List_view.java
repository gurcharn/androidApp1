package com.example.gurcharnsinghsikka.androidtest1;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class List_view extends AppCompatActivity {

    ListView listView;
    String[] items;
    String[] prices;
    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

            Resources res = getResources();
            listView = (ListView) findViewById(R.id.listView);
            items = res.getStringArray(R.array.items);
            prices = res.getStringArray(R.array.prices);
            descriptions = res.getStringArray(R.array.descriptions);

            ItemsAdapter itemsAdapter = new ItemsAdapter(this, items, prices, descriptions);
            listView.setAdapter(itemsAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent showDetailActivity = new Intent(getApplicationContext(), ItemDetails.class);
                    showDetailActivity.putExtra("com.example.gurcharnsinghsikka.ITEM_INDEX", i);
                    startActivity(showDetailActivity);
                }
            });
        }
}
