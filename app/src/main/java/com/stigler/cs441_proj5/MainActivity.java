package com.stigler.cs441_proj5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
    TextView inputLabel;
    Button stopButton;
    Button startButton;
    Button DrunkenLull;
    Button Metro;
    Button WAP;
    Button FamousFriends;
    Button NGGYU;
    MediaPlayer mPlayer;
    int selectedSongMP3 = R.raw.silence;
    Button selectedSongButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLabel = (TextView) findViewById(R.id.inputLabel);
        stopButton = (Button) findViewById(R.id.stopButton);
        startButton = (Button) findViewById(R.id.startButton);
        selectedSongButton = (Button) findViewById(R.id.DrukenLullbies);
        DrunkenLull = (Button) findViewById(R.id.DrukenLullbies);
        Metro = (Button) findViewById(R.id.Metropolis);
        WAP = (Button) findViewById(R.id.WAP);
        FamousFriends = (Button) findViewById(R.id.famousFriends);
        NGGYU = (Button) findViewById(R.id.NGGYU);

        mPlayer = MediaPlayer.create(this, selectedSongMP3);


    }

    public void startPlaying(View view)
    {
        if (selectedSongMP3 != R.raw.silence)
        {
            mPlayer = MediaPlayer.create(this, selectedSongMP3);
            mPlayer.start();
            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    stopPlaying(stopButton);
                }
            });
        }
        else
        {
            inputLabel.setTextColor(Color.RED);
        }
    }

    public void stopPlaying(View view)
    {
        mPlayer.stop();
        selectedSongButton.setBackgroundColor(Color.BLUE);
        selectedSongButton.setTextColor(Color.WHITE);
        selectedSongMP3 = R.raw.silence;
    }

    public void setDL(View view)
    {
        mPlayer.stop();
        selectedSongButton.setBackgroundColor(Color.BLUE);
        selectedSongButton.setTextColor(Color.WHITE);
        inputLabel.setTextColor(Color.BLACK);
        selectedSongMP3 = R.raw.drunkenlullbies;
        selectedSongButton = DrunkenLull;
        DrunkenLull.setBackgroundColor(Color.YELLOW);
        DrunkenLull.setTextColor(Color.BLACK);
    }

    public void setMetro(View view)
    {
        mPlayer.stop();
        selectedSongButton.setBackgroundColor(Color.BLUE);
        selectedSongButton.setTextColor(Color.WHITE);
        inputLabel.setTextColor(Color.BLACK);
        selectedSongMP3 = R.raw.metropolis;
        selectedSongButton = Metro;
        Metro.setBackgroundColor(Color.YELLOW);
        Metro.setTextColor(Color.BLACK);
    }

    public void setWAP(View view)
    {
        mPlayer.stop();
        selectedSongButton.setBackgroundColor(Color.BLUE);
        selectedSongButton.setTextColor(Color.WHITE);
        inputLabel.setTextColor(Color.BLACK);
        selectedSongMP3 = R.raw.wap;
        selectedSongButton = WAP;
        WAP.setBackgroundColor(Color.YELLOW);
        WAP.setTextColor(Color.BLACK);
    }

    public void setTemp(View view)
    {
        mPlayer.stop();
        selectedSongButton.setBackgroundColor(Color.BLUE);
        selectedSongButton.setTextColor(Color.WHITE);
        inputLabel.setTextColor(Color.BLACK);
        selectedSongMP3 = R.raw.silence;
    }

    public void setFF(View view)
    {
        mPlayer.stop();
        selectedSongButton.setBackgroundColor(Color.BLUE);
        selectedSongButton.setTextColor(Color.WHITE);
        inputLabel.setTextColor(Color.BLACK);
        selectedSongMP3 = R.raw.famousfriends;
        selectedSongButton = FamousFriends;
        FamousFriends.setBackgroundColor(Color.YELLOW);
        FamousFriends.setTextColor(Color.BLACK);
    }

    public void setNGGYU(View view)
    {
        mPlayer.stop();
        selectedSongButton.setBackgroundColor(Color.BLUE);
        selectedSongButton.setTextColor(Color.WHITE);
        inputLabel.setTextColor(Color.BLACK);
        selectedSongMP3 = R.raw.nevergonnagiveyouup;
        selectedSongButton = NGGYU;
        NGGYU.setBackgroundColor(Color.YELLOW);
        NGGYU.setTextColor(Color.BLACK);
    }
}