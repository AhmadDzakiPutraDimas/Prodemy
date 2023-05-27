package Soal_Pertama;

import java.util.*;

public class Soal_3 {

	public static void main(String[] args) {
		int fn, fn_1, fn_2, fn_3, n;
		
		// SOAL 3 Deret Tribonacci
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Masukkan n Tribonacci : ");
		n = inputUser.nextInt();
		
		fn_1 = 1; fn_2 = 1; fn_3 = 1; fn = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(fn + " ");
			fn = fn_1 + fn_2 + fn_3;
			fn_3 = fn_2;
			fn_2 = fn_1;
			fn_1 = fn;
			
		}

	}

}
