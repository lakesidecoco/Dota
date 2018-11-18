package com.example.jingjing.dota;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class TavernActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ivAvatarOfHero1:  heroId = 1; break;
            case R.id.ivAvatarOfHero2:  heroId = 2; break;
            case R.id.ivAvatarOfHero3:  heroId = 3; break;
            case R.id.ivAvatarOfHero4:  heroId = 4; break;
            case R.id.ivAvatarOfHero5:  heroId = 5; break;
            case R.id.ivAvatarOfHero6:  heroId = 6; break;
            case R.id.ivAvatarOfHero7:  heroId = 7; break;
            case R.id.ivAvatarOfHero8:  heroId = 8; break;
            case R.id.ivAvatarOfHero9:  heroId = 9; break;
            case R.id.ivAvatarOfHero10:  heroId = 10; break;
            case R.id.ivAvatarOfHero11:  heroId = 11; break;
            case R.id.ivAvatarOfHero12:  heroId = 12; break;
        }
        Intent intent = new Intent(this,HeroActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("tavernId",getIntent().getExtras().getInt("tavernId"));
        bundle.putInt("heroId",heroId);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    int heroId;
    Bitmap bmHero1;
    Bitmap bmHero2;
    Bitmap bmHero3;
    Bitmap bmHero4;
    Bitmap bmHero5;
    Bitmap bmHero6;
    Bitmap bmHero7;
    Bitmap bmHero8;
    Bitmap bmHero9;
    Bitmap bmHero10;
    Bitmap bmHero11;
    Bitmap bmHero12;
    Bitmap [] bmHeros;
    ImageView hero1;
    ImageView hero2;
    ImageView hero3;
    ImageView hero4;
    ImageView hero5;
    ImageView hero6;
    ImageView hero7;
    ImageView hero8;
    ImageView hero9;
    ImageView hero10;
    ImageView hero11;
    ImageView hero12;
    TextView tvNameOfTavern;

    int tavernId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tavern);
        hero1 = (ImageView)findViewById(R.id.ivAvatarOfHero1);
        hero2 = (ImageView)findViewById(R.id.ivAvatarOfHero2);
        hero3 = (ImageView)findViewById(R.id.ivAvatarOfHero3);
        hero4 = (ImageView)findViewById(R.id.ivAvatarOfHero4);
        hero5 = (ImageView)findViewById(R.id.ivAvatarOfHero5);
        hero6 = (ImageView)findViewById(R.id.ivAvatarOfHero6);
        hero7 = (ImageView)findViewById(R.id.ivAvatarOfHero7);
        hero8 = (ImageView)findViewById(R.id.ivAvatarOfHero8);
        hero9 = (ImageView)findViewById(R.id.ivAvatarOfHero9);
        hero10 = (ImageView)findViewById(R.id.ivAvatarOfHero10);
        hero11 = (ImageView)findViewById(R.id.ivAvatarOfHero11);
        hero12 = (ImageView)findViewById(R.id.ivAvatarOfHero12);
        tvNameOfTavern = (TextView)findViewById(R.id.tvNameOfTavern);
        ImageView [] arrayOfHeroAvatar = new ImageView[12];
        arrayOfHeroAvatar[0] = hero1;
        arrayOfHeroAvatar[1] = hero2;
        arrayOfHeroAvatar[2] = hero3;
        arrayOfHeroAvatar[3] = hero4;
        arrayOfHeroAvatar[4] = hero5;
        arrayOfHeroAvatar[5] = hero6;
        arrayOfHeroAvatar[6] = hero7;
        arrayOfHeroAvatar[7] = hero8;
        arrayOfHeroAvatar[8] = hero9;
        arrayOfHeroAvatar[9] = hero10;
        arrayOfHeroAvatar[10] = hero11;
        arrayOfHeroAvatar[11] = hero12;

        bmHeros = new Bitmap[12];
        bmHeros[0] = bmHero1;
        bmHeros[1] = bmHero2;
        bmHeros[2] = bmHero3;
        bmHeros[3] = bmHero4;
        bmHeros[4] = bmHero5;
        bmHeros[5] = bmHero6;
        bmHeros[6] = bmHero7;
        bmHeros[7] = bmHero8;
        bmHeros[8] = bmHero9;
        bmHeros[9] = bmHero10;
        bmHeros[10] = bmHero11;
        bmHeros[11] = bmHero12;

        tavernId = getIntent().getExtras().getInt("tavernId");
        switch (tavernId){
            case 1:
                tvNameOfTavern.setText("力量（近卫军团—1");
                tvNameOfTavern.setTextColor(FFFFFF);
                break;
            case 2:
                tvNameOfTavern.setText("力量（近卫军团—2");
                tvNameOfTavern.setTextColor(FFFFFF);
                break;
            case 3:
                tvNameOfTavern.setText("力量（天灾军团—1");
                tvNameOfTavern.setTextColor(FFFFFF);
                break;
            case 4:
                tvNameOfTavern.setText("力量（天灾军团—2");
                tvNameOfTavern.setTextColor(FFFFFF);
                break;
            case 5:
                tvNameOfTavern.setText("敏捷（近卫军团—1");
                tvNameOfTavern.setTextColor(16711936);
                break;
            case 6:
                tvNameOfTavern.setText("敏捷（近卫军团—2");
                tvNameOfTavern.setTextColor(16711936);
                break;
            case 7:
                tvNameOfTavern.setText("敏捷（天灾军团—1");
                tvNameOfTavern.setTextColor(16711936);
                break;
            case 8:
                tvNameOfTavern.setText("敏捷（天灾军团—2");
                tvNameOfTavern.setTextColor(16711936);
                break;
            case 9:
                tvNameOfTavern.setText("智力（近卫军团—1");
                tvNameOfTavern.setTextColor(16776961);
                break;
            case 10:
                tvNameOfTavern.setText("智力（近卫军团—2");
                tvNameOfTavern.setTextColor(FFFFFF);
                break;
            case 11:
                tvNameOfTavern.setText("智力（天灾军团—1");
                tvNameOfTavern.setTextColor(FFFFFF);
                break;
            case 12:
                tvNameOfTavern.setText("智力（天灾军团—2");
                tvNameOfTavern.setTextColor(FFFFFF);
                break;
            default:
        }
        for(int i =0;i<bmHeros.length;i++){
            try {
                bmHeros[i] = BitmapFactory.decodeStream(getAssets().open("taverns/"+getIntent().
                        getExtras().getInt("tavernId")+"/"+i+"/h.gif"));
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    bmHeros[i] = BitmapFactory.decodeStream(getAssets().open("taverns/"+getIntent().
                            getExtras().getInt("tavernId")+"/"+i+"/h.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

            arrayOfHeroAvatar[i].setImageBitmap(bmHeros[i]);
            arrayOfHeroAvatar[i].setOnClickListener(this);
        }
    }
}
