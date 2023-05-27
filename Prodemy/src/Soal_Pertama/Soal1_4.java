package Soal_Pertama;
import java.util.*;
public class Soal1_4 {

	public static void main(String[] args) {
		// SOAL 1.4 Pola Angka bilangan Ganjil
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Masukkan nilai awal :");
		int awal = inputUser.nextInt();
		System.out.print("Masukkan nilai akhir:");
		int akhir = inputUser.nextInt();
		for (int i = awal; i <= akhir; i++) {
			for (int j = awal; j <= akhir; j++) {
				int bil_ganjil = i % 2;
				if (bil_ganjil == 1) {
					if (i==j || i+j== akhir)
					System.out.print(i+ " ");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
