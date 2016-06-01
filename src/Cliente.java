import java.util.Iterator;
import java.util.Vector;

public class Cliente implements Comparable<Cliente>{
	
		private String nombre;
		private float saldo;
		private int edad;
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public float getSaldo() {
			return saldo;
		}
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public int getEdad (){
			return this.edad;
		}
		
		public boolean descubierto (){
			return saldo < 0.0f;
		}
		
		public int compareTo(Cliente o) {
			Cliente c = (Cliente) o;
			if (this.edad < c.edad)
				return -1;
			else
				if (this.edad > c.edad)
					return 1;
				else
					return 0;			
		}
		
		public static void main (String args[]) {
			
			Cliente c;
			Cliente c2;
			c = new Cliente();
			c2 = new Cliente();
			
			c.setNombre("Nuria");
			c2.setNombre("Vera");
			c2.setEdad(3);
			
			System.out.println("Cliente c: " + c);
			System.out.println("\t nombre: "+c.getNombre());
			System.out.println("\t saldo: "+c.getSaldo());
			System.out.println("\t edad: "+c.getEdad());
			
			System.out.println("Cliente c2: " + c2);
			System.out.println("\t nombre: "+c2.getNombre());
			System.out.println("\t saldo: "+c2.getSaldo());
			System.out.println("\t edad: "+c2.getEdad());
			
			System.out.println("\nc.compareTo(c2) = "+c.compareTo(c2));
			
			Vector<Cliente> lista = new Vector<Cliente>();
			System.out.println("Capacidad: " + lista.capacity());
			lista.add(c);
			lista.add(c2);
			Iterator<Cliente> it = lista.iterator();
			System.out.println("Probando iterador...");
			while(it.hasNext()) 
				System.out.println(it.next().getNombre());

		}//main
}
