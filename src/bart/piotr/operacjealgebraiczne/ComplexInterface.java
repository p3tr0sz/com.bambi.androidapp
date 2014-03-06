package bart.piotr.operacjealgebraiczne;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComplexInterface extends Activity {

	private Button calc;
	private EditText[] pola;
	private TextView textSpace;
	private ComplexNumber number1, number2, number3;
	private int i = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_complex_interface);
		Bundle extras = getIntent().getExtras();
		final String value = extras.getString("complex");
		textSpace = (TextView) findViewById(R.id.textView12);
		calc = (Button) findViewById(R.id.calculate);
		pola = new EditText[4];
		pola[0] = (EditText) findViewById(R.id.renum1);
		pola[1] = (EditText) findViewById(R.id.imnum1);
		pola[2] = (EditText) findViewById(R.id.renum2);
		pola[3] = (EditText) findViewById(R.id.imnum2);
		
		calc.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(value.equals("multiply")){
					number1 = new ComplexNumber(i,Double.parseDouble(pola[0].getText().toString()),Double.parseDouble(pola[1].getText().toString()));
					number2 = new ComplexNumber(i,Double.parseDouble(pola[2].getText().toString()),Double.parseDouble(pola[3].getText().toString()));
					number3 = number1.multiplyNumbers(number1, number2);
					if(number3.getIm() >= 0){
					textSpace.setText(String.format("%.3f",number3.getRe()) +"+"+ String.format("%.3f",number3.getIm())+"i");
					}
					else
						textSpace.setText(String.format("%.3f",number3.getRe())+ String.format("%.3f",number3.getIm())+"i");
				}else if(value.equals("divide")){
					number1 = new ComplexNumber(i,Double.parseDouble(pola[0].getText().toString()),Double.parseDouble(pola[1].getText().toString()));
					number2 = new ComplexNumber(i,Double.parseDouble(pola[2].getText().toString()),Double.parseDouble(pola[3].getText().toString()));
					number3 = number1.divideNumbers(number1, number2);
					if(number3.getIm() >= 0){
					textSpace.setText(String.format("%.3f",number3.getRe()) +"+"+ String.format("%.3f",number3.getIm())+"i");
					}
					else
						textSpace.setText(String.format("%.3f",number3.getRe())+ String.format("%.3f",number3.getIm())+"i");
				}
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
		getMenuInflater().inflate(R.menu.complex_interface, menu);
		return true;
	}

}
