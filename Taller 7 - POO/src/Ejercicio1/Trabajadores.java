package Ejercicio1;

public class Trabajadores {
    public static void main(String[] args) {
        CalcularSueldo sueldos[] = new CalcularSueldo[4];
        System.out.println(" --SUELDO TRABAJADOR--\n");
        System.out.println("   * EMPLEADOS * \n");
        
        CalcularSueldo Empleado = new Empleado(5000,"Coordinador");
        sueldos[0]=Empleado;
       
        CalcularSueldo Empleado1 = new Empleado(4000,"Asistente");
        sueldos[1]=Empleado1;
        
        CalcularSueldo Empleado2 = new Empleado(3000,"Secretaria");
        sueldos[2]=Empleado2;
  
        CalcularSueldo Docente = new Docente(15,120);
        sueldos[3]=Docente;
        
        MostrarSueldo(sueldos);
          
    }
    
    public static void MostrarSueldo(CalcularSueldo sueldo[]){
        for(CalcularSueldo cs: sueldo){
            cs.sueldo();
        }
    }
}
