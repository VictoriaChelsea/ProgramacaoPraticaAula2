import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ArrayList<Figura> figuras = new ArrayList<>();
		
		figuras.add(new Circulo(50,20));
		figuras.add(new Losango(2, 2));
		figuras.add(new Poligono(10, 10));
		figuras.add(new Quadrado(10, 10));
		figuras.add(new Retangulo(10, 10));
		figuras.add(new Triangulo(10, 10));
		figuras.add(new Trapezio(10, 10));
		
		for(Figura figura:figuras){
			System.out.println("figura: " + figura.getClass().getSimpleName());
			System.out.println("   Area: " + figura.area());
			System.out.println("   Perímetro: " + figura.area());
			if(figura instanceof Diagonal){
				System.out.println("   Diagonal: " + ((Diagonal)figura).calcularDiagonal());
			}
		}


	}

}
