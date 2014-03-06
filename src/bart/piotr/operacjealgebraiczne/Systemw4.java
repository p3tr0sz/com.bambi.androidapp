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

public class Systemw4 extends Activity {

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
		setContentView(R.layout.activity_systemw4);
		
		textSpace = (TextView) findViewById(R.id.textView34);
		calc = (Button) findViewById(R.id.calc44);
		editpola1 = new EditText[4][4];
		editpola2 = new EditText[4];
		tablica1 = new double[4][4];
		tablica2 = new double[4];
		editpola1[0][0] = (EditText) findViewById(R.id.M4a11);
		editpola1[0][1] = (EditText) findViewById(R.id.M4a12);
		editpola1[0][2] = (EditText) findViewById(R.id.M4a13);
		editpola1[0][3] = (EditText) findViewById(R.id.M4a14);
		editpola1[1][0] = (EditText) findViewById(R.id.M4a21);
		editpola1[1][1] = (EditText) findViewById(R.id.M4a22);
		editpola1[1][2] = (EditText) findViewById(R.id.M4a23);
		editpola1[1][3] = (EditText) findViewById(R.id.M4a24);
		editpola1[2][0] = (EditText) findViewById(R.id.M4a31);
		editpola1[2][1] = (EditText) findViewById(R.id.M4a32);
		editpola1[2][2] = (EditText) findViewById(R.id.M4a33);
		editpola1[2][3] = (EditText) findViewById(R.id.M4a34);
		editpola1[3][0] = (EditText) findViewById(R.id.M4a41);
		editpola1[3][1] = (EditText) findViewById(R.id.M4a42);
		editpola1[3][2] = (EditText) findViewById(R.id.M4a43);
		editpola1[3][3] = (EditText) findViewById(R.id.M4a44);
		
		editpola2[0] = (EditText) findViewById(R.id.M4b1);
		editpola2[1] = (EditText) findViewById(R.id.M4b2);
		editpola2[2] = (EditText) findViewById(R.id.M4b3);
		editpola2[3] = (EditText) findViewById(R.id.M4b4);
		
		calc.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				for(int i = 0; i<4;i++){
					for(int j = 0; j<4; j++){
						tablica1[i][j] = Double.parseDouble(editpola1[i][j].getText().toString());
					}
					tablica2[i] = Double.parseDouble(editpola2[i].getText().toString());
				}
				A = new Matrix(tablica1);
				b = new Matrix(tablica2,4);
				x = A.solve(b);
				textSpace.setText(String.format("%.3f",x.get(0,0))+"\t"+String.format("%.3f",x.get(1,0))+"\t"+String.format("%.3f",x.get(2,0))+"\t"+String.format("%.3f",x.get(3,0)));
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
		getMenuInflater().inflate(R.menu.systemw4, menu);
		return true;
	}

}
