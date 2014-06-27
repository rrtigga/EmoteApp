package com.Berota.Emote;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Spicycurryman on 6/26/14.
 */
public class RecordActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_record);


    }
}
