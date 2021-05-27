package Ejercicio4;

public class Fraccion
{	
	private int numerador;
	private int denominador;
	
	public Fraccion(int n,int d)
	{
		setDenominador(n);
		setDenominador(d);
	}
	
	public Fraccion multiplicar(Fraccion f)
	{
		this.numerador = f.numerador * numerador;
		this.denominador = f.denominador * denominador;

		return this;
	}
	
	public Fraccion multiplicar(int x)
	{
	setNumerador(numerador*x);
	setDenominador(denominador*x);

	return this;
	}

	public Fraccion dividir(Fraccion f)
	{
	this.numerador = this.numerador * f.denominador;
	this.denominador = this.denominador * f.numerador;

	return this;
	}

	public Fraccion dividirInt(int x)
	{
	denominador = denominador*x;
	return this;
	}


	public void simplificar()
	{
		int i=2;
		while( i<=numerador && i<=denominador )
		{
			if( numerador%i==0 && denominador%i==0 )
			{
				numerador = numerador/i;
				denominador = denominador/i;
			}
			else
			{
				i++;
			}
		}		
	}
	
	public static Fraccion sumar(Fraccion a,Fraccion b)
	{
		Fraccion x = new Fraccion(a.numerador,a.denominador);
		x.sumar(b);
		return x;
	}
	
	public Fraccion sumar(Fraccion x)
	{
		int nd = denominador*x.denominador;
		int nn = numerador*x.denominador+x.numerador*denominador;
		
		numerador = nn;
		denominador = nd;
		return this;
	}
	
	public void imprimir()
	{
		System.out.println(numerador+"/"+denominador);
	}
	
	


	public int getNumerador()
	{
		return numerador;
	}

	public void setNumerador(int x)
	{
		numerador=x;
	}

	public int getDenominador()
	{
		return denominador;
	}

	public void setDenominador(int d)
	{
		if(d==0)
		{
			throw new RuntimeException("El denominador no puede ser cero");
		}
		
		this.denominador=d;
	}
	
	public Fraccion SumarInt(int x)
	{

		int num = x * denominador;


		this.numerador = this.numerador + num;

		return this;
	}

	public Fraccion RestarInt (int x)
	{
		int num = x * denominador;


		this.numerador = this.numerador - num;

		return this;

	}



}
