package Soal_Pertama;
import java.util.*;
public class Soal2_2b {

    public static void main(String[] args) {
        int n = 9; 
        int r = 1;
        int[] nilai = new int[9];
        for (int i = 0; i < n; i++) {
            if (i < 5) {
                nilai[i] = i + 1;
            } else {
                nilai[i] = i + 1 - 2 * r;
                r = r + 1;
            }
        }
        System.out.println(nilai);
    }
}

