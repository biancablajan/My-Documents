package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class DisplayClickedImage extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayclickedimage);

        final String imagePath = getIntent().getStringExtra("ClickedImagePath"); //get image path from post activity
        if (imagePath != null) {
             File imgFile = new File(imagePath);
            if (imgFile.exists()) {

                Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());

                ImageView myImage = (ImageView) findViewById(R.id.imageViewDocument);
                myImage.setImageBitmap(myBitmap);

            }

        }
        //Removes the displayed file and returns to previous Activity (View)
        final Button buttonRemove = (Button) findViewById(R.id.buttonRemove);
        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        File file = new File(imagePath);
                        file.delete();
                        DisplayClickedImage.super.onBackPressed();
                    }
                },3000);
            }
        });

    }


}
