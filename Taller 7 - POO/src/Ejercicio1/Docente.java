package Ejercicio1;

public class Docente implements CalcularSueldo {

    int dicta_pago, pago_hora;

    public Docente() {
    }

    public Docente(int dicta_pago, int pago_hora) {
        this.dicta_pago = dicta_pago;
        this.pago_hora = pago_hora;
    }

    public int getDicta_pago() {
        return dicta_pago;
    }

    public void setDicta_pago(int dicta_pago) {
        this.dicta_pago = dicta_pago;
    }

    public int getPago_hora() {
        return pago_hora;
    }

    public void setPago_hora(int pago_hora) {
        this.pago_hora = pago_hora;
    }
    
    @Override
    public void sueldo() {
        int p = this.dicta_pago*this.pago_hora;
        double bonif = p*0.7;
        double pb = p+bonif;
        System.out.println("Docente : "+"$"+pb);
    }
    
}
