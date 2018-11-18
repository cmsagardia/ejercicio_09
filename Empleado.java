package IMP;

/**
 *
 * @author Usuario
 */
public class Empleado {

    public Empleado() {
    }
    
    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
   public String clasificacion(){
       
       if(this.edad<21){
           return "Principiante";
       }
       if(this.edad>=21 && this.edad<=35){
           return "Intermedio";
       }
       else return "Senior";
    }

    @Override
    public String toString() {
        return "Empleado: \n" + "nombre: " + nombre + "\ncedula: " + cedula + "\nedad: " + edad + "\ncasado: " + casado + "\nsalario: " + salario;
    }
   
    public double aumentarSalario(double porcentaje){
        double resultado;
        resultado=this.salario+(this.salario*porcentaje/100);
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
  
private String nombre;
private String cedula;
private int edad;
private boolean casado;
private double salario;

}
