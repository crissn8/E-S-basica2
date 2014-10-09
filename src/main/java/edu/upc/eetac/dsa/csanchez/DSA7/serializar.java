package edu.upc.eetac.dsa.csanchez.DSA7;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class serializar {
	
	public static void main(String[] args) 
	{
		
		Dato dato = new Dato ("Cristina",160,'C');
		FileOutputStream file = null;
		ObjectOutputStream object = null;
		File fichero = null;
		
		try {
			 fichero = new File("C:\\Users\\Cristina\\Documents\\Serializar.txt");
			 file = new FileOutputStream (fichero);
			 object = new ObjectOutputStream(file);
			 object.writeObject(dato);
		
		     object.close();
			}
		
	
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	
		FileInputStream fis = null;
		ObjectInputStream in = null;
	
	try
	{
		fis = new FileInputStream(fichero);
		in = new ObjectInputStream(fis);
		dato = (Dato) in.readObject();
		in.close();
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
			System.out.println(dato);
	
	}


 }
		
		
			
	


