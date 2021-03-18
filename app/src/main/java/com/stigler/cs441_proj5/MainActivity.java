package com.stigler.cs441_proj5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

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
    MediaPlayer mPlayer;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLabel = (TextView) findViewById(R.id.inputLabel);
        stopButton = (Button) findViewById(R.id.stopButton);


    }

    public void startPlaying(View view)
    {
        mPlayer = MediaPlayer.create(this, R.raw.testsong);
        mPlayer.start();
    }

    public void stopPlaying(View view)
    {
        mPlayer.stop();
    }
}