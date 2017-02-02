package firstapp.gsisp.admin.services;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{

    Button start,stop;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		start = (Button)findViewById(R.id.startService);
		stop = (Button)findViewById(R.id.stopService);


        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, MyService.class);
                startService(i); //conCreate();
                //OnStartCommand()
            }
        });

		stop.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, MyService.class);
                stopService(i);//onDestroy
            }
        });

    }
}
