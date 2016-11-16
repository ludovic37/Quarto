package com.ludovic.crespeau.quarto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by crespeau on 16/11/2016.
 */

public class RegleActivity extends AppCompatActivity {

    @OnClick(R.id.textViewBack)
    public void back() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regle_activity);
        ButterKnife.bind(this);
    }
}
