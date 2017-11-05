package a07580542.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

import a07580542.listview.Adapter.AnimalListAdapter;
import a07580542.listview.Model.Animal;

import static android.media.CamcorderProfile.get;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private AnimalListAdapter adapter;
    //private ArrayList<Animal> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView)findViewById(R.id.listview);


        AnimalData.animallist.add(new Animal("แมว (Cat)",R.drawable.cat,getString(R.string.details_cat)));
        AnimalData.animallist.add(new Animal("หมา (Dog)",R.drawable.dog,getString(R.string.details_dog)));
        AnimalData.animallist.add(new Animal("โลมา (Dolphin)",R.drawable.dolphin,getString(R.string.details_dolphin)));
        AnimalData.animallist.add(new Animal("โคอาลา (Koala)",R.drawable.koala,getString(R.string.details_koala)));
        AnimalData.animallist.add(new Animal("สิงโต (Lion)",R.drawable.lion,getString(R.string.details_lion)));
        AnimalData.animallist.add(new Animal("นกฮูก (Owl)",R.drawable.owl,getString(R.string.details_owl)));
        AnimalData.animallist.add(new Animal("เพนกวิน (Penguin)",R.drawable.penguin,getString(R.string.details_penguin)));
        AnimalData.animallist.add(new Animal("หมู (Pig)",R.drawable.pig,getString(R.string.details_pig)));
        AnimalData.animallist.add(new Animal("กระต่าย (Rabbit)",R.drawable.rabbit,getString(R.string.details_rabbit)));
        AnimalData.animallist.add(new Animal("เสือ (Tiger)",R.drawable.tiger,getString(R.string.details_tiger)));

        adapter = new AnimalListAdapter(this,R.layout.item,AnimalData.animallist);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animal animal = AnimalData.animallist.get(position);
                Toast.makeText(MainActivity.this,animal.name,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,AnimalDetailsActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
                //intent.putExtra("name",animal.name);
                //intent.putExtra("picture",animal.picture);
            }
        });
        //ArrayAdapter<Animal> adepter = new ArrayAdapter<String>(this,R.layout.item,R.id.textView,data);
        //listview.setAdapter(adepter);
        /*listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String animal = data.get(position);
                Toast.makeText(MainActivity.this,animal, Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch(itemId){
            case R.id.action_add:
                addAnimal();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void addAnimal() {
        Animal a = new Animal("Snake",R.mipmap.ic_launcher,"xXxXxXxXxXXXXXxXxxXXxX");
        AnimalData.animallist.add(a);
        adapter.notifyDataSetChanged();
    }
}