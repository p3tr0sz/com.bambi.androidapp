package bart.piotr.operacjealgebraiczne;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EquationSystem extends Activity {

	private Button systemw2;
	private Button systemw4;
	private Button systemw3;
	private Button systemw5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_equation_system);
		
		systemw2 = (Button) findViewById(R.id.esdxd);
		systemw2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EquationSystem.this, Systemw2.class));
				finish();
			}
			
		});
		systemw3 = (Button) findViewById(R.id.estxt);
		systemw3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EquationSystem.this, Systemw3.class));
				finish();
			}
			
		});
		systemw4 = (Button) findViewById(R.id.escxc);
		systemw4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EquationSystem.this, Systemw4.class));
				finish();
			}
			
		});
		systemw5 = (Button) findViewById(R.id.espxp);
		systemw5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EquationSystem.this, Systemw5.class));
				finish();
			}
			
		});
	}
	public void onBackPressed() {
	    Intent ip = new Intent(this, EkranStartowy.class);
	    startActivity(ip);
	    finish();
	    super.onBackPressed();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.equation_system, menu);
		return true;
	}

}
