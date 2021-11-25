class ArregloThing{

    public static void main(String[] args) {
        
        String [] thing =new String [] {"computador","pencil","mouse"};
      
        //Recorremos el arreglo con un for utilizamos lenght
        for(int i=0;i<thing.length;i++){
            //No es posible en el for usar el <= puede dar error
            //imprimimos el arreglo
            System.out.printf(thing[i]+"\n");

        }
    } 
        
    }