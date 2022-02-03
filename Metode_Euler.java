package Exercici;

import java.util.Scanner;

public class Metode_Euler {

	private double num;

	public Metode_Euler() {
	}

	public void setNum(double num) {this.num = num;} 
	public double getNum() {return num;}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metode_Euler other = (Metode_Euler) obj;
		return num == other.num;
	}

	@Override
	public String toString() {
		return "Recursivitat [" + num + "]";
	}
	
	public static void main(String[] args){
		
		Scanner  sc = new Scanner(System.in);
		Metode_Euler r = new Metode_Euler();
	
		double sum = 0;
		double euler = 0;

		System.out.print("Introdueix el nombre de casos que vols realitzar: ");
		int x = sc.nextInt();
		sc.nextLine();

		double decimals[] = new double[x];
		double result[] = new double[x];


		System.out.println("Introdueix el nombre de decimals: ");
		for (int y=0; y<decimals.length; y++) {
			decimals[y] = sc.nextInt();
			sc.nextLine();
		}
		
		for (int y=0; y<decimals.length; y++) {
			double n = 0;
			while (decimals[y]+1>n) {
				sum = (1d/r.factorial(n));
				euler += sum;
				n++;
			}
			result[y] = euler;
			
			sum = 0;
			euler = 0;
		}
		
		System.out.println("Resultats: ");
		for (int y=0; y<result.length; y++) {
			System.out.println(result[y]);
		}
	}
	
	public double factorial(double n) {
		if (n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
}
