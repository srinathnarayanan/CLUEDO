package coms.whodunnit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;




import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	String from;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void CreateHost(View view) 
	{
	    Intent intent = new Intent(MainActivity.this, EnterName.class);
	    intent.putExtra("from", "host");
	    startActivity(intent);
	}
	public void JoinHost(View view) 
	{
		WifiManager wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);    
           if(wifiManager.isWifiEnabled()==false)
           {
        	   Toast.makeText(this,"please ensure that your wifi is turned on. Connect to the 'CLUE' hotspot of the host", Toast.LENGTH_SHORT).show();
           }
        
           else

        {
        Intent intent = new Intent(MainActivity.this, EnterName.class);
	    intent.putExtra("from", "join");
	    startActivity(intent);
        }
	}
}
