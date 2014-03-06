package bart.piotr.operacjealgebraiczne;

import Jama.Matrix;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Systemw2 extends Activity {

	private Button calc;
	private TextView textSpace; 
	private EditText[][] editpola1;
	private EditText[] editpola2;
	private Matrix A;
	private double[][] tablica1;
	private double[] tablica2;
	private Matrix b;
	private Matrix x;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_systemw2);
		
		textSpace = (TextView) findViewById(R.id.textView32);
		calc = (Button) findViewById(R.id.calc22);
		editpola1 = new EditText[2][2];
		editpola2 = new EditText[2];
		tablica1 = new double[2][2];
		tablica2 = new double[2];
		editpola1[0][0] = (EditText) findViewById(R.id.M2a11);
		editpola1[0][1] = (EditText) findViewById(R.id.M2a12);
		editpola1[1][0] = (EditText) findViewById(R.id.M2a21);
		editpola1[1][1] = (EditText) findViewById(R.id.M2a22);
		editpola2[0] = (EditText) findViewById(R.id.M2b1);
		editpola2[1] = (EditText) findViewById(R.id.M2b2);
		
		calc.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				for(int i = 0; i<2;i++){
					for(int j = 0; j<2; j++){
						tablica1[i][j] = Double.parseDouble(editpola1[i][j].getText().toString());
					}
					tablica2[i] = Double.parseDouble(editpola2[i].getText().toString());
				}
				A = new Matrix(tablica1);
				b = new Matrix(tablica2,2);
				x = A.solve(b);
				textSpace.setText(String.format("%.3f",x.get(0,0))+"\t"+String.format("%.3f",x.get(1,0)));
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
		getMenuInflater().inflate(R.menu.systemw2, menu);
		return true;
	}

}
