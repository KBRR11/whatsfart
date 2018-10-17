package vistacontrol;

// Hola keny
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;

public class Aplicacion {
	private static Scanner in = new Scanner(System.in);
	private static ArrayList<Contactos> cont = new ArrayList<>();
	private static ArrayList<Grupo> group = new ArrayList<>();
	private static ArrayList<Mensaje> mns = new ArrayList<>();
	private static ArrayList<Usuario> user = new ArrayList<>();
	private static ArrayList<Usuario_Grupo> g_user = new ArrayList<>();
	private static int ID_C = 0;
	private static int ID_G = 0;
	private static int ID_M = 0;
	private static int ID_U = 0;
	private static int ID_UG = 0;
	private static int user_log = 0;
	private static boolean state = false;
	public static int getID_C() {
		ID_C++;
		return ID_C;
	}
	public static int getID_G() {
		ID_G++;
		return ID_G;
	}
	public static int getID_M() {
		ID_M++;
		return ID_M;
	}
	public static int getID_U() {
		ID_U++;
		return ID_U;
	}
	public static int getID_UG() {
		ID_UG++;
		return ID_UG;
	}
	
	//MENUS///////////////////////////////////////////////////////////////////////////////////////
	
	public static void Menu_INICIAL() {
		System.out.println("*********BIENVENIDO*********");
		System.out.println("\t1. Iniciar sesion");
		System.out.println("\t2. Registrarse");
		System.out.println("\t3. Salir");
		System.out.print("Ingrese un numero [1,3]: ");
	}
	
	//METODOS PRINCIPALES////////////////////////////////////////////////////////////////////////
	
	public static void Registro() {
		int n;
		do {
			Menu_INICIAL();
			n=Integer.valueOf(in.nextLine());
			switch (n) {
			case 1:
				Login();
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("May the force be with you...");
				break;
			default:
				break;
			}
			
		}while(n!=3 && state==false);
	}
	
	
	public static boolean Login() {
		boolean state=false;
		System.out.println();
		System.out.println("*******Login*******");		
		System.out.print("Ingrese su USERNAME: ");
		String name = in.nextLine();				
		System.out.print("Ingrese su contrasena: ");
		String pass= in.nextLine();		
		state = validar_LOGIN(name, pass);

	}
	
	//METODOS AUXILIARES/////////////////////////////////////////////////////////////////////////
	
	public static boolean validar_NAME(String name) {
		boolean val = true;
		for(Usuario u: user) {
			if(name.equals(u.getUsuario())) {
				val = false;
			}
		}
		return val;
	}
	
	public static boolean validar_LOGIN(String name, String pass) {
		boolean val = false;
		for(Usuario u: user) {
			if(name.equals(u.getUsuario()) && pass.equals(u.getClave())) {
				
			}
		}
		return val;
	}
	
	
	
	
	public static void main(String[] args) {
		Registro();
		if(state) {
			//aca esta el switch principal
		}
	}
}
