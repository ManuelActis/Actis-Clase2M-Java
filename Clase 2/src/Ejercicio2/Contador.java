package Ejercicio2;

public class Contador {

    public int getiContador() {
        return iContador;
    }

    public void setiContador(int iContador) {
        this.iContador = iContador;
    }

    private int iContador;

    public Contador()
    {

    }

    public Contador(int contador)
    {
        iContador = contador;
    }

    public void Incrementar()
    {
        iContador += 1;
    }

    public void Decrementar()
    {
        iContador -= -1;
    }

}
