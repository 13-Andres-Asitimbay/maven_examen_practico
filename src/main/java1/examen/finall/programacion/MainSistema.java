package examen.finall.programacion;

import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("#################################");
			System.out.println("ASEGURADORA DEL SUR, elija una opción:");
			System.out.println("1.Ingresar Póliza");
			System.out.println("2.Actualizar Valor");
			System.out.println("3.Consultar Póliza");
			System.out.println("4.Imprimir Reporte");
			System.out.println("5.SALIR");
			System.out.println("#################################");
			opcion = teclado.nextInt();
			
		}while(opcion != 5);

	}

}
