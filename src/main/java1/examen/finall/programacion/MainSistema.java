package examen.finall.programacion;

import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); //Teclado para int
		Scanner teclado2 = new Scanner(System.in); // Teclado para String
		int opcion;
		int contador = 0;
		Poliza sistema[] = new Poliza[100];
		do {
			System.out.println("#################################");
			System.out.println("ASEGURADORA DEL SUR, elija una opci�n:");
			System.out.println("   1.Ingresar P�liza");
			System.out.println("   2.Actualizar Valor");
			System.out.println("   3.Consultar P�liza");
			System.out.println("   4.Imprimir Reporte");
			System.out.println("   5.SALIR");
			System.out.println("#################################");
			opcion = teclado.nextInt();
			
			if (opcion == 1) {
				System.out.println(" ");
				System.out.println("�Qu� tipo de p�liza desea escoger?");
				System.out.println("   a)P�liza General");
				System.out.println("   b)P�liza Vip");
				System.out.println(" ");
				System.out.println("Seleccione una opci�n:");
				String opcion2 = teclado2.nextLine();
				if (opcion2.equals("a")) {
					System.out.println("Ingrese su nombre: ");
					String nombre = teclado2.nextLine();
					System.out.println("Ingrese la descripci�n: ");
					String descripcion = teclado2.nextLine();
					System.out.println("Ingrese el a�o de vigencia: ");
					String a�oVigencia = teclado2.nextLine();
					System.out.println("Ingrese el c�digo de p�liza");
					String codigoPoliza = teclado2.nextLine();
					System.out.println("Ingrese el valor de la p�liza: ");
					int valorPoliza = teclado.nextInt();
					System.out.println("Ingrese el c�digo de descuento: ");
					String codigoDescuento = teclado2.nextLine();
					System.out.println("Ingrese el n�mero de seguro: ");
					String numeroSeguro = teclado2.nextLine();
					
					for(int i = 0 ; i < contador ; i++) {
						PolizaGeneral beneficiado = new PolizaGeneral();
					}
					
				} else if (opcion2.equals("b")) {
					System.out.println("Ingrese su nombre: ");
					String nombre = teclado2.nextLine();
					System.out.println("Ingrese la descripci�n: ");
					String descripcion = teclado2.nextLine();
					System.out.println("Ingrese el a�o de vigencia: ");
					String a�oVigencia = teclado2.nextLine();
					System.out.println("Ingrese el c�digo de p�liza");
					String codigoPoliza = teclado2.nextLine();
					System.out.println("Ingrese el valor de la p�liza: ");
					int valorPoliza = teclado.nextInt();
					System.out.println("Ingrese el beneficio: ");
					String beneficio = teclado2.nextLine();
					
					for(int i = 0 ; i < contador ; i++) {
						PolizaVip beneficiado = new PolizaVip();
					}
					
				}
				
			} else if (opcion == 2) {
				
				
			} else if (opcion == 3) {
				
				
			} else if (opcion == 4) {
				
				
			} else if (opcion < 1 || opcion > 5) {
				System.out.println("Opcion invalida...");
				
			}
		}while(opcion != 5);

	}

}
