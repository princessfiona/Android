package com.example.helloworld;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
 
public class ButtonAction implements OnClickListener {
 
	TextView btnLocalText;
	
	public ButtonAction(TextView tv){
		super();
		btnLocalText = tv;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		btnLocalText.setText("Greetings from ButtonAction");
 
	}
 
}