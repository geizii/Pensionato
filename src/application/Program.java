package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rent[] vetor = new Rent[10];
		
		System.out.println("Quantos quartos serão alugados ?");
		int n = sc.nextInt();
		
		for(int i=1; i<= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email :");
			String email = sc.next();
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();
			
			vetor[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados");
		for(int i=0;i<10;i++) {
			if (vetor[i] != null) {
				System.out.println(i + ":" + vetor[i]);
			}
		}
		
		sc.close();
	}

}
