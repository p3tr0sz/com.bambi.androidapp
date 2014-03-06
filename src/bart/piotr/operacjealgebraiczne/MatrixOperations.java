package bart.piotr.operacjealgebraiczne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MatrixOperations extends Activity {
	
	private Button detMatrix;
	private Button invMatrix;
	private Button transMatrix;
	private Button traceMatrix;
	private Button rankMatrix;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_matrix_operations);
		detMatrix = (Button) findViewById(R.id.det);
		invMatrix = (Button) findViewById(R.id.inv);
		transMatrix = (Button) findViewById(R.id.trans);
		traceMatrix = (Button) findViewById(R.id.trace);
		rankMatrix = (Button) findViewById(R.id.rank);
		
		detMatrix.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixOperations.this, MatrixList.class); 
				i.putExtra("matrix", "determinant");
				startActivity(i);
				finish();
			}       	
        });
		invMatrix.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixOperations.this, MatrixList.class); 
				i.putExtra("matrix", "inverse");
				startActivity(i);
				finish();
			}       	
        });
		transMatrix.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixOperations.this, MatrixList.class); 
				i.putExtra("matrix", "transpose");
				startActivity(i);
				finish();
			}       	
        });
		traceMatrix.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixOperations.this, MatrixList.class); 
				i.putExtra("matrix", "trace");
				startActivity(i);
				finish();
			}       	
        });
		rankMatrix.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixOperations.this, MatrixList.class); 
				i.putExtra("matrix", "rank");
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
		getMenuInflater().inflate(R.menu.matrix_operations, menu);
		return true;
	}

}
