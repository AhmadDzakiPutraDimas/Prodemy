package Soal_Kedua;
import java.util.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print(" Masukkan kata : ");
		String kata = userInput.nextLine();
		System.out.print("Masukkan panjang : ");
		int panjang = userInput.nextInt();
		
		char pad = ' ';
		
	// Padding left
		String kata_Pad = leftPadding(kata, panjang, pad);
		System.out.println("Kata awal " + kata);
		System.out.println("Kata setelah Padding :" + kata_Pad);
	// Padding Rigt
		kata_Pad = rightPadding(kata, panjang, pad);
		System.out.println("Kata awal " + kata);
		System.out.println("Kata setelah Padding :" + kata_Pad);
	}
	public static String leftPadding (String kata_LeftPad, int panjang_kata, char charPad) {
		
		StringBuilder n = new StringBuilder();
		int panjang_Padding = panjang_kata - kata_LeftPad.length();
		
		for (int i = 0; i < panjang_Padding; i++) {
			n.append(charPad);
		}
		n.append(charPad);
		return n.toString();
	}
	public static String rightPadding (String kata_rightPad, int panjang_kata2, char charPad) {
		
		StringBuilder m = new StringBuilder();
		int panjang_Padding = panjang_kata2 - kata_rightPad.length();
		
		for (int i = 0; i < panjang_Padding; i++) {
			m.append(charPad);
		}
		m.append(charPad);
		return m.toString();
}
}
