package com.example.gurcharnsinghsikka.androidtest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemsAdapter extends BaseAdapter {

    LayoutInflater mInFlator;
    String[] items;
    String[] prices;
    String[] descriptions;

    public ItemsAdapter(Context c, String[] i, String[] p, String[] d) {
        this.items = i;
        this.prices = p;
        this.descriptions = d;
        this.mInFlator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i){
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInFlator.inflate(R.layout.list_view_details, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.name);
        TextView priceTextView = (TextView) v.findViewById(R.id.price);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.description);

        String name = items[i];
        String price = prices[i];
        String description = descriptions[i];

        nameTextView.setText(name);
        priceTextView.setText(price);
        descriptionTextView.setText(description);

        return v;
    }
}
