package modelo;

public class Grupo {
	private int idgrupo;
	private String nombre;
	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grupo(String nombre) {
		super();
		this.idgrupo = vistacontrol.Aplicacion.getID_G();;
		this.nombre = nombre;
	}
	public int getIdgrupo() {
		return idgrupo;
	}
	public void setIdgrupo(int idgrupo) {
		this.idgrupo = idgrupo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	

}
