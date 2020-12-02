package com.atoproduction.ls8broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by : Thinhvh on 11/27/2020
 * Phone      : 0962890153 - 0398477967
 * Facebook   : https://www.facebook.com/thinh.super22
 * Skype      : https://join.skype.com/invite/fvfRTDLcGPJN
 * Mail       : thinhvhph04204@gmail.com
 */
public class Broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Da nhan duoc su kien "+intent.getAction(), Toast.LENGTH_SHORT).show();
        Log.d("thinhvh", "onReceive: ");
    }
}
