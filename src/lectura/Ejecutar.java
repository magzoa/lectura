package lectura;

public class Ejecutar {
	
	public static void main(String[] args) {
		
		LeerPais leerPais=new LeerPais();
		leerPais.leerFichero("paises.csv");
		leerPais.imprimir();
	
		
		LeerEmpresa leerEmpresa = new LeerEmpresa();
		leerEmpresa.leerFichero("empresas.csv");
		leerEmpresa.imprimir();
		
	}
}
