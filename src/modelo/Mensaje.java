package modelo;

public class Mensaje {

	private int idmensaje;
	private String mensaje;
	private int idusuario;
	private int iddestino;
	private String tipo;
	public Mensaje() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mensaje(String mensaje, int idusuario, int iddestino, String tipo) {
		super();
		this.idmensaje = vistacontrol.Aplicacion.getID_M();;
		this.mensaje = mensaje;
		this.idusuario = idusuario;
		this.iddestino = iddestino;
		this.tipo = tipo;
	}
	public int getIdmensaje() {
		return idmensaje;
	}
	public void setIdmensaje(int idmensaje) {
		this.idmensaje = idmensaje;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
	
	
}
