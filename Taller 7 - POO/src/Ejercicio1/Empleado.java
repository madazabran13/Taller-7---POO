package Ejercicio1;

public class Empleado implements CalcularSueldo{
    double sueldo_fijo;
    String cargo;

    public Empleado() {
    }

    public Empleado(double sueldo_fijo, String cargo) {
        this.sueldo_fijo = sueldo_fijo;
        this.cargo = cargo;
    }

    public double getSueldo_fijo() {
        return sueldo_fijo;
    }

    public void setSueldo_fijo(double sueldo_fijo) {
        this.sueldo_fijo = sueldo_fijo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void sueldo() {
        int sf = (int) (this.sueldo_fijo + this.sueldo_fijo);
        System.out.println( this.cargo+": $"+sf);
    }
    
}
