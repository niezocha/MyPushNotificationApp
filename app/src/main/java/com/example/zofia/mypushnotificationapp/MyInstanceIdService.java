package com.example.zofia.mypushnotificationapp;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyInstanceIdService extends FirebaseInstanceIdService{

    public static final String TAG = "TOKEN_SERVICE";

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        sendRegistrationToService(refreshedToken);
    }

    private void  sendRegistrationToService(String refreshedToken){
    }
}
