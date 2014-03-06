package bart.piotr.operacjealgebraiczne;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ComplexOperations extends Activity {

	private Button mult;
	private Button div;
	private Button powr;
	private Button conver;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_complex_operations);
		mult = (Button) findViewById(R.id.multiplyNumbers);
		div = (Button) findViewById(R.id.divideNumbers);
		powr = (Button) findViewById(R.id.powNumbers);
		conver = (Button) findViewById(R.id.converseNumbers);
		
		mult.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(ComplexOperations.this, ComplexInterface.class); 
				i.putExtra("complex", "multiply");
				startActivity(i);
				finish();
			}       	
        });
		
		div.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(ComplexOperations.this, ComplexInterface.class); 
				i.putExtra("complex", "divide");
				startActivity(i);
				finish();
			}       	
        });
		powr.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(ComplexOperations.this, ComplexExponential.class); 
				i.putExtra("complex", "exp");
				startActivity(i);
				finish();
			}       	
        });
		conver.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(ComplexOperations.this, ComplexConversion.class); 
				i.putExtra("complex", "conv");
				startActivity(i);
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
		getMenuInflater().inflate(R.menu.complex_operations, menu);
		return true;
	}

}
