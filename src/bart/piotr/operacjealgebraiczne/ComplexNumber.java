package bart.piotr.operacjealgebraiczne;


public class ComplexNumber {

	private double Re;
	private double Im;
	private double Mod;
	private double arg;
	
	public ComplexNumber(int j,double r, double i){
		this.Re = r;
		this.Im = i;
		this.Mod = converseAlgtoTryg(Re,Im)[0];
		this.arg = converseAlgtoTryg(Re,Im)[1];
	}
	
	public ComplexNumber(char c,double m, double a){
		this.Mod = m;
		this.arg = a;
		this.Re = converseTrygtoAlg(m,a)[0];
		this.Im = converseTrygtoAlg(m,a)[1];
	}
	
	public double getRe(){
		return Re;
	}
	public double getIm(){
		return Im;
	}
	
	public double getMod(){
		return Mod;
	}
	public double getArg(){
		return arg;
	}
	
	public double[] converseAlgtoTryg(double r, double i){
		double[] k = new double[2];
		k[0] = Math.sqrt(r*r + i*i);
		k[1] = Math.atan2(i,r);
		return k;
	}
	
	public double[] converseTrygtoAlg(double m, double a){
		double[] k = new double[2];
		k[0] = m * Math.cos(a);
		k[1] = m * Math.sin(a);
		return k;
	}
	
	public ComplexNumber multiplyNumbers(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber result;
		int i = 0;
		double rem, imm;
		rem = (n1.getRe() * n2.getRe() - n1.getIm() * n2.getIm());
		imm = (n1.getIm() * n2.getRe() + n1.getRe() * n2.getIm());
		result = new ComplexNumber(i,rem,imm);
		return result;
	}
	
	public ComplexNumber divideNumbers(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber result;
		int i = 0;
		double rem, imm;
		rem = (n1.getRe() * n2.getRe() + n1.getIm() * n2.getIm()) / (n2.getRe()*n2.getRe() + n2.getIm()*n2.getIm());
		imm = (n1.getIm() * n2.getRe() - n1.getRe() * n2.getIm()) / (n2.getRe()*n2.getRe() + n2.getIm()*n2.getIm());
		result = new ComplexNumber(i,rem,imm);
		return result;
	}
	
	public ComplexNumber power(ComplexNumber n1, double wykladnik){
		ComplexNumber result;
		int j = 0;
		double rem, imm;
		if (wykladnik>1){
			rem = Math.pow(n1.getMod(), wykladnik) * Math.cos(wykladnik * n1.getArg());
			imm = Math.pow(n1.getMod(), wykladnik) * Math.sin(wykladnik * n1.getArg());
			result = new ComplexNumber(j,rem, imm);
		}else{
			throw new RuntimeException("Niepoprawny wykladnik potegi");
		}
		
		return result;
	}
}
