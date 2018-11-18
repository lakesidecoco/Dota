package com.example.jingjing.dota;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TavernsActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tavern1:  tavernId = 1;   break;
            case R.id.tavern2:  tavernId = 2;   break;
            case R.id.tavern3:  tavernId = 3;   break;
            case R.id.tavern4:  tavernId = 4;   break;
            case R.id.tavern5:  tavernId = 5;   break;
            case R.id.tavern6:  tavernId = 6;   break;
            case R.id.tavern7:  tavernId = 7;   break;
            case R.id.tavern8:  tavernId = 8;   break;
            case R.id.tavern9:  tavernId = 9;   break;
            case R.id.tavern10:  tavernId = 10;   break;
            case R.id.tavern11:  tavernId = 11;   break;
            case R.id.tavern12:  tavernId = 12;   break;
            default:    break;
        }
        Intent intent = new Intent(this,TavernActivity.class);
        intent.putExtra("tavernId",tavernId);
        startActivity(intent);
    }

    int tavernId;
    ImageView tavern1;
    ImageView tavern2;
    ImageView tavern3;
    ImageView tavern4;
    ImageView tavern5;
    ImageView tavern6;
    ImageView tavern7;
    ImageView tavern8;
    ImageView tavern9;
    ImageView tavern10;
    ImageView tavern11;
    ImageView tavern12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taverns);
        tavern1 = (ImageView)findViewById(R.id.tavern1);
        tavern2 = (ImageView)findViewById(R.id.tavern2);
        tavern3 = (ImageView)findViewById(R.id.tavern3);
        tavern4 = (ImageView)findViewById(R.id.tavern4);
        tavern5 = (ImageView)findViewById(R.id.tavern5);
        tavern6 = (ImageView)findViewById(R.id.tavern6);
        tavern7 = (ImageView)findViewById(R.id.tavern7);
        tavern8 = (ImageView)findViewById(R.id.tavern8);
        tavern9 = (ImageView)findViewById(R.id.tavern9);
        tavern10 = (ImageView)findViewById(R.id.tavern10);
        tavern11 = (ImageView)findViewById(R.id.tavern11);
        tavern12 = (ImageView)findViewById(R.id.tavern12);

        tavern1.setOnClickListener(this);
        tavern2.setOnClickListener(this);
        tavern3.setOnClickListener(this);
        tavern4.setOnClickListener(this);
        tavern5.setOnClickListener(this);
        tavern6.setOnClickListener(this);
        tavern7.setOnClickListener(this);
        tavern8.setOnClickListener(this);
        tavern9.setOnClickListener(this);
        tavern10.setOnClickListener(this);
        tavern11.setOnClickListener(this);
        tavern12.setOnClickListener(this);




    }
}
