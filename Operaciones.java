public class Operaciones {

    //atributos de la clase

    int n1,n2,result;

    //constructor clase operaciones

    Operaciones(int x,int y) {

        n1=x;
        n2=y;
    }
    
   // metodo de la clase 
   public void sumar(){
     result=n1+n2;
     //Es necesario parsear de int a String
     String result2= Integer.toString(result);
       //creamos objeto de la clase Printer
       Printer mostrar = new Printer(null);
       mostrar.printer("Resultado operación : ", result2);
   }
}
