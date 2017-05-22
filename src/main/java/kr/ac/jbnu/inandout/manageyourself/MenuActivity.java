package kr.ac.jbnu.inandout.manageyourself;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rlwns on 2017-04-03.
 */

public class MenuActivity extends Activity {
    private TextView tvHello;
    private User user;
    SoundPool soundPool;
    int sound;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        sound = soundPool.load(this,R.raw.button,1);

    }

}
