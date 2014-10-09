package edu.upc.eetac.dsa.csanchez.DSA7;

import java.io.Serializable;

public class Dato implements Serializable {
	
	String nombre;
	int altura;
	char vivienda;
	
	public Dato ( String nom, int alt, char pueblo){
		
		this.nombre = nom;
		this.altura= alt;
		this.vivienda = pueblo;
		
	}
	
	public String getnombre()
	{ 
		return nombre;
	}
	
	public void setnombre(String nom) 
	{
		this.nombre = nom;
	}
	
	public int getaltura()
	{ 
		return altura;
	}
   
	public void setaltura(int alt) 
	{
		this.altura = alt;
	}
	
	
	public char getvivienda() 
	{
		return vivienda;
	}
	
	public void setvivienda(char pueblo) 
	{
		this.vivienda = pueblo;
	}
	
	public String toString(){
		
		return "El nombre de la persona ecuestada es: " + nombre + ", la altura es " + altura + " cm y su pueblo empieza por la letra "+vivienda;
	
	}
		
		
		
		
		
	
	
	
}
