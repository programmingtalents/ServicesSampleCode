package com.programmingtalents.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class MainActivity extends Activity implements OnClickListener{

    Button start,stop;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		start = (Button)findViewById(R.id.startService);
		stop = (Button)findViewById(R.id.stopService);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);

  }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.startService:   Intent start = new Intent(MainActivity.this, MyService.class);
                                       startService(start); //conCreate();
                                                        //OnStartCommand()
                                       break;


            case R.id.stopService:Intent stop = new Intent(MainActivity.this, MyService.class);
                                  stopService(stop);//onDestroy

        }
    }
}
