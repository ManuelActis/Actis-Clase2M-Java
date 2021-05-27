package Ejercicio1;

/*
    EJERCICIO 1

    Crea una clase CuentaCorriente, con los métodos: ingreso, egreso, reintegro y transferencia. La clase contendrá un
    constructor por defecto, uno con parámetros y otro que recibirá una CuentaCorriente de la cual copiará todos sus datos.
    Además se deben desarrollar los métodos de acceso (para cada variable de instancia de la clase, desarrollar un método se
    y otro get. Por ejemplo: si la clase tiene una variable double saldo, sus métodos de acceso serán: double getSaldo() y void setSaldo(double s).
    Los prototipos de los métodos y constructores deberán ser discutidos y diseñados en equipo.

     */

public class CuentaCorriente {

    private String nroCuenta;

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private Double saldo;

    public CuentaCorriente()
    {

    }

    public CuentaCorriente(double saldo)
    {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuenta)
    {
        nroCuenta = cuenta.nroCuenta;
        saldo = cuenta.saldo;
    }

    public void Egreso(double gasto)
    {
     saldo = saldo - gasto;
    }


    public void Ingreso(double monto)
    {
        saldo = saldo + monto;
    }

    public void Reintegro(double reintegro)
    {
        saldo = saldo + reintegro;
    }

    public void Transferencia(CuentaCorriente c2, double monto)
    {
        this.saldo += monto;

        c2.saldo = c2.saldo - monto;

    }


}
