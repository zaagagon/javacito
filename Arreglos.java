
class Arreglos{
	public static void main (String [] args) {
		// Declaracion arreglo notas
		float [] notas = new float [5];
		// Insercion de datos al arreglo notas
		 notas [0] = (float) 4.2;
		notas[1] = (float) 3.3;
		notas [2] = (float) 2.8;
		notas [3] = (float) 5.0;
		notas [4] = (float) 5.0;
		// Declaracion e inicializacion arreglo vengadores
		String [] vengadores = new String [] {"Viuda Negra","Capitan America", "Hulk"};
		// Arreglo de objetos
		Planeta[] planetas = new Planeta[2];
		planetas [0] = new Planeta ("Marte");
        planetas[1]= new Planeta("Jupiter");
		
		// Recorremos
		for (int x = 0; x <notas.length; x ++) {
			System.out.printf("Notas"+ "["+x+"]"+ "="+notas[x]+"\n");
		}
		for (int x = 0; x <vengadores.length; x ++) {
			System.out.printf("Vengador  "+ "["+x+"]"+" = "+vengadores[x]+"\n");//salto de linea \n
		}
		for (int x = 0; x <planetas.length; x ++) {
			//System.out.printf("Mascotas  = "+mascotas[x]+"\n");
            System.out.println(planetas[x]);
		}
	}
}

class Planeta {
	public String nombre;

	public Planeta(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString () {
		return "Planeta ['"+nombre+"']";
	}
}