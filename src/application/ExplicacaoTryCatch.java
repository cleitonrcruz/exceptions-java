package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExplicacaoTryCatch {
	public static void main(String[] args) {
		File file = new File("C:\\Java\\Java com NelioAlvez\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}