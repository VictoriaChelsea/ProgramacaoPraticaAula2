
public class Losango extends Poligono {
	
	public Losango(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (this.base * this.altura) / 2 * 3;
	}
	
	@Override
	public double perimetro() {
		return (this.base * 2) + (this.altura * 2); 
	}
}
