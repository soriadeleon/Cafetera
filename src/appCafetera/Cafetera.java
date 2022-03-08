package appCafetera;

import java.util.Scanner;


public class Cafetera {

	
	
	Scanner in = new Scanner(System.in);
	 
	public void Encender() {
		
		System.out.println("________________________________");
		System.out.println(" ");
		System.out.println("La cafetera se esta encendiendo");
		System.out.println(" ");
		System.out.println("La cafetera esta encendida");
		System.out.println(" ");
		System.out.println("________________________________");
		
	}
	
	public void Esperar() {
		
		System.out.println("________________________________");
		System.out.println(" ");
		System.out.println("Cafetera en espera");
		System.out.println(" ");
		System.out.println("________________________________");
	}
	
	public void MenuPrincipal() {
		
		//MENU PRINCIPAL para la seleccionar la accion a realizar
		
		System.out.println("________________________________");
		System.out.println(" ");
		System.out.println("Elija una opción:");
		System.out.println(" ");
		System.out.println("Pulsar 1 para preparar un café");
		System.out.println(" ");
		System.out.println("Pulsar 2 para limpiar la cafetera");
		System.out.println(" ");
		System.out.println("Pulsar 3 para apagar la cafetera");
		System.out.println(" ");
		String menuPrincipal1 = in.next();
		System.out.println(" ");
		System.out.println("________________________________");
		
		
		//SWITCH para el flujo de la opcion elegida
		
		switch(menuPrincipal1) {
		
		case "1": //HACER CAFE
			
			System.out.println("________________________________");
			System.out.println(" ");
			Cafe cafe = new Cafe();
			cafe.ElegirIngredientes();
			System.out.println(" ");
			System.out.println("________________________________");
			break;
		
		case "2": //LIMPIAR CAFETERA
			
			System.out.println("________________________________");
			System.out.println(" ");
			Limpieza limpieza = new Limpieza();
			System.out.println(" ");
			System.out.println("________________________________");
			break;
		
		case "3": //APAGAR CAFETERA
		
			System.out.println("________________________________");
			System.out.println(" ");
			System.out.println("Apagando cafetera");
	    	System.out.println(" ");
	    	System.out.println("Cafetera apagada");
			System.out.println(" ");
			System.out.println("________________________________");
			break;
			
		default:
			System.out.println("Error");
		
		}
		
		
	}
	
    public void Terminado() {
		
		System.out.println("________________________________");
		System.out.println(" ");
		System.out.println("Proceso terminado");
		/*System.out.println(" ");
		System.out.println("¿Elija una opcion?");
		System.out.println(" ");
		System.out.println("Pulsar 1 para hacer un café");
		System.out.println(" ");
		System.out.println("Pulsar 2 para apagar la cafetera");
		System.out.println(" ");
		String menuPrincipal2 = in.next();*/
		System.out.println(" ");
		System.out.println("________________________________");
	}

    public void Apagar() {
	
    	System.out.println("________________________________");
    	System.out.println(" ");
    	System.out.println("Apagando cafetera");
    	System.out.println(" ");
    	System.out.println("Cafetera apagada");
    	System.out.println(" ");
    	System.out.println("________________________________");
	
	}
	

}
	


