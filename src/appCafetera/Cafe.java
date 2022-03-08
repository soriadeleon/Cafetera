package appCafetera;

import java.util.Scanner;

public class Cafe extends Cafetera{

	
	
	public void ElegirIngredientes() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Elige los ingredientes");
		System.out.println(" ");
		System.out.println("Introducir un numero de 0 a 100 para elegir la cantidad deseada:");
		System.out.println(" ");
		
		System.out.println("Cantidad de café");
		int qCafe = in.nextInt();
		//int cantidadCafe = Integer.parseInt (qCafe);

		if(qCafe >0 && qCafe<=100) {
			System.out.println("Cafe OK");
			
			System.out.println("Cantidad de leche");
			int qLeche = in.nextInt();
			//int cantidadLeche = Integer.parseInt (qLeche);
			System.out.println(" ");
			
			System.out.println("Cantidad de azucar");
			int qAzucar = in.nextInt();
			//int cantidadAzucar = Integer.parseInt (qAzucar);
			System.out.println(" ");
			
			System.out.println("Cantidad de canela");
			int qCanela = in.nextInt();
			//int cantidadCanela = Integer.parseInt (qCanela);
			
			System.out.println("Cafe en proceso");
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("________________________________");
			
			int total = qLeche + qCafe + qAzucar + qCanela;
			float porcentajeLeche = (qLeche * 100/ total);
			float porcentajeCafe = (qCafe * 100/ total);
			float porcentajeAzucar = (qAzucar * 100/ total);
			float porcentajeCanela = (qCanela * 100/ total);
			
			System.out.println("El café se compone de: ");
			System.out.println(porcentajeLeche + "%");
			System.out.println(porcentajeCafe + "%");
			System.out.println(porcentajeAzucar + "%");
			System.out.println(porcentajeCanela + "%");
			
			System.out.println(" ");
			System.out.println("________________________________");
			
			}else {
				System.out.println("Error");
				System.out.println(" ");
				System.out.println("Cafe no disponible");
			}
				
	}
			
		
	}

