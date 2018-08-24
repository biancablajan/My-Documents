package me.licenta.mydocuments;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class DisplayClickedImage extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayclickedimage);

        String imagePath = getIntent().getStringExtra("ClickedImagePath"); //get image path from post activity
        if (imagePath != null) {
            File imgFile = new File(imagePath);
            if (imgFile.exists()) {

                Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());

                ImageView myImage = (ImageView) findViewById(R.id.imageViewDocument);
                myImage.setImageBitmap(myBitmap);

            }

        }



    }
}
