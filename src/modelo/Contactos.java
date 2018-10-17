package modelo;

public class Contactos {
	private int idecontacto;
	private int idusuario;
	private int idamigo;
	public Contactos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contactos(int idusuario, int idamigo) {
		super();
		this.idecontacto = vistacontrol.Aplicacion.getID_C();
		this.idusuario = idusuario;
		this.idamigo = idamigo;
	}
	public int getIdecontacto() {
		return idecontacto;
	}
	public void setIdecontacto(int idecontacto) {
		this.idecontacto = idecontacto;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getIdamigo() {
		return idamigo;
	}
	public void setIdamigo(int idamigo) {
		this.idamigo = idamigo;
	}
	

}
