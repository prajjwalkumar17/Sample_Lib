package com.exm.mylibrary.WebRTC;

import android.content.Context;
import android.widget.Toast;

public class WebRTC {

    public void toaster(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();


    }


}
