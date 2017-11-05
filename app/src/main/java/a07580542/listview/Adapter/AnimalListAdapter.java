package a07580542.listview.Adapter;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import a07580542.listview.Model.Animal;
import a07580542.listview.R;

/**
 * Created by Dream on 29/10/2560.
 */

public class AnimalListAdapter extends ArrayAdapter<Animal>{

    private Context context;
    private ArrayList<Animal> animalList;
    private int layoutResId;

    public AnimalListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Animal> objects) {
        super(context, resource, objects);
        this.context=context;
        this.layoutResId=resource;
        this.animalList=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        //View v = inflater.inflate(layoutResId,null);
        View v = convertView;
        if(v==null){v=inflater.inflate(layoutResId,null);}
        ImageView iv = (ImageView) v.findViewById(R.id.imageView);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        Animal animal = animalList.get(position);
        iv.setImageResource(animal.picture);
        tv.setText(animal.name);
        return v;
    }
}
