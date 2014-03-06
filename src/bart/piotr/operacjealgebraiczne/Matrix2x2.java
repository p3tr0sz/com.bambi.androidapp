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

public class Matrix2x2 extends Activity {

	private Button calc;
	private TextView textSpace;
	private String[][] matrixpola; 
	private EditText[][] editpola; 
	private Matrix Matrix2x2;
	private double[][] tablica1;
	private double det;
	private double trace;
	private int rank;
	private Matrix InverseMatrix;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_matrix2x2);
		Bundle extras2 = getIntent().getExtras();
		final String value2 = extras2.getString("matrix");
		textSpace = (TextView) findViewById(R.id.textView1);
		calc = (Button) findViewById(R.id.det22);
		matrixpola = new String[2][2];
		editpola = new EditText[2][2];
		tablica1 = new double[2][2];
		editpola[0][0] = (EditText) findViewById(R.id.M211);
		editpola[0][1] = (EditText) findViewById(R.id.M212);
		editpola[1][0] = (EditText) findViewById(R.id.M221);
		editpola[1][1] = (EditText) findViewById(R.id.M222);
		calc.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(value2.equals("determinant")){
					for(int i = 0; i<2;i++){
						for(int j = 0; j<2; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix2x2 = new Matrix(tablica1);
					det = Matrix2x2.det();
					textSpace.setText(getString(R.string.det_button)+": " + String.format("%.3f",det));
				}else if(value2.equals("inverse")){
					for(int i = 0; i<2;i++){
						for(int j = 0; j<2; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix2x2 = new Matrix(tablica1);
					InverseMatrix = Matrix2x2.inverse();
					textSpace.setText(getString(R.string.inv_button)+": \n" + String.format("%.3f",InverseMatrix.get(0,0)) + "\t" +String.format("%.3f",InverseMatrix.get(0,1))+
							"\n"+String.format("%.3f",InverseMatrix.get(1,0)) + "\t" +String.format("%.3f",InverseMatrix.get(1,1)));
		
				}else if(value2.equals("transpose")){
					for(int i = 0; i<2;i++){
						for(int j = 0; j<2; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix2x2 = new Matrix(tablica1);
					InverseMatrix = Matrix2x2.transpose();
					textSpace.setText(getString(R.string.trans_button)+": \n" + String.format("%.3f",InverseMatrix.get(0,0)) + "\t" +String.format("%.3f",InverseMatrix.get(0,1))+
							"\n"+String.format("%.3f",InverseMatrix.get(1,0)) + "\t" +String.format("%.3f",InverseMatrix.get(1,1)));
		
				}else if(value2.equals("trace")){
					for(int i = 0; i<2;i++){
						for(int j = 0; j<2; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix2x2 = new Matrix(tablica1);
					trace = Matrix2x2.trace();
					textSpace.setText(getString(R.string.trace_button)+": \n" + String.format("%.3f",trace));
		
				}else if(value2.equals("rank")){
					for(int i = 0; i<2;i++){
						for(int j = 0; j<2; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix2x2 = new Matrix(tablica1);
					rank = Matrix2x2.rank();
					textSpace.setText(getString(R.string.rank_button)+": \n" + String.format("%d",rank));	
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
		getMenuInflater().inflate(R.menu.matrix2x2, menu);
		return true;
	}

}
