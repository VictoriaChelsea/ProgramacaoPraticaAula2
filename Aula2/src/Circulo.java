
public class Circulo extends Figura{
	
	public double area;
	public double raio;
	public Circulo(double area, double raio) {
		this.area = area;
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return 3.14 * (this.raio * this.raio);
	}
	
	@Override
	public double perimetro() {
		return (2 * 3.14) * this.raio;
	}
}
