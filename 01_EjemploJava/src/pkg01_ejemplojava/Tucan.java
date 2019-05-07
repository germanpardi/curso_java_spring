
package pkg01_ejemplojava;


public class Tucan {
    
    public String[] colores;
    public double longitud;
    public int edad;

    public Tucan() {
    }

    public Tucan(String[] colores, double longitud, int edad) {
        this.colores = colores;
        this.longitud = longitud;
        this.edad = edad;
    }

    
    
    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Tucan{" + "colores=" + colores + ", longitud=" + longitud + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
