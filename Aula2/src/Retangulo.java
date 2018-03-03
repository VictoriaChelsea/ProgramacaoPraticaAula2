
public class Retangulo extends Poligono implements Diagonal {
	
	public Retangulo (double base, double altura) {
		super(base, altura);
	
	}
	
	@Override
	public double area() {
		return this.base * this.altura;
	}
	
	public double calcularDiagonal() { 
		return (this.base * this.altura) / 3; 
	}
	
	@Override
	public double perimetro() {
		return (this.base * 2) + (this.altura * 2); 
	}
}
