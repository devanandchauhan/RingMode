package com.devanand.ringmode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Activity","MainActivity");

        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_CALL);
        registerReceiver(new MyReceiver(), intentFilter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Activity","OnDestroy");
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_CALL);
        registerReceiver(new MyReceiver(), intentFilter);
    }

    //    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP){
//            Toast.makeText(this, "Volume Up", Toast.LENGTH_LONG).show();
//            return true;
//        }
//
//        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN){
//            Toast.makeText(this, "Volume Down", Toast.LENGTH_LONG).show();
//            return true;
//        }
//
//        return super.onKeyDown(keyCode, event);
//    }

//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//        int action = event.getAction();
//        int keyCode = event.getKeyCode();
//        switch (keyCode) {
//            case KeyEvent.KEYCODE_VOLUME_UP:
//                if (action == KeyEvent.ACTION_UP) {
//                    //TODO
//                    Toast.makeText(this, "Volume Up", Toast.LENGTH_LONG).show();
//                }
//                return true;
//            case KeyEvent.KEYCODE_VOLUME_DOWN:
//                if (action == KeyEvent.ACTION_DOWN) {
//                    //TODO
//                    Toast.makeText(this, "Volume Down", Toast.LENGTH_LONG).show();
//                }
//                return true;
//
//            case KeyEvent.KEYCODE_MUTE:
//                if (action == KeyEvent.KEYCODE_VOLUME_MUTE) {
//                    //TODO
//                    Toast.makeText(this, "Mute", Toast.LENGTH_LONG).show();
//                }
//                return true;
//            default:
//                return super.dispatchKeyEvent(event);
//        }
//    }
}