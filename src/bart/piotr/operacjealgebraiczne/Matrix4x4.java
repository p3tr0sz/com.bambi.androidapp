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

public class Matrix4x4 extends Activity {

	private Button calc;
	private TextView textSpace;
	private String[][] matrixpola; 
	private EditText[][] editpola; 
	private double[][] tablica1;
	private Matrix Matrix4x4;
	private double det = 0.0;
	private double trace;
	private int rank;
	private Matrix InverseMatrix;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_matrix4x4);
		Bundle extras = getIntent().getExtras();
		final String value = extras.getString("matrix");
		textSpace = (TextView) findViewById(R.id.textView3);
		calc = (Button) findViewById(R.id.det44);
		matrixpola = new String[4][4];
		editpola = new EditText[4][4];
		tablica1 = new double[4][4];
		editpola[0][0] = (EditText) findViewById(R.id.M411);
		editpola[0][1] = (EditText) findViewById(R.id.M412);
		editpola[0][2] = (EditText) findViewById(R.id.M413);
		editpola[0][3] = (EditText) findViewById(R.id.M414);
		editpola[1][0] = (EditText) findViewById(R.id.M421);
		editpola[1][1] = (EditText) findViewById(R.id.M422);
		editpola[1][2] = (EditText) findViewById(R.id.M423);
		editpola[1][3] = (EditText) findViewById(R.id.M424);
		editpola[2][0] = (EditText) findViewById(R.id.M431);
		editpola[2][1] = (EditText) findViewById(R.id.M432);
		editpola[2][2] = (EditText) findViewById(R.id.M433);
		editpola[2][3] = (EditText) findViewById(R.id.M434);
		editpola[3][0] = (EditText) findViewById(R.id.M441);
		editpola[3][1] = (EditText) findViewById(R.id.M442);
		editpola[3][2] = (EditText) findViewById(R.id.M443);
		editpola[3][3] = (EditText) findViewById(R.id.M444);
		
		calc.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(value.equals("determinant")){
					for(int i = 0; i<4;i++){
						for(int j = 0; j<4; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix4x4 = new Matrix(tablica1);
					det = Matrix4x4.det();
					textSpace.setText(getString(R.string.det_button)+": " + String.format("%.3f",det));
				}else if(value.equals("inverse")){
					for(int i = 0; i<4;i++){
						for(int j = 0; j<4; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix4x4 = new Matrix(tablica1);
					InverseMatrix = Matrix4x4.inverse();
					textSpace.setText(getString(R.string.inv_button)+": \n" + 
					String.format("%.3f",InverseMatrix.get(0,0)) + "\t" +String.format("%.3f",InverseMatrix.get(0,1))+"\t"+String.format("%.3f",InverseMatrix.get(0,2))+"\t"+String.format("%.3f",InverseMatrix.get(0,3))+"\n"+
					String.format("%.3f",InverseMatrix.get(1,0)) + "\t" +String.format("%.3f",InverseMatrix.get(1,1))+"\t"+String.format("%.3f",InverseMatrix.get(1,2))+"\t"+String.format("%.3f",InverseMatrix.get(1,3))+"\n"+
					String.format("%.3f",InverseMatrix.get(2,0)) + "\t" +String.format("%.3f",InverseMatrix.get(2,1))+"\t"+String.format("%.3f",InverseMatrix.get(2,2))+"\t"+String.format("%.3f",InverseMatrix.get(2,3))+"\n"+
					String.format("%.3f",InverseMatrix.get(3,0)) + "\t" +String.format("%.3f",InverseMatrix.get(3,1))+"\t"+String.format("%.3f",InverseMatrix.get(3,2))+"\t"+String.format("%.3f",InverseMatrix.get(3,3)));		
				}else if(value.equals("transpose")){
					for(int i = 0; i<4;i++){
						for(int j = 0; j<4; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix4x4 = new Matrix(tablica1);
					InverseMatrix = Matrix4x4.transpose();
					textSpace.setText(getString(R.string.trans_button)+": \n" + 
					String.format("%.3f",InverseMatrix.get(0,0)) + "\t" +String.format("%.3f",InverseMatrix.get(0,1))+"\t"+String.format("%.3f",InverseMatrix.get(0,2))+"\t"+String.format("%.3f",InverseMatrix.get(0,3))+"\n"+
					String.format("%.3f",InverseMatrix.get(1,0)) + "\t" +String.format("%.3f",InverseMatrix.get(1,1))+"\t"+String.format("%.3f",InverseMatrix.get(1,2))+"\t"+String.format("%.3f",InverseMatrix.get(1,3))+"\n"+
					String.format("%.3f",InverseMatrix.get(2,0)) + "\t" +String.format("%.3f",InverseMatrix.get(2,1))+"\t"+String.format("%.3f",InverseMatrix.get(2,2))+"\t"+String.format("%.3f",InverseMatrix.get(2,3))+"\n"+
					String.format("%.3f",InverseMatrix.get(3,0)) + "\t" +String.format("%.3f",InverseMatrix.get(3,1))+"\t"+String.format("%.3f",InverseMatrix.get(3,2))+"\t"+String.format("%.3f",InverseMatrix.get(3,3)));		
				}else if(value.equals("trace")){
					for(int i = 0; i<4;i++){
						for(int j = 0; j<4; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix4x4 = new Matrix(tablica1);
					trace = Matrix4x4.trace();
					textSpace.setText(getString(R.string.trace_button)+": \n"  + 
					String.format("%.3f",trace));		
				}else if(value.equals("rank")){
					for(int i = 0; i<4;i++){
						for(int j = 0; j<4; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix4x4 = new Matrix(tablica1);
					rank = Matrix4x4.rank();
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
		getMenuInflater().inflate(R.menu.matrix4x4, menu);
		return true;
	}

}
