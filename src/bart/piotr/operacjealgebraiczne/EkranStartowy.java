package bart.piotr.operacjealgebraiczne;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EkranStartowy extends Activity {

	private Button matrixButton;
	private Button complexButton;
	private Button equationButton;
	private Button exitButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_startowy);
        exitButton = (Button) findViewById(R.id.koniec);
        exitButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}        	
        });
        matrixButton = (Button) findViewById(R.id.operacjeMacierzowe);
        matrixButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EkranStartowy.this, MatrixOperations.class));
				finish();
			}       	
        });
        complexButton = (Button) findViewById(R.id.liczbyZespolone);
        complexButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EkranStartowy.this, ComplexOperations.class));
				finish();
			}       	
        });
        
        equationButton = (Button) findViewById(R.id.uklady);
        equationButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(EkranStartowy.this, EquationSystem.class));
				finish();
			}       	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ekran_startowy, menu);
        return true;
    }
    
}
