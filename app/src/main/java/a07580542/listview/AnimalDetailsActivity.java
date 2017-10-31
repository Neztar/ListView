package a07580542.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import a07580542.listview.Model.Animal;

import static android.R.attr.name;

public class AnimalDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        ImageView animalimg = (ImageView)findViewById(R.id.animalImageView);
        TextView animalname = (TextView)findViewById(R.id.animalNameTextView);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position",0);
        AnimalData animaldata = AnimalData.getsInstance();
        Animal animal = animaldata.animallist.get(position);
        //String name = intent.getStringExtra("name");
        //int img = intent.getIntExtra("picture",0);
        
        animalname.setText(animal.detail);
        animalimg.setImageResource(animal.picture);
        getSupportActionBar().setTitle(animal.name);
    }
}
