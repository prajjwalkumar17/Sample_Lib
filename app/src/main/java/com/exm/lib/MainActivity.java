package com.exm.lib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.exm.mylibrary.WebRTC.WebRTC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebRTC webRTC=new WebRTC();
        webRTC.toaster(getApplicationContext(),"hello this working correctly");
    }
}