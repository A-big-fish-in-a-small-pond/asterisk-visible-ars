package com.example.asteriskfcm.utils.alarm;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

public class WakeLockUp {
    private static final String WAKELOCK_TAG = "testous:wakelock";


    public static void accireCpuWakeLock(Context context) {
        PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        @SuppressLint("InvalidWakeLockTag")
        PowerManager.WakeLock wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, WAKELOCK_TAG);
        wakeLock.acquire();
    }

}
