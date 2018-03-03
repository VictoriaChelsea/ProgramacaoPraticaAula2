
public class Esfera extends Circulo{
	public double volume;
	
	public Esfera(double area, double volume, double raio) {
		super(area, raio);
		this.volume = volume;
	}
		
	@Override
		public double area() {
			return super.area();
		}
	
	
	@Override
	public double perimetro() {
		return super.perimetro();
	}
	
}
