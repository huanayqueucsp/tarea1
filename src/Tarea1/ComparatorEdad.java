package Tarea1;


public class ComparatorEdad implements Comparator<Persona> {
	
	public int compare (Persona mienbro1, Persona mienbro2)
	{
		return mienbro1.edad- mienbro2.edad;
	}

}
