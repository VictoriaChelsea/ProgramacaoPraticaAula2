
public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return this.base * this.altura;
	}
	
	public double calcularDiagonal() { 
		return (this.base * this.base) + (this.altura * this.altura); 
	}
	
	@Override
	public double perimetro() {
		return (this.base * 2) + (this.altura * 2); 
	}
}
