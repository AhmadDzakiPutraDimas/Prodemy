package Soal_Kedua;

import java.util.*;

public class SoalPadding_Left_Right {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Masukkan kata : ");
		String name = userInput.nextLine();
		
		System.out.println("--------------------");
		System.out.println("Kata yang akan di Padding");
		for (int i = 0; i < name.length(); i++) {
			
			System.out.format("%s ) %s\n", MyString(name).padLeft(10,' ')); 
		}

	}
	static MyString MyString(String value) {
		
		return new MyString(value);
	}
	
	private static class MyString{
		final String self;
		private MyString (String v) {
			self = v == null ? " " : v ;
		}
		
		public String padLeft(int totalPanjang, char paddingChar) {
			
			return self;
		}
	}


}
