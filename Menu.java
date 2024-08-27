import java.util.Scanner;

import javax.swing.JOptionPane;


public class Menu {
	static String pedir;
	static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select = -1; //opción elegida del usuario
	static int base, altura, area, perimetro, radio, ladoEquilatero, baseRectangulo, alturaRectangulo, baseTrianguloRectangulo, alturaTrianguloRectangulo ; //Variables
	static double areaCirculo, perimetroCirculo, areaEquilatero, perimetroEquilatero, areaRectangulo, hipotenusaRectangulo, perimetroRectangulo, perimetroTrianguloRectangulo;
	public static void main(String[] args) {
					
		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				String lectura = JOptionPane.showInputDialog(null,"************************\nElige opción:\n1.- Rectangulo" +
						"\n2.- Circulo\n" +
						"3.- Triangulo Equilatero\n" +
						"4.- Triangulo Rectangulo\n" +
						"0.- Salir\n************************",);
				//Recoger una variable por consola
				select = Integer.parseInt(lectura); 
		
				//Switch case en Java
				switch(select){
				case 1: 
					pideNumeros();
					areaRectangulo(base, altura);
					perimetroRectangulo(base, altura);
					JOptionPane.showMessageDialog(null,"El area del rectangulo es: " + area + "\nEl perimetro del rectangulo es: " + perimetro);

					
					
					
					break;
				case 2: 
					pedirRadio();
					areaCirculo(radio);
					perimetroCirculo(radio);
					JOptionPane.showMessageDialog(null,"El area del circulo es: " + areaCirculo + "\n El perimetro del circulo es: " + perimetroCirculo);
					
					
					
					break;
				case 3: 
					pedirLado();
					areaEquilatero(ladoEquilatero);
					perimetroEquilatero(ladoEquilatero);
					JOptionPane.showMessageDialog(null,"El area del Triangulo Equilatero es: " + areaEquilatero + "\nEl perimetro del Triangulo Equilatero es: " + perimetroEquilatero);
					break;
				case 4: 
					pedirAlturaBase();
					areaTrianguloRectangulo(baseTrianguloRectangulo, alturaTrianguloRectangulo);
					perimetroTrianguloRectangulo(baseTrianguloRectangulo, alturaTrianguloRectangulo);
					JOptionPane.showMessageDialog(null,"El area del Triangulo Rectangulo es: " + areaRectangulo + "\nEl perimetro del Triangulo Rectangulo es: " + perimetroTrianguloRectangulo);
					break;
				case 0: 
					JOptionPane.showMessageDialog(null,"Adios!");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Número no reconocido");break;
				}
					
				
					
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}
	}

		public static void pideNumeros(){
			pedir = JOptionPane.showInputDialog(null,"Digite la base del rectangulo: ");
			base = Integer.parseInt(pedir);
			
			pedir = JOptionPane.showInputDialog(null,"Digite la altura del rectangulo: ");
			altura = Integer.parseInt(pedir);

		}
		public static double areaRectangulo(int base, int altura){
			area = base*altura;
			return area;		
		}
		public static double perimetroRectangulo(int base, int altura){
			perimetro = (base*2)+(altura*2);
			return perimetro;
		}
		
		
		public static void pedirRadio(){
			pedir = JOptionPane.showInputDialog(null,"Digite el radio del circulo: ");
			radio = Integer.parseInt(pedir);
			
		}
		
		public static double areaCirculo(int radio){
			areaCirculo =  Math.PI*(radio*radio);
			return areaCirculo;
		}
		
		public static double perimetroCirculo(int radio){
			perimetroCirculo = 2*Math.PI*radio;
			return perimetroCirculo;
		}
	
		public static void pedirLado(){
			pedir = JOptionPane.showInputDialog(null,"Digite el lado del Triangulo Equilatero: ");
			ladoEquilatero = Integer.parseInt(pedir);
			
		}
		
		public static double areaEquilatero(int ladoEquilatero){
			areaEquilatero = (Math.pow(ladoEquilatero,2)*Math.sqrt(3))/4;
			return areaEquilatero;
		}
		public static double perimetroEquilatero(double ladoEquilatero){
			 
			perimetroEquilatero = 3*ladoEquilatero;
			return perimetroEquilatero;
		}
		
		public static void pedirAlturaBase(){
			pedir = JOptionPane.showInputDialog(null,"Digite la base del triangulo rectangulo: ");
			baseTrianguloRectangulo = Integer.parseInt(pedir); 
			pedir = JOptionPane.showInputDialog(null,"Digite la altura del triangulo rectangulo: ");
			alturaTrianguloRectangulo = Integer.parseInt(pedir); 
			
		}
		
		public static double areaTrianguloRectangulo(int baseTrianguloRectangulo, int alturaTrianguloRectangulo){
			areaRectangulo = (baseTrianguloRectangulo*alturaTrianguloRectangulo)/2;
			return areaRectangulo;
		}
		public static double perimetroTrianguloRectangulo(int baseTrianguloRectangulo, int alturaTrianguloRectangulo){
		
			hipotenusaRectangulo = Math.sqrt((Math.pow(baseTrianguloRectangulo, 2)+ Math.pow(alturaTrianguloRectangulo, 2) ));
			perimetroTrianguloRectangulo = alturaTrianguloRectangulo + baseTrianguloRectangulo + hipotenusaRectangulo;	
			return perimetroTrianguloRectangulo;
		}

}
