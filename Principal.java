package IMP;

/**
 *
 * @author Sagardía, César Matías
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado e1=new Empleado("Matias", "152236", 29,true,22489.256 );
        Programador p1=new Programador(300,"Java","Jorge","78965",45,false,26554.122);
        
        System.out.println(e1.toString());
        System.out.println(p1.toString());
    }
    
}
