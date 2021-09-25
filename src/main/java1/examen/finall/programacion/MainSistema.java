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
			System.out.println("ASEGURADORA DEL SUR, elija una opción:");
			System.out.println("   1.Ingresar Póliza");
			System.out.println("   2.Actualizar Valor");
			System.out.println("   3.Consultar Póliza");
			System.out.println("   4.Imprimir Reporte");
			System.out.println("   5.SALIR");
			System.out.println("#################################");
			opcion = teclado.nextInt();
			
			if (opcion == 1) {
				System.out.println(" ");
				System.out.println("¿Qué tipo de póliza desea escoger?");
				System.out.println("   a)Póliza General");
				System.out.println("   b)Póliza Vip");
				System.out.println(" ");
				System.out.println("Seleccione una opción:");
				String opcion2 = teclado2.nextLine();
				if (opcion2.equals("a")) {
					System.out.println("Ingrese su nombre: ");
					String nombre = teclado2.nextLine();
					System.out.println("Ingrese la descripción: ");
					String descripcion = teclado2.nextLine();
					System.out.println("Ingrese el año de vigencia: ");
					String añoVigencia = teclado2.nextLine();
					System.out.println("Ingrese el código de póliza");
					String codigoPoliza = teclado2.nextLine();
					System.out.println("Ingrese el valor de la póliza: ");
					int valorPoliza = teclado.nextInt();
					System.out.println("Ingrese el código de descuento: ");
					String codigoDescuento = teclado2.nextLine();
					System.out.println("Ingrese el número de seguro: ");
					String numeroSeguro = teclado2.nextLine();
					
					for(int i = 0 ; i < contador ; i++) {
						PolizaGeneral beneficiado = new PolizaGeneral();
						beneficiado.setNombre(nombre);
						beneficiado.setDescripcion(descripcion);
						beneficiado.setAñoVigencia(añoVigencia);
						beneficiado.setCodigoPoliza(codigoPoliza);
						beneficiado.setValorPoliza(valorPoliza);
						beneficiado.setCodigoDescuento(codigoDescuento);
						beneficiado.setNumeroSeguro(numeroSeguro);
						sistema[i] = beneficiado;
					}
					contador = contador + 1;
					
				} else if (opcion2.equals("b")) {
					System.out.println("Ingrese su nombre: ");
					String nombre = teclado2.nextLine();
					System.out.println("Ingrese la descripción: ");
					String descripcion = teclado2.nextLine();
					System.out.println("Ingrese el año de vigencia: ");
					String añoVigencia = teclado2.nextLine();
					System.out.println("Ingrese el código de póliza");
					String codigoPoliza = teclado2.nextLine();
					System.out.println("Ingrese el valor de la póliza: ");
					int valorPoliza = teclado.nextInt();
					System.out.println("Ingrese el beneficio: ");
					String beneficio = teclado2.nextLine();
					
					for(int i = 0 ; i < contador ; i++) {
						PolizaVip beneficiado = new PolizaVip();
						beneficiado.setNombre(nombre);
						beneficiado.setDescripcion(descripcion);
						beneficiado.setAñoVigencia(añoVigencia);
						beneficiado.setCodigoPoliza(codigoPoliza);
						beneficiado.setValorPoliza(valorPoliza);
						beneficiado.setBeneficio(beneficio);
						sistema[i] = beneficiado;
					}
					contador = contador + 1;
					
				}
				
			} else if (opcion == 2) {
				System.out.println("Ingrese el código de la póliza: ");
				String codigoIngresado = teclado2.nextLine();
				for (int i = 0; i <= sistema.length; i++) {
					Poliza poliza = sistema[i];
					boolean encontro = poliza.getCodigoPoliza().contains(codigoIngresado);
					if (encontro == true) {
						System.out.println("Ingrese el nuevo código de su póliza: ");
						String codigoPoliza2 = teclado2.nextLine();
						poliza.setCodigoPoliza(codigoPoliza2);
						
					} else {
						System.out.println("No se ha encontrado su póliza...");
					}
				}
				
			} else if (opcion == 3) {
				System.out.println("Ingrese el código de la póliza: ");
				String codigoIngresado = teclado2.nextLine();
				for (int i = 0; i <= sistema.length; i++) {
					Poliza poliza = sistema[i];
					boolean encontro = poliza.getCodigoPoliza().contains(codigoIngresado);
					if (encontro == true) {
						System.out.println(sistema[i]);
						
					} else {
						System.out.println("No se ha encontrado su póliza...");
						
					}
				}
				
			} else if (opcion == 4) {
				
				
			} else if (opcion < 1 || opcion > 5) {
				System.out.println("Opcion invalida...");
				
			}
		}while(opcion != 5);

	}

}
