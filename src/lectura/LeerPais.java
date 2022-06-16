package lectura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import model.Pais;

public class LeerPais {
	private ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public ArrayList<Pais> leerFichero(String fichero){
		String linea;
		try {
			InputStream in = getClass().getClassLoader().getResourceAsStream(fichero);
			
		
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
			
			
			
			
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
		
		return paises;
	}

	private void procesarLinea(String linea) {
		Scanner scanner = new Scanner(linea);
		scanner.useDelimiter("\\s*,\\s*");
		String id = scanner.next();
		String descripcion = scanner.next();
		Integer poblacion = scanner.nextInt();
		String idioma = scanner.next();
		
		this.paises.add(new Pais(id, descripcion, poblacion, idioma));
		scanner.close();
	}
	
	public void imprimir() {
		for(Pais pais:paises) {
			System.out.println(pais);
		}
	}
}
