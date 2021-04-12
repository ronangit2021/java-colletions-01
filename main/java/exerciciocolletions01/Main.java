package exerciciocolletions01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main app = new Main ();
		app.start();

	}

	private void start() {
		List<String> nomes = new ArrayList<String>();
		for (int i=0; i<5; i++) {		
			System.out.println("Digite um valor: ");			
			String nomesRecebidos = obterDados();
			
			if(nomesRecebidos.equals("INVÁLIDO")) {				
				System.out.println("Valor inválido ou vazio");
			}				
			else {
				nomes.add(nomesRecebidos);
			}		
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(nomes.get(i));
		}
		nomes.add("item adicionando automaticamente 01");
		nomes.add("item adicionando automaticamente 02");
		nomes.remove(1);
		nomes.remove(1);
		for(int i=0;i<5;i++) {
			System.out.println(nomes.get(i));
		}
	}

	private String obterDados() {
		Scanner ler = new Scanner(System.in);
		String nome = new String();
		try {
			nome = ler.nextLine();		
		}
		catch(Exception e){
			return "INVÁLIDO";
		}	
		return nome;
		
	}

}
