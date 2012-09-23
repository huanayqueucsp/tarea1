package Tarea1;


public class PersonaOrdenada {
	
		static Persona [] personas = {
				new Persona ("Katherine",20,731950),
				new Persona ("Randy",23,731920),
				new Persona ("Jorgito",12,731902),
				new Persona ("Pascual",55,801911),
				new Persona ("Dominga",50,801952),
				new Persona ("Clausia",19,731910),
		};
		
		public static  void sort1 (Persona [] p)
		{
			for(int i =0;i<p.length;i++)
			{
				for(int j=0;j<p.length;j++)
				{
					if(p[j].nombre.compareTo(p[i].nombre)>0)
					{
						Persona temp = p[i];
						p[i]=p[j];
						p[j]=temp;
					}
				}
			}
		}
		
		public static <T> void sort2 (T [] personitas, Comparator<T> comp)
		//templates                
		{
			for (int i=0; i<personitas.length;i++)
			{
				for(int j=i; j< personitas.length;j++)
				{
					if (comp.compare(personitas[i],personitas[j])>0)
					{
						T temp = personitas[i];
						personitas[i]=personitas[j];
						personitas[j]=temp;
					}
				}
			}
			
		}
		public static void main (String [] args)
		{
			/**sort1(personas); Primer metodo simple de ordenar */
			 Comparator<Persona> comp=
					 // new ComparatorEdad();
					 //new ComparatorDni();
					  new ComparatorNombre();
	
			
			sort2(personas,comp);
			
			for (int i=0; i<personas.length ; i++)
				System.out.println(personas[i].nombre+" "+personas[i].edad+" "+personas[i].dni);
		}
}
