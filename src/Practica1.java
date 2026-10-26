import java.util.Scanner;
public class Practica1 {
	 static Scanner sc = new Scanner(System.in);
	String nombre;
	String apellido;
	String cedula;
	String servicio;
	int turnoasignado;
	int cubiculo;
	static int siguienteturno = 1;
	
	public void ingresarDatos (String nombre1, String apellido1, String cedula1) {
		nombre = nombre1;
        apellido = apellido1;
        cedula = cedula1;
	}
	
	public void generarServicio (String servicio1) {
		servicio = servicio1;
		turnoasignado =  siguienteturno;
		siguienteturno++;
	}
	
	public void imprimirInfo () {
		System.out.println("Nombre de la persona: " + nombre);
		System.out.println("Apellido : " + apellido);
		System.out.println("Cedula : " + cedula);
		System.out.println("Servicio : " + servicio);
		System.out.println("Turno Asignado : " + turnoasignado);
	}
	
	public void asignaCubiculo (int cubiculodesocupado) {
		cubiculo = cubiculodesocupado;
		System.out.println("Cubiculo asignado: " + cubiculo);
		imprimirInfo();
	}
	
	 public static void main(String[] args) {

	        Practica1 usuario = new Practica1();

	        System.out.print("Ingrese su nombre: ");
	        String nombre = sc.nextLine();

	        System.out.print("Ingrese su apellido: ");
	        String apellido = sc.nextLine();

	        System.out.print("Ingrese su cedula: ");
	        String cedula = sc.nextLine();

	        usuario.ingresarDatos(nombre, apellido, cedula);

	        System.out.print("Ingrese el servicio: ");
	        String servicio = sc.nextLine();

	        usuario.generarServicio(servicio);

	        usuario.imprimirInfo();

	        System.out.print("Ingrese el numero de cubiculo: ");
	        int cubiculo = sc.nextInt();

	        usuario.asignaCubiculo(cubiculo);
	    }

}
