package lectura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import model.Empresa;

public class LeerEmpresa {
private ArrayList<Empresa> empresas = new ArrayList<Empresa>();
	
	public ArrayList<Empresa> leerFichero(String fichero){
		String linea;
		try {
			
			InputStream in = getClass().getClassLoader().getResourceAsStream(fichero);
			
			System.out.println(fichero);
          //  reader = new BufferedReader(new InputStreamReader(in));
			
			//BufferedReader bufferedReader = new BufferedReader(new FileReader(fichero));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            
            System.out.println(in.toString());
			linea = bufferedReader.readLine();
			while(linea != null) {
				procesarLinea(linea);
				linea = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return empresas;
	}

	private void procesarLinea(String linea) {
		Scanner scanner = new Scanner(linea);
				scanner.useDelimiter("\\s*,\\s*");
				
				Long id = scanner.nextLong();
				String descripcion = scanner.next();
				
				Integer aporte = scanner.nextInt();
		
				this.empresas.add(new Empresa(id, descripcion, aporte));
				scanner.close();

	}
	
	public void imprimir() {
		for(Empresa empresa:empresas) {
			System.out.println(empresa);
		}
	}

}
