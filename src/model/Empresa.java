package model;

public class Empresa {
	
	private Long id;
	private String descripcion;
	private Integer aporte;
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Empresa(Long id, String descripcion, Integer aporte) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.aporte = aporte;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getAporte() {
		return aporte;
	}
	public void setAporte(Integer aporte) {
		this.aporte = aporte;
	}


	@Override
	public String toString() {
		return "Empresa [id=" + id + ", descripcion=" + descripcion + ", aporte=" + aporte + "]";
	}
	
	

}
