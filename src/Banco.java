
public class Banco {

	private Cliente[] clientes = new Cliente[50];
/*	
	public void buscarSaldoMaximo(){
	//Escribe por pantalla el nombre y saldo del cliente con más dinero
	//en el banco
		
	
	}//buscarSaldoMaximo
	
	public float totalDescubierto(){
	//Devuelve la suma de todas las cuentas en descubierto
		
		return 0.0f;
	}//totalDescubierto
	
	public float saldoMedio(){
	//Devuelve un número real que es el saldo medio de las cuentas del banco	
		
	}//SaldoMedio
	
	public void saldoMayorQue(Cliente c){
	//Escribe por pantalla los nombres y saldos de las cuentas con más  
	//saldo que la del cliente "c" dado	
		
	}//saldoMayorQue
	
	
	
	public void buscarDescubiertos(){
	//Método que recorre el array de clientes comprobando qué clientes
	//tienen la cuenta en descubierto (saldo<0). Debe usar el método
	//descubierto() de la clase Cliente
		
		for (int i=0; i<clientes.length; i++){
			if(clientes[i].descubierto()){
				System.out.println("Nombre:" + clientes[i].getNombre() );
				System.out.println("Saldo: " + clientes[i].getSaldo() );
			}//if
		}//for		
	}//buscarDescubiertos
*/	
	
	public static void main(String[] args) {

		//clientes = new Cliente[50];
		
		Banco b = new Banco();
		
		for (int i=0; i<b.clientes.length; i++){
			
			b.clientes[i] = new Cliente();
			
			b.clientes[i].setNombre("Cliente_" + (i+1) );
			b.clientes[i].setSaldo((float)(Math.random()-Math.random())*1000);
			
			System.out.println("Nombre:" + b.clientes[i].getNombre() );
			System.out.println("Saldo: " + b.clientes[i].getSaldo() );
		}//for
		
		System.out.println("\n\nCLIENTES EN DESCUBIERTO:");
		//b.buscarDescubiertos();
	
	}

}
