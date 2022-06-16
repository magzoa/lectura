package model;

public class Pais {
	


	private String id;
	
	private String descripcion;
	
	private Integer poblacion;
	
	private String idioma;
	
	public Pais() {
		// TODO Auto-generated constructor stub
	}
	
	




	

	public Pais(String id, String descripcion, Integer poblacion, String idioma) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.poblacion = poblacion;
		this.idioma = idioma;
	}








	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(Integer poblacion) {
		this.poblacion = poblacion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}








	@Override
	public String toString() {
		return "Pais [id=" + id + ", descripcion=" + descripcion + ", poblacion=" + poblacion + ", idioma=" + idioma
				+ "]";
	}
	
	

}
