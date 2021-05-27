package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

//Arriba estan los metodos agregados en este ejercicio

public class StringUtil
{
    public static String ltrim(String s)
    {
        String ret = s.replaceAll("^\\s*","");

        return ret;
    }

    public static String rtrim(String s)
    {
        String ret = s.replaceAll("\\s*$","");

        return ret;
    }

    public static String trim(String s)
    {
        String ret = s.trim();

        return ret;
    }

    public static int indexOfN(String s,char c,int n)
    {
        int ind = -1;
        int i = 0;

        while(i < n)
        {
            //El caracter se busca
            ind = s.indexOf(c);

            //si lo encuentra recorta la cadena y sigue iterando hasta que sea la n-esima vez
            if ( ind != -1)
            {
                s = s.substring(ind+1,s.length()-1);
            }

            else
            {
                return -1;
            }

            i++;
        }
        return ind;
    }

    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c,int n) // este ya funciona
    {   String sCadena = "";

        int i = 0;

        while ( i != n)
        {
            sCadena = sCadena + c;

            i++;
        }

        return sCadena;
    }

    // Retorna una cadena de longitud n, compuesta por y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionado. Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {



        while ( s.length() != n) //evalua la longitud de la cadena para iterar y le concatena a la izquierda el caracter que recibe n veces
        {
            s = c + s;

        }


        return s;
    }

    public static String rpad(String s,char c,int n)
    {
        while ( s.length() != n) //evalua la longitud de la cadena para iterar y le concatena a la izquierda el caracter que recibe n veces
        {
            s = s + c;

        }


        return s;

    }


    // Retorna un String[] conteniendo los elementos de arr representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String[] sArray = new String[arr.length];

        for(int i=0;i<arr.length;i++)
        {

            sArray[i] = String.valueOf(arr[i]); //en cada posicion copia del arreglo de enteros al de cadenas con su conversion


        }



        return sArray;
    }

    // Retorna un Int[] conteniendo los elementos de arr
    // representados como enteros
    public static int[] toIntArray(String arr[])
    {
        int[] iArray = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {

            iArray[i] = Integer.valueOf(arr[i]); //es igual que el anterior pero invertido


        }


        return iArray;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {   int iMaxL = 0;  //almacena en cada comparacion el length mayor

        for(String x: arr)
        {
            if(x.length()>iMaxL) //compara en cada bucle si es mayor el length actual y lo actualiza
            {
                iMaxL = x.length();
            }

        }

        return iMaxL;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static String[] lNormalize(String arr[], char c)
    {
        int iMaxl = maxLength(arr);

        for(String x: arr)
        {
            while(x.length() < iMaxl)
            {
                x = c + x;
            }

        }
        return arr;
    }
}

