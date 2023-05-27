package Soal_Pertama;
import java.util.*;
public class Soal2_2 {

    public static void main(String[] args) {
        int n, r;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        n = inputUser.nextInt();
        r = 1;
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < (n+1)/2) {   // n/2+1 kalau n ganjil, n/2 kalau n genap
                nilai[i] = i + 1;
            } else {
                nilai[i] = i + 1 - 2 * r;
                r = r + 1;
            }
        }
        System.out.print(Arrays.toString(nilai));
    }
}