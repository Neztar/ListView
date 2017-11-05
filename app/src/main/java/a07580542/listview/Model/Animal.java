package a07580542.listview.Model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Dream on 29/10/2560.
 */

public class Animal {
    public String name;
    public String picture;
    public String detail;

    public Animal(String name, String picture,String detail) {
        this.name = name;
        this.picture = picture;
        this.detail=detail;
    }
    public Drawable getPictureDrawable(Context context){
        AssetManager am = context.getAssets();
        try {
            InputStream stream = am.open(picture);
            Drawable drawable = Drawable.createFromStream(stream,"");
            return drawable;
        } catch (IOException e) {
            Log.e("Animal","Error opening file"+picture);
            e.printStackTrace();
            return null;
        }
    }
}
