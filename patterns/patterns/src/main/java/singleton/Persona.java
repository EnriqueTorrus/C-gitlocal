package singleton;

public class Persona {

	public final class singleton {
		private static Persona personaInstance;
		public String nombre;
		public int edad;
		public int dni;
		public String sexo;
		
		public static Persona getInstance(String nombre , int edad) {
			if (personaInstance == null)
				personaInstance = new Persona();
		
		return personaInstance;
		}
	}

}