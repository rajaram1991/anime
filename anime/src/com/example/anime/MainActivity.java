package com.example.anime;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    Button ball = (Button) findViewById(R.id.ball);   
    ball.setOnClickListener((OnClickListener) this);

    Button wave = (Button) findViewById(R.id.ninepatch);   
    wave.setOnClickListener((OnClickListener) this);
   
    Button run = (Button) findViewById(R.id.RotateButton);   
    run.setOnClickListener((OnClickListener) this);
    
	}
	
	
	public void onClick(View view) {
		
	    switch (view.getId()) {
	    case R.id.ball:
	    	Intent intent = new Intent(MainActivity.this,SecondActivity.class);
	        startActivity(intent);
	    break;
	    case R.id.ninepatch:
	    	   	Intent intent1 = new Intent(MainActivity.this,ThirdActivity.class);
      startActivity(intent1);
            break;
	    case R.id.RotateButton:
    	   	Intent intent2 = new Intent(MainActivity.this,FourthActivity.class);
  startActivity(intent2);
  break;
	  }
	}
    ;
 }
 