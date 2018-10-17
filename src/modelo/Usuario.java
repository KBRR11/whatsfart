package modelo;

public class Usuario {

	protected int idusuario;
	protected String nombre;
	protected String usuario;
	protected String clave;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String usuario, String clave) {
		super();
		this.idusuario = vistacontrol.Aplicacion.getID_U();;
		this.nombre = nombre;
		this.usuario = usuario;
		this.clave = clave;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
	
}
