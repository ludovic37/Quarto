package com.ludovic.crespeau.quarto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.pvp)
    public void pvp(){
        //startActivity(new Intent(MainActivity.this,PlayerVsPlayerActivity.class));
        //TODO
        Toast.makeText(this,"Actuelement en développement",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.pva)
    public void pva(){
        //startActivity(new Intent(MainActivity.this,PvAIActivity.class));
        //TODO
        Toast.makeText(this,"Prochainement",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.regle)
    public void regle(){
        startActivity(new Intent(MainActivity.this,RegleActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
