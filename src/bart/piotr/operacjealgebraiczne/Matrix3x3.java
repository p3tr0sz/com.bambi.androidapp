package bart.piotr.operacjealgebraiczne;

import Jama.Matrix;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Matrix3x3 extends Activity {

	private Button calc;
	private TextView textSpace;
	private String[][] matrixpola; 
	private EditText[][] editpola; 
	private double[][] tablica1;
	private Matrix Matrix3x3;
	private double det;
	private double trace;
	private int rank;
	private Matrix InverseMatrix;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_matrix3x3);
		Bundle extras = getIntent().getExtras();
		final String value = extras.getString("matrix");
		textSpace = (TextView) findViewById(R.id.textView2);
		calc = (Button) findViewById(R.id.det33);
		matrixpola = new String[3][3];
		editpola = new EditText[3][3];
		tablica1 = new double[3][3];
		editpola[0][0] = (EditText) findViewById(R.id.M311);
		editpola[0][1] = (EditText) findViewById(R.id.M312);
		editpola[0][2] = (EditText) findViewById(R.id.M313);
		editpola[1][0] = (EditText) findViewById(R.id.M321);
		editpola[1][1] = (EditText) findViewById(R.id.M322);
		editpola[1][2] = (EditText) findViewById(R.id.M323);
		editpola[2][0] = (EditText) findViewById(R.id.M331);
		editpola[2][1] = (EditText) findViewById(R.id.M332);
		editpola[2][2] = (EditText) findViewById(R.id.M333);
		
		calc.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(value.equals("determinant")){
					for(int i = 0; i<3;i++){
						for(int j = 0; j<3; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix3x3 = new Matrix(tablica1);
					det = Matrix3x3.det();
					textSpace.setText(getString(R.string.det_button)+": " + String.format("%.3f",det));
				}else if(value.equals("inverse")){
					for(int i = 0; i<3;i++){
						for(int j = 0; j<3; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix3x3 = new Matrix(tablica1);
					InverseMatrix = Matrix3x3.inverse();
					textSpace.setText(getString(R.string.inv_button)+": \n" + 
					String.format("%.3f",InverseMatrix.get(0,0)) + "\t" +String.format("%.3f",InverseMatrix.get(0,1))+"\t"+String.format("%.3f",InverseMatrix.get(0,2))+"\n"+
					String.format("%.3f",InverseMatrix.get(1,0)) + "\t" +String.format("%.3f",InverseMatrix.get(1,1))+"\t"+String.format("%.3f",InverseMatrix.get(1,2))+"\n"+
					String.format("%.3f",InverseMatrix.get(2,0)) + "\t" +String.format("%.3f",InverseMatrix.get(2,1))+"\t"+String.format("%.3f",InverseMatrix.get(2,2)));			
				}else if(value.equals("transpose")){
					for(int i = 0; i<3;i++){
						for(int j = 0; j<3; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix3x3 = new Matrix(tablica1);
					InverseMatrix = Matrix3x3.transpose();
					textSpace.setText(getString(R.string.trans_button)+": \n" + 
					String.format("%.3f",InverseMatrix.get(0,0)) + "\t" +String.format("%.3f",InverseMatrix.get(0,1))+"\t"+String.format("%.3f",InverseMatrix.get(0,2))+"\n"+
					String.format("%.3f",InverseMatrix.get(1,0)) + "\t" +String.format("%.3f",InverseMatrix.get(1,1))+"\t"+String.format("%.3f",InverseMatrix.get(1,2))+"\n"+
					String.format("%.3f",InverseMatrix.get(2,0)) + "\t" +String.format("%.3f",InverseMatrix.get(2,1))+"\t"+String.format("%.3f",InverseMatrix.get(2,2)));			
				}else if(value.equals("trace")){
					for(int i = 0; i<3;i++){
						for(int j = 0; j<3; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix3x3 = new Matrix(tablica1);
					trace = Matrix3x3.trace();
					textSpace.setText(getString(R.string.trace_button)+": \n" + 
					String.format("%.3f",trace));			
				}else if(value.equals("rank")){
					for(int i = 0; i<3;i++){
						for(int j = 0; j<3; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix3x3 = new Matrix(tablica1);
					rank = Matrix3x3.rank();
					textSpace.setText(getString(R.string.rank_button)+": \n" + 
					String.format("%d",rank));			
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
		getMenuInflater().inflate(R.menu.matrix3x3, menu);
		return true;
	}

}
