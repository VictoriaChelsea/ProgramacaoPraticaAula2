
public class Trapezio extends Figura{
	
	public double base;
	public double altura;
	
	public Trapezio(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return this.base * this.altura;
	}
	
	@Override
	public double perimetro() {
		return (this.base * 2) + (this.altura * 2); 
	}
}
