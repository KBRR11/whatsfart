package modelo;

public class Usuario_Grupo {
	private int idusuario_grupo;
	private int idusuario;
	private int idgupo;
	public Usuario_Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario_Grupo(int idusuario, int idgupo) {
		super();
		this.idusuario_grupo = vistacontrol.Aplicacion.getID_UG();;
		this.idusuario = idusuario;
		this.idgupo = idgupo;
	}
	public int getIdusuario_grupo() {
		return idusuario_grupo;
	}
	public void setIdusuario_grupo(int idusuario_grupo) {
		this.idusuario_grupo = idusuario_grupo;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getIdgupo() {
		return idgupo;
	}
	public void setIdgupo(int idgupo) {
		this.idgupo = idgupo;
	}
	

}
