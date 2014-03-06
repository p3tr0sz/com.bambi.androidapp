package bart.piotr.operacjealgebraiczne;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MatrixList extends Activity {

	private Button matrix2x2;
	private Button matrix3x3;
	private Button matrix4x4;
	private Button matrix5x5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_matrix_list);
		Bundle extras = getIntent().getExtras(); 
		String value = extras.getString("matrix");
		matrix2x2 = (Button) findViewById(R.id.dxd);
		matrix3x3 = (Button) findViewById(R.id.txt);
		matrix4x4 = (Button) findViewById(R.id.cxc);
		matrix5x5 = (Button) findViewById(R.id.pxp);
		
		if(value.equals("determinant") ){
			
		matrix2x2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixList.this, Matrix2x2.class); 
				i.putExtra("matrix", "determinant");
				startActivity(i);
				finish();
			}       	
        });
		matrix3x3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixList.this, Matrix3x3.class); 
				i.putExtra("matrix", "determinant");
				startActivity(i);
				finish();
			}       	
        });
		matrix4x4.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixList.this, Matrix4x4.class); 
				i.putExtra("matrix", "determinant");
				startActivity(i);
				finish();
			}       	
        });
		matrix5x5.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MatrixList.this, Matrix5x5.class); 
				i.putExtra("matrix", "determinant");
				startActivity(i);
				finish();
			}       	
        });
	}else if(value.equals("inverse") ){
			
			matrix2x2.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix2x2.class); 
					i.putExtra("matrix", "inverse");
					startActivity(i);
					finish();
				}       	
	        });
			matrix3x3.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix3x3.class); 
					i.putExtra("matrix", "inverse");
					startActivity(i);
					finish();
				}       	
	        });
			matrix4x4.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix4x4.class); 
					i.putExtra("matrix", "inverse");
					startActivity(i);
					finish();
				}       	
	        });
			matrix5x5.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix5x5.class); 
					i.putExtra("matrix", "inverse");
					startActivity(i);
					finish();
				}       	
	        });
		}else if(value.equals("transpose") ){
			
			matrix2x2.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix2x2.class); 
					i.putExtra("matrix", "transpose");
					startActivity(i);
					finish();
				}       	
	        });
			matrix3x3.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix3x3.class); 
					i.putExtra("matrix", "transpose");
					startActivity(i);
					finish();
				}       	
	        });
			matrix4x4.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix4x4.class); 
					i.putExtra("matrix", "transpose");
					startActivity(i);
					finish();
				}       	
	        });
			matrix5x5.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix5x5.class); 
					i.putExtra("matrix", "transpose");
					startActivity(i);
					finish();
				}       	
	        });
		}else if(value.equals("trace") ){
			
			matrix2x2.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix2x2.class); 
					i.putExtra("matrix", "trace");
					startActivity(i);
					finish();
				}       	
	        });
			matrix3x3.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix3x3.class); 
					i.putExtra("matrix", "trace");
					startActivity(i);
					finish();
				}       	
	        });
			matrix4x4.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix4x4.class); 
					i.putExtra("matrix", "trace");
					startActivity(i);
					finish();
				}       	
	        });
			matrix5x5.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix5x5.class); 
					i.putExtra("matrix", "trace");
					startActivity(i);
					finish();
				}       	
	        });
		}else if(value.equals("rank") ){
			
			matrix2x2.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix2x2.class); 
					i.putExtra("matrix", "rank");
					startActivity(i);
					finish();
				}       	
	        });
			matrix3x3.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix3x3.class); 
					i.putExtra("matrix", "rank");
					startActivity(i);
					finish();
				}       	
	        });
			matrix4x4.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix4x4.class); 
					i.putExtra("matrix", "rank");
					startActivity(i);
					finish();
				}       	
	        });
			matrix5x5.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(MatrixList.this, Matrix5x5.class); 
					i.putExtra("matrix", "rank");
					startActivity(i);
					finish();
				}       	
	        });
		}

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
		getMenuInflater().inflate(R.menu.matrix_list, menu);
		return true;
	}

}
