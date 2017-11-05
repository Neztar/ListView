package a07580542.listview.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import a07580542.listview.R;

/**
 * Created by Dream on 5/11/2560.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String Database_Name="Animal.db";
    private static final int Database_Version=1;

    public static final String Table_Name="Animal";
    public static final String Col_Id="_id";
    public static final String Col_Name="name";
    public static final String Col_Picture="picture";
    public static final String Col_Details="details";

    public static final String sql_create_table="create table "+Table_Name+ "("
            +Col_Id+" Integer Primary Key Autoincrement,"
            +Col_Name+" text,"
            +Col_Picture+" text,"
            +Col_Details+" text)";

    private Context context;
    public DatabaseHelper(Context context) {
        super(context,Database_Name , null, Database_Version);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql_create_table);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(Col_Name,"แมว (Cat)");
        cv.put(Col_Picture,"cat.png");
        cv.put(Col_Details,context.getString(R.string.details_cat));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"หมา (Dog)");
        cv.put(Col_Picture,"dog.png");
        cv.put(Col_Details,context.getString(R.string.details_dog));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"โลมา (Dolphin)");
        cv.put(Col_Picture,"dolphin.png");
        cv.put(Col_Details,context.getString(R.string.details_dolphin));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"โคอาลา (Koala)");
        cv.put(Col_Picture,"koala.png");
        cv.put(Col_Details,context.getString(R.string.details_koala));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"สิงโต (Lion)");
        cv.put(Col_Picture,"lion.png");
        cv.put(Col_Details,context.getString(R.string.details_lion));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"นกฮุก (Owl)");
        cv.put(Col_Picture,"owl.png");
        cv.put(Col_Details,context.getString(R.string.details_owl));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"เพนกวิน (Penguin)");
        cv.put(Col_Picture,"penguin.png");
        cv.put(Col_Details,context.getString(R.string.details_penguin));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"หมู (Pig)");
        cv.put(Col_Picture,"pig.png");
        cv.put(Col_Details,context.getString(R.string.details_pig));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"กระต่าย (Rabbit)");
        cv.put(Col_Picture,"rabbit.png");
        cv.put(Col_Details,context.getString(R.string.details_rabbit));
        db.insert(Table_Name,null,cv);

        cv = new ContentValues();
        cv.put(Col_Name,"เสือ (Tiger)");
        cv.put(Col_Picture,"tiger.png");
        cv.put(Col_Details,context.getString(R.string.details_tiger));
        db.insert(Table_Name,null,cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
