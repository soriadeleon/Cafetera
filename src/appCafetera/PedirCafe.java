package appCafetera;

import java.util.Scanner;

public class PedirCafe {

	public static void main(String[] args) {
		

	//Creación de la cafetera
		
		Cafetera cafetera = new Cafetera();
		
		
	//Encender cafetera
		
		cafetera.Encender();
					
	//Cafetera en espera
		
		cafetera.Esperar();
		
	//Menu Principal
		
		cafetera.MenuPrincipal();
		
	//Hacer cafe
		//Cafe cafe = new Cafe();
		
	//Limpiar cafetera
		//La llamada esta dentro del SWITCH de MENU PRINCIPAL en CAFETERA.JAVA
		
	//Cafe terminado

		cafetera.Terminado();
			
		
	//Apagar cafetera

		cafetera.Apagar();
		
		
	}

}
