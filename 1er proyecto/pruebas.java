package Pruebas;
public class Operaciones{
private int a;
private int b;
private static final int SMI= 5233.234;

public operaciones()
{
	a = 0;
	b = 0;
}
   
public operaciones2(int a, int b)
{
	this.a = a;
	this.b = b;
}

public int calculaSuma()
{
	return a+b;
}

public int calculaResta()
{
	return a-b;
}

public int multiplicaNumero(int parametro)
{
	return a*b*parametro;
}
}