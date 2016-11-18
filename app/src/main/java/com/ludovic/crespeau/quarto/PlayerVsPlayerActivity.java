package com.ludovic.crespeau.quarto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by crespeau on 16/11/2016.
 */

public class PlayerVsPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.player_activity);
        ButterKnife.bind(this);
    }
}
