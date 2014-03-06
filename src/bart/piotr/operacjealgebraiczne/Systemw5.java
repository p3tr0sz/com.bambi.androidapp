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

public class Systemw5 extends Activity {

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
		setContentView(R.layout.activity_systemw5);
		
		textSpace = (TextView) findViewById(R.id.textView35);
		calc = (Button) findViewById(R.id.calc55);
		editpola1 = new EditText[5][5];
		editpola2 = new EditText[5];
		tablica1 = new double[5][5];
		tablica2 = new double[5];
		editpola1[0][0] = (EditText) findViewById(R.id.M5a11);
		editpola1[0][1] = (EditText) findViewById(R.id.M5a12);
		editpola1[0][2] = (EditText) findViewById(R.id.M5a13);
		editpola1[0][3] = (EditText) findViewById(R.id.M5a14);
		editpola1[0][4] = (EditText) findViewById(R.id.M5a15);
		editpola1[1][0] = (EditText) findViewById(R.id.M5a21);
		editpola1[1][1] = (EditText) findViewById(R.id.M5a22);
		editpola1[1][2] = (EditText) findViewById(R.id.M5a23);
		editpola1[1][3] = (EditText) findViewById(R.id.M5a24);
		editpola1[1][4] = (EditText) findViewById(R.id.M5a25);
		editpola1[2][0] = (EditText) findViewById(R.id.M5a31);
		editpola1[2][1] = (EditText) findViewById(R.id.M5a32);
		editpola1[2][2] = (EditText) findViewById(R.id.M5a33);
		editpola1[2][3] = (EditText) findViewById(R.id.M5a34);
		editpola1[2][4] = (EditText) findViewById(R.id.M5a35);
		editpola1[3][0] = (EditText) findViewById(R.id.M5a41);
		editpola1[3][1] = (EditText) findViewById(R.id.M5a42);
		editpola1[3][2] = (EditText) findViewById(R.id.M5a43);
		editpola1[3][3] = (EditText) findViewById(R.id.M5a44);
		editpola1[3][4] = (EditText) findViewById(R.id.M5a45);
		editpola1[4][0] = (EditText) findViewById(R.id.M5a51);
		editpola1[4][1] = (EditText) findViewById(R.id.M5a52);
		editpola1[4][2] = (EditText) findViewById(R.id.M5a53);
		editpola1[4][3] = (EditText) findViewById(R.id.M5a54);
		editpola1[4][4] = (EditText) findViewById(R.id.M5a55);
		
		editpola2[0] = (EditText) findViewById(R.id.M5b1);
		editpola2[1] = (EditText) findViewById(R.id.M5b2);
		editpola2[2] = (EditText) findViewById(R.id.M5b3);
		editpola2[3] = (EditText) findViewById(R.id.M5b4);
		editpola2[4] = (EditText) findViewById(R.id.M5b5);
		
		calc.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				for(int i = 0; i<5;i++){
					for(int j = 0; j<5; j++){
						tablica1[i][j] = Double.parseDouble(editpola1[i][j].getText().toString());
					}
					tablica2[i] = Double.parseDouble(editpola2[i].getText().toString());
				}
				A = new Matrix(tablica1);
				b = new Matrix(tablica2,5);
				x = A.solve(b);
				textSpace.setText(String.format("%.3f",x.get(0,0))+"\t"+String.format("%.3f",x.get(1,0))+"\t"+String.format("%.3f",x.get(2,0))+
						"\t"+String.format("%.3f",x.get(3,0))+"\t"+String.format("%.3f",x.get(4,0)));
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
		getMenuInflater().inflate(R.menu.systemw5, menu);
		return true;
	}

}
