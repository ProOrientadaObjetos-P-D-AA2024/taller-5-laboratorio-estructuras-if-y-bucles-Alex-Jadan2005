package ejempleados;
public class Empleado {
    private String nombre;
    private double  salario;
    private int edad;
    private double promedio;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public double getPromedio() {
        return promedio;
    }
    public String toString(){
        return "Nombre del empleado: "+nombre+"\nSalario: "+salario+"\nEdad: "+edad;
    }
    
    
    
    
    
    
}
