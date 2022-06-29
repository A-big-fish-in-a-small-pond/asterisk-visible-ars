package com.example.asteriskfcm.utils.firebase;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.asteriskfcm.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private String CHANNEL_ID =  "junho";
    private String CHANNEL_NAME = "junho_name";


    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.d("NEW_TOKEN",s);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String url = remoteMessage.getData().get("url");
        Log.d("KIM", "Message data : " + url);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse(url);
        intent.setData(uri);startActivity(intent);

        // Notification
//        super.onMessageReceived(remoteMessage);
//        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(getApplicationContext());
//
//        NotificationCompat.Builder builder = null;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            if (notificationManager.getNotificationChannel(CHANNEL_ID) == null) {
//                NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
//                notificationManager.createNotificationChannel(channel);
//            }
//            builder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID);
//        }else {
//            builder = new NotificationCompat.Builder(getApplicationContext());
//        }
//
//        String title = remoteMessage.getNotification().getTitle();
//        String body = remoteMessage.getNotification().getBody();
//
//        builder.setContentTitle(title)
//                .setContentText(body)
//                .setSmallIcon(R.drawable.common_google_signin_btn_icon_dark);
//
//        Notification notification = builder.build();
//        notificationManager.notify(1, notification);
    }
}