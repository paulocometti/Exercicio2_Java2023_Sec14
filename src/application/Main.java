package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.PersonIndividual;
import entities.PersonCompany;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anual = sc.nextDouble();
			
			if(resp == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new PersonIndividual(name, anual, health));
			}
			else if(resp == 'c'){
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new PersonCompany(name, anual, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Person p : list) {
			System.out.println(p);
		}
		
		System.out.println();
		double total = 0;
		for(Person p : list) {
			total += p.totalTax(); 
		}
		System.out.println("TOTAL TAXES: "+total);
		
		sc.close();
	}

}
