package com.example.anime;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;

import android.view.ViewGroup;

import android.widget.LinearLayout;

import android.widget.SeekBar;
public class ThirdActivity extends Activity {
SeekBar horizontal = null;
SeekBar vertical = null;
View thingToResize = null;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.thirdpage);
thingToResize = findViewById(R.id.resize);
horizontal = (SeekBar) findViewById(R.id.horizontal);
vertical = (SeekBar) findViewById(R.id.vertical);
horizontal.setMax(176); // 240 less 64 starting size
vertical.setMax(176); // keep it square @ max
horizontal.setOnSeekBarChangeListener(h);
vertical.setOnSeekBarChangeListener(v);
}
SeekBar.OnSeekBarChangeListener h = new SeekBar.OnSeekBarChangeListener() {
public void onProgressChanged(SeekBar seekBar, int progress,
boolean fromTouch) {
ViewGroup.LayoutParams old = thingToResize.getLayoutParams();
ViewGroup.LayoutParams current = new LinearLayout.LayoutParams(
64 + progress, old.height);
thingToResize.setLayoutParams(current);
}
public void onStartTrackingTouch(SeekBar seekBar) {
// unused
}
public void onStopTrackingTouch(SeekBar seekBar) {
// unused
}
};
SeekBar.OnSeekBarChangeListener v = new SeekBar.OnSeekBarChangeListener() {
public void onProgressChanged(SeekBar seekBar, int progress,
boolean fromTouch) {
ViewGroup.LayoutParams old = thingToResize.getLayoutParams();
ViewGroup.LayoutParams current = new LinearLayout.LayoutParams(old.width, 64 + progress);
thingToResize.setLayoutParams(current);
}
public void onStartTrackingTouch(SeekBar seekBar) {
// unused
}
public void onStopTrackingTouch(SeekBar seekBar) {
// unused
}
};
}