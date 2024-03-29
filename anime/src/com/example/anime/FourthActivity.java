package com.example.anime;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
 
public class FourthActivity extends Activity {
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthpage);
        final Button rotatingButton = (Button) findViewById(R.id.rotatingButton);
        SeekBar seekBar;
        seekBar = (SeekBar) findViewById(R.id.translationX);
        seekBar.setMax(400);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
 
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
 
            public void onProgressChanged(SeekBar seekBar, int progress,
                    boolean fromUser) {
                rotatingButton.setTranslationX((float)progress);
            }
        });
        seekBar = (SeekBar) findViewById(R.id.translationY);
        seekBar.setMax(800);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
 
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
 
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
 
            public void onProgressChanged(SeekBar seekBar, int progress,
                    boolean fromUser) {
                rotatingButton.setTranslationY((float)progress);
            }
        });
        seekBar = (SeekBar) findViewById(R.id.scaleX);
        seekBar.setMax(50);
        seekBar.setProgress(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
 
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
 
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
 
            public void onProgressChanged(SeekBar seekBar, int progress,
                    boolean fromUser) {
                rotatingButton.setScaleX((float)progress/10f);
            }
        });
        seekBar = (SeekBar) findViewById(R.id.scaleY);
        seekBar.setMax(50);
        seekBar.setProgress(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
 
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
 
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
 
            public void onProgressChanged(SeekBar seekBar, int progress,
                    boolean fromUser) {
                rotatingButton.setScaleY((float)progress/10f);
            }
        });
        seekBar = (SeekBar) findViewById(R.id.rotationX);
        seekBar.setMax(360);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
 
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
 
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
 
            public void onProgressChanged(SeekBar seekBar, int progress,
                    boolean fromUser) {
                rotatingButton.setRotationX((float)progress);
            }
        });
        seekBar = (SeekBar) findViewById(R.id.rotationY);
        seekBar.setMax(360);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
 
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
 
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
 
            public void onProgressChanged(SeekBar seekBar, int progress,
                    boolean fromUser) {
                rotatingButton.setRotationY((float)progress);
            }
        });
        seekBar = (SeekBar) findViewById(R.id.rotationZ);
        seekBar.setMax(360);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
 
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
 
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
 
            public void onProgressChanged(SeekBar seekBar, int progress,
                    boolean fromUser) {
                rotatingButton.setRotation((float)progress);
            }
        });
    }
}