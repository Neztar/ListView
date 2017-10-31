package a07580542.listview;

import java.util.ArrayList;

import a07580542.listview.Model.Animal;

/**
 * Created by Dream on 29/10/2560.
 */

public class AnimalData {

    private static AnimalData sInstance;

    public ArrayList<Animal> animallist;

    public static AnimalData getsInstance(){
        if(sInstance==null){sInstance=new AnimalData();}
        return sInstance;
    }
}
