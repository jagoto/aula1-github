package entities;

public class CalcRetangulo {
	
		public double base;
		public double altura;
		
		public double area() {
			return base * altura;
		}
		public double perimetro() {
			return (base + altura) * 2;	
		}
		public double diagonal() {
			return Math.sqrt((altura*altura)+(base*base));
		}

}
