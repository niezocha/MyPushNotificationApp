package com.example.zofia.mypushnotificationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = FirebaseInstanceId.getInstance().getToken();

        Log.d("MY_FCM_TOKEN", s);
        // c88XdN0vY94:APA91bFA-GwcKh3TR9XiV1C9By_7YfgGE1ygxR_V4oF4UyaQtOsyzeL-flnnx36GVMHEoWXenLxwind7rmwIRHreXU4BskX6iBlG_owmCK8-CR5jvwDTUJImtG735m1TMxV9WqXJl4zj
    }
}
