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

public class Matrix5x5 extends Activity {

	private Button calc;
	private TextView textSpace;
	private String[][] matrixpola; 
	private EditText[][] editpola; 
	private double[][] tablica1;
	private Matrix Matrix5x5;
	private double det = 0.0;
	private double trace;
	private int rank;
	private Matrix InverseMatrix;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_matrix5x5);
		
		Bundle extras = getIntent().getExtras();
		final String value = extras.getString("matrix");
		textSpace = (TextView) findViewById(R.id.textView4);
		calc = (Button) findViewById(R.id.det55);
		matrixpola = new String[5][5];
		editpola = new EditText[5][5];
		tablica1 = new double[5][5];
		editpola[0][0] = (EditText) findViewById(R.id.M511);
		editpola[0][1] = (EditText) findViewById(R.id.M512);
		editpola[0][2] = (EditText) findViewById(R.id.M513);
		editpola[0][3] = (EditText) findViewById(R.id.M514);
		editpola[0][4] = (EditText) findViewById(R.id.M515);
		editpola[1][0] = (EditText) findViewById(R.id.M521);
		editpola[1][1] = (EditText) findViewById(R.id.M522);
		editpola[1][2] = (EditText) findViewById(R.id.M523);
		editpola[1][3] = (EditText) findViewById(R.id.M524);
		editpola[1][4] = (EditText) findViewById(R.id.M525);
		editpola[2][0] = (EditText) findViewById(R.id.M531);
		editpola[2][1] = (EditText) findViewById(R.id.M532);
		editpola[2][2] = (EditText) findViewById(R.id.M533);
		editpola[2][3] = (EditText) findViewById(R.id.M534);
		editpola[2][4] = (EditText) findViewById(R.id.M535);
		editpola[3][0] = (EditText) findViewById(R.id.M541);
		editpola[3][1] = (EditText) findViewById(R.id.M542);
		editpola[3][2] = (EditText) findViewById(R.id.M543);
		editpola[3][3] = (EditText) findViewById(R.id.M544);
		editpola[3][4] = (EditText) findViewById(R.id.M545);
		editpola[4][0] = (EditText) findViewById(R.id.M551);
		editpola[4][1] = (EditText) findViewById(R.id.M552);
		editpola[4][2] = (EditText) findViewById(R.id.M553);
		editpola[4][3] = (EditText) findViewById(R.id.M554);
		editpola[4][4] = (EditText) findViewById(R.id.M555);
		
		calc.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(value.equals("determinant")){
					for(int i = 0; i<5;i++){
						for(int j = 0; j<5; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix5x5 = new Matrix(tablica1);
					det = Matrix5x5.det();
					textSpace.setText(getString(R.string.det_button)+": " + String.format("%.3f",det));
				}else if(value.equals("inverse")){
					for(int i = 0; i<5;i++){
						for(int j = 0; j<5; j++){
							matrixpola[i][j] = editpola[i][j].getText().toString();
							tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
						}
					}
					Matrix5x5 = new Matrix(tablica1);
					InverseMatrix = Matrix5x5.inverse();
					textSpace.setText(getString(R.string.inv_button)+": \n" + 
					String.format("%.3f",InverseMatrix.get(0,0))+"\t"+String.format("%.3f",InverseMatrix.get(0,1))+"\t"+String.format("%.3f",InverseMatrix.get(0,2))+"\t"+String.format("%.3f",InverseMatrix.get(0,3))+"\t"+String.format("%.3f",InverseMatrix.get(0,4))+"\n"+
					String.format("%.3f",InverseMatrix.get(1,0))+"\t"+String.format("%.3f",InverseMatrix.get(1,1))+"\t"+String.format("%.3f",InverseMatrix.get(1,2))+"\t"+String.format("%.3f",InverseMatrix.get(1,3))+"\t"+String.format("%.3f",InverseMatrix.get(1,4))+"\n"+
					String.format("%.3f",InverseMatrix.get(2,0))+"\t"+String.format("%.3f",InverseMatrix.get(2,1))+"\t"+String.format("%.3f",InverseMatrix.get(2,2))+"\t"+String.format("%.3f",InverseMatrix.get(2,3))+"\t"+String.format("%.3f",InverseMatrix.get(2,4))+"\n"+
					String.format("%.3f",InverseMatrix.get(3,0))+"\t"+String.format("%.3f",InverseMatrix.get(3,1))+"\t"+String.format("%.3f",InverseMatrix.get(3,2))+"\t"+String.format("%.3f",InverseMatrix.get(3,3))+"\t"+String.format("%.3f",InverseMatrix.get(3,4))+"\n"+
					String.format("%.3f",InverseMatrix.get(4,0))+"\t"+String.format("%.3f",InverseMatrix.get(4,1))+"\t"+String.format("%.3f",InverseMatrix.get(4,2))+"\t"+String.format("%.3f",InverseMatrix.get(4,3))+"\t"+String.format("%.3f",InverseMatrix.get(4,4)));	
			}else if(value.equals("transpose")){
				for(int i = 0; i<5;i++){
					for(int j = 0; j<5; j++){
						matrixpola[i][j] = editpola[i][j].getText().toString();
						tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
					}
				}
				Matrix5x5 = new Matrix(tablica1);
				InverseMatrix = Matrix5x5.transpose();
				textSpace.setText(getString(R.string.trans_button)+": \n" + 
				String.format("%.3f",InverseMatrix.get(0,0))+"\t"+String.format("%.3f",InverseMatrix.get(0,1))+"\t"+String.format("%.3f",InverseMatrix.get(0,2))+"\t"+String.format("%.3f",InverseMatrix.get(0,3))+"\t"+String.format("%.3f",InverseMatrix.get(0,4))+"\n"+
				String.format("%.3f",InverseMatrix.get(1,0))+"\t"+String.format("%.3f",InverseMatrix.get(1,1))+"\t"+String.format("%.3f",InverseMatrix.get(1,2))+"\t"+String.format("%.3f",InverseMatrix.get(1,3))+"\t"+String.format("%.3f",InverseMatrix.get(1,4))+"\n"+
				String.format("%.3f",InverseMatrix.get(2,0))+"\t"+String.format("%.3f",InverseMatrix.get(2,1))+"\t"+String.format("%.3f",InverseMatrix.get(2,2))+"\t"+String.format("%.3f",InverseMatrix.get(2,3))+"\t"+String.format("%.3f",InverseMatrix.get(2,4))+"\n"+
				String.format("%.3f",InverseMatrix.get(3,0))+"\t"+String.format("%.3f",InverseMatrix.get(3,1))+"\t"+String.format("%.3f",InverseMatrix.get(3,2))+"\t"+String.format("%.3f",InverseMatrix.get(3,3))+"\t"+String.format("%.3f",InverseMatrix.get(3,4))+"\n"+
				String.format("%.3f",InverseMatrix.get(4,0))+"\t"+String.format("%.3f",InverseMatrix.get(4,1))+"\t"+String.format("%.3f",InverseMatrix.get(4,2))+"\t"+String.format("%.3f",InverseMatrix.get(4,3))+"\t"+String.format("%.3f",InverseMatrix.get(4,4)));	
		
			}else if(value.equals("trace")){
			for(int i = 0; i<5;i++){
				for(int j = 0; j<5; j++){
					matrixpola[i][j] = editpola[i][j].getText().toString();
					tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
				}
			}
			Matrix5x5 = new Matrix(tablica1);
			trace = Matrix5x5.trace();
			textSpace.setText(getString(R.string.trace_button)+": \n"  + 
			String.format("%.3f",trace));	
		
			}else if(value.equals("rank")){
		for(int i = 0; i<5;i++){
			for(int j = 0; j<5; j++){
				matrixpola[i][j] = editpola[i][j].getText().toString();
				tablica1[i][j] = Double.parseDouble(matrixpola[i][j]);
			}
		}
		Matrix5x5 = new Matrix(tablica1);
		rank = Matrix5x5.rank();
		textSpace.setText(getString(R.string.rank_button)+": \n"  + 
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
		getMenuInflater().inflate(R.menu.matrix5x5, menu);
		return true;
	}

}
