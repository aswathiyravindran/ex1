package com.example.excercise1;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity 
{
	Button b;
	EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.bt);
        ed1=(EditText)findViewById(R.id.ed);
        
b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String data=ed1.getText().toString();
				
				
				Intent i=new Intent(MainActivity.this,SecondActivity.class);
				i.putExtra("username", data);
				startActivity(i);
        
				startActivity(i);
			}
		});
        
    }

       
}
