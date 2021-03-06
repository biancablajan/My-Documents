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
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

import java.io.File;

public class DisplayClickedImage extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayclickedimage);

        final String imagePath = getIntent().getStringExtra("ClickedImagePath"); //get image path from post activity
        if (imagePath != null) {
            final File imgFile = new File(imagePath);
            if (imgFile.exists()) {

                final Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());

                ImageView myImage = (ImageView) findViewById(R.id.imageViewDocument);
                myImage.setImageBitmap(myBitmap);

                //create Alert Dialog when clicked on the image so it can be zoomed
                myImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new Handler().post(new Runnable() {
                            @Override
                            public void run() {
                                AlertDialog.Builder mBuilder = new AlertDialog.Builder(DisplayClickedImage.this);
                                View mView = getLayoutInflater().inflate(R.layout.pinch_displayedimage, null);
                                PhotoView photoView = mView.findViewById(R.id.imageView);
                                photoView.setImageBitmap(myBitmap);
                                mBuilder.setView(mView);
                                AlertDialog mDialog = mBuilder.create();
                                mDialog.show();
                            }
                        });
                        }
                });
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
