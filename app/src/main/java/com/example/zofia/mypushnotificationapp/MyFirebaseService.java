package com.example.zofia.mypushnotificationapp;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseService extends FirebaseMessagingService{

    private static final String TAG = "FirabaseService";
    private static final String NOTIFICATION_KEY = "notification_key";
    private AlarmManager alarmManager;
    private PendingIntent alarmIntent;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG, "wiadomość odebrana");

        String notificationString = remoteMessage.getNotification().getBody();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(NOTIFICATION_KEY, notificationString);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentInfo(notificationString)
                .setSmallIcon(R.drawable.ic_alarm)
                .setContentTitle(getString(R.string.my_super_notification))
                .setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(123, builder.build());
    }
}
