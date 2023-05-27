package Soal_Pertama;
import java.util.*;
public class Soal1_2 {

	public static void main(String[] args) {
		// SOAL 1.2 Pola X
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Masukkan n :");
		int n = inputUser.nextInt();
		char X [][] = new char [n][n];
		for (int i=0; i<=n; i++){
			for (int j=0; j<=n; j++) {
				if((i==j) || (i+j) == n)
					System.out.print("* ");
				else;
					System.out.print(" ");	
			}
			System.out.println();
		}

	}

}
