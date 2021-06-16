package edu.rit.sugandha.multimedia;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;

public class OnSetTimeReciver1 extends BroadcastReceiver {
    String tag=OnSetTimeReciver1.class.getName();
    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer mediaPlayer=MediaPlayer.create(context, R.raw.tuesday);
        mediaPlayer.start();
        //  Log.e(tag,"The BroadcastReceiver is Triggered");
        // Toast.makeText(context,"OnSetTimeReceiver is Called...",Toast.LENGTH_LONG).show();



    }
}
