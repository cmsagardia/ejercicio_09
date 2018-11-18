package IMP;

/**
 *
 * @author Usuario
 */
public class Programador extends Empleado {

    public Programador() {
    }
    
    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String cedula, int edad, boolean casado, double salario) {
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return "Programador{" + "lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominante=" + lenguajeDominante + '}';
    }
    
private int lineasDeCodigoPorHora;
private String lenguajeDominante;

}
