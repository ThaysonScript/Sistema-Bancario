package repositories;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerDados {
	public static void main(String[] args) {		
		File arquivo = new File("dados/teste.txt");
		Scanner scan = null;
		
		try {
			scan = new Scanner(arquivo);
			
			while(scan.hasNextLine()) {
				String linha = scan.nextLine();
				System.out.println(linha);
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
			
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}
}
