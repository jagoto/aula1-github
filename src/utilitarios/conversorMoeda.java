package utilitarios;


public class conversorMoeda {
	
	public static final double IOF = 6.00;
	public static double dolarReal(double valorReais){
		
		return (valorReais + (valorReais * IOF/100));
	}
}
