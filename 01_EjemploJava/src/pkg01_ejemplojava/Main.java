
package pkg01_ejemplojava;


public class Main {

    
    public static void main(String[] args) {
        
        boolean condition = 5 == 5 && true;
        
        if (condition || false){
            System.out.println("Es verdadero");   
        }
      else if(5<7){
            System.out.println("No se ejecuta");
       }
        
        char letra = 'b';
        switch(letra) {
            case 'a':
                    System.out.println("Aaaa");
                    break;
            case 'b':
                    System.out.println("Bbbb");
                    break;
            case 'c':
                    System.out.println("Cccc");
                    break;
                    
        }
        String formateado = nombreApell("German","Pardi");
        System.out.println(formateado);
        
        Tucan miPajaro = new Tucan();
        miPajaro.longitud = 20.5;
        miPajaro.setColores(new String[] {"verde","amarillo"});
    
        
        System.out.println("Longitud " + miPajaro.longitud);
        for(String s: miPajaro.colores){
            System.out.println(s);
        }
      }
    public static String nombreApell(String nombre, String apellido){
         return nombre + " " +apellido;
    }
    
    
}
