package com.example.excercise1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity{

	TextView result1,result2,result3;
	
	protected void onCreate(Bundle  savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		result1=(TextView)findViewById(R.id.tv1);
		result2=(TextView)findViewById(R.id.tv2);
		result3=(TextView)findViewById(R.id.tv3);
		
		 Typeface custom_font=Typeface.createFromAsset(getAssets(), "AlexBrush-Regular.ttf");
		 Typeface custom_font1=Typeface.createFromAsset(getAssets(), "Amatic-Bold.ttf");
		 Typeface custom_font2=Typeface.createFromAsset(getAssets(), "BEBAS__.ttf");
		Intent i=getIntent();
		String data_main= i.getStringExtra("username");
		result1.setTypeface(custom_font);
		result1.setText("Hello"+data_main);
		result2.setTypeface(custom_font1);
		result2.setText("How are you"+data_main);
		result3.setTypeface(custom_font2);
		result3.setText("Wish u good day "+data_main);
	}
}
