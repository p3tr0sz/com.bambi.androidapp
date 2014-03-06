package bart.piotr.operacjealgebraiczne;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComplexConversion extends Activity {

	private Button calc1, calc2;
	private EditText[] pola;
	private TextView textSpace;
	private ComplexNumber number1;
	private int i = 0;
	private char a = 'a';
	private double[] k;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_complex_conversion);
		textSpace = (TextView) findViewById(R.id.textView30);
		calc1 = (Button) findViewById(R.id.calculate3);
		calc2 = (Button) findViewById(R.id.calculate4);
		pola = new EditText[2];
		k = new double[2];
		pola[0] = (EditText) findViewById(R.id.renum7);
		pola[1] = (EditText) findViewById(R.id.imnum7);
		calc1.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					number1 = new ComplexNumber(i,Double.parseDouble(pola[0].getText().toString()),Double.parseDouble(pola[1].getText().toString()));
					k = number1.converseAlgtoTryg(number1.getRe(), number1.getIm());
					textSpace.setText(String.format("%.3f",k[0])+"( cos("+ String.format("%.3f",k[1]) +") + "+ "isin("+String.format("%.3f",k[1])+") )");
			}
		});
		
		calc2.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					number1 = new ComplexNumber(a,Double.parseDouble(pola[0].getText().toString()),Double.parseDouble(pola[1].getText().toString()));
					k = number1.converseTrygtoAlg(number1.getMod(), number1.getArg());
					if(k[1] >= 0){
					textSpace.setText(String.format("%.3f",k[0]) +"+"+ String.format("%.3f",k[1])+"i");
					}
					else
						textSpace.setText(String.format("%.3f",k[0])+ String.format("%.3f",k[1])+"i");
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
		getMenuInflater().inflate(R.menu.complex_conversion, menu);
		return true;
	}

}
