package Tarea1;


public class ComparatorDni implements Comparator<Persona> 
{
		
	public int compare (Persona mienbro1, Persona mienbro2)
	{
		return mienbro1.dni- mienbro2.dni;
	}

}
