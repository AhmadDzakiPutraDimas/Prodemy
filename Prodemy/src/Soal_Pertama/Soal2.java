package Soal_Pertama;
import java.util.*;
public class Soal2 {

	public static void main(String[] args) {
		// SOAL 2.1 DERET FIBBONACCI
		
		int fn, fn_1, fn_2,n;
		
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Masukkan n bilangan fibonacci : ");
		n = inputUser.nextInt();
		
		fn_1 = 1; fn_2 = 0; fn = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(fn + " ");
			fn = fn_1 + fn_2;
			fn_2 = fn_1;
			fn_1 = fn;
		}
	}

}
