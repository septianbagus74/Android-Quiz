package com.septianapp.androidquiz.CustomListView;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.septianapp.androidquiz.R;


/**
 * Created by septian.bagus on 8/22/2017.
 */

public class CustomListScience extends ArrayAdapter {
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public CustomListScience(Activity context,
                             String[] web, Integer[] imageId) {
        super(context, R.layout.list_science, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_science, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
