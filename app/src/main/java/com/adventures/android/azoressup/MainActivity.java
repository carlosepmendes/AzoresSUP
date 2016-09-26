package com.adventures.android.azoressup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Using the src property on xml to load the images but they can be load like these
    //ImageView profilePhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //profilePhoto = (ImageView)findViewById(R.id.profilePhoto);

        //profilePhoto.setImageResource(R.drawable.top);

    }



}
