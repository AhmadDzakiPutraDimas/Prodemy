package Soal_Pertama;
import java.util.*;
public class Soal4 {

	public static void main(String[] args) {
		
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Masukkan n :");
		int n = inputUser.nextInt();
				
		for (int i = 0; i < n; i++) {
			int fn = 1, fn1 = 1, fn2 = 0;
			for (int j = 0; j < n; j++) {
				if (i==j || i + j == n) {
				System.out.print(fn);
				} else {
				System.out.print(" ");
				}
			fn = fn1 + fn2;
			fn2 = fn1;
			fn1 = fn;
				}
		System.out.print("\n");
			}
	}
}
