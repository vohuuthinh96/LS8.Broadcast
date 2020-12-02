package com.atoproduction.ls8broadcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Broadcast broadcast;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend = findViewById(R.id.btn_send);
        broadcast = new Broadcast();

//        IntentFilter screenStateFilter = new IntentFilter();
//        screenStateFilter.addAction(Intent.ACTION_SCREEN_ON);
//        registerReceiver(broadcast, screenStateFilter);

//        IntentFilter screenStateFilter = new IntentFilter();
//        screenStateFilter.addAction("action_thinhvh");
//        registerReceiver(broadcast, screenStateFilter);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("action_thinhvh");
                intent.putExtra("data",new Random().nextInt(100));
                LocalBroadcastManager.getInstance(MainActivity.this).sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LocalBroadcastManager.getInstance(MainActivity.this).unregisterReceiver(broadcast);
    }
}