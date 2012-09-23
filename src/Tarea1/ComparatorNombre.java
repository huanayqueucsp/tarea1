package Tarea1;

public class ComparatorNombre  implements Comparator <Persona>{
	
	public int compare (Persona mienbro1, Persona mienbro2)
	{
		return mienbro1.nombre.compareTo(mienbro2.nombre);
	}
}
