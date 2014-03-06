package bart.piotr.operacjealgebraiczne;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComplexExponential extends Activity {

	private Button calc;
	private EditText[] pola;
	private TextView textSpace;
	private ComplexNumber number1, number2;
	private int i = 0;
	double wykladnik;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_complex_exponential);
		textSpace = (TextView) findViewById(R.id.textView22);
		calc = (Button) findViewById(R.id.calculate2);
		pola = new EditText[3];
		pola[0] = (EditText) findViewById(R.id.renum4);
		pola[1] = (EditText) findViewById(R.id.imnum4);
		pola[2] = (EditText) findViewById(R.id.wykl);
		calc.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					number1 = new ComplexNumber(i,Double.parseDouble(pola[0].getText().toString()),Double.parseDouble(pola[1].getText().toString()));
					wykladnik = Double.parseDouble(pola[2].getText().toString());
					number2 = number1.power(number1, wykladnik);
					if(number2.getIm() >= 0){
					textSpace.setText(String.format("%.3f",number2.getRe()) +"+"+ String.format("%.3f",number2.getIm())+"i");
					}
					else
						textSpace.setText(String.format("%.3f",number2.getRe())+ String.format("%.3f",number2.getIm())+"i");
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
		getMenuInflater().inflate(R.menu.complex_exponential, menu);
		return true;
	}

}
