package exAnimal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Para o usuário digitar valores.
		int op = 0;
	
		try { 	//método try/catch genérico para evitar alguns erros, lançando uma exceção caso seja encontrado algum problema.
			System.out.println("Crie o seu novo animal. \nInsira o nome: ");
			String nome = sc.nextLine();
			System.out.println("Insira a classe: ");
			String classe = sc.nextLine();
			System.out.println("Insira a família: ");
			String familia = sc.nextLine();
			
			Animais a1 = new Animais(nome, classe, familia);
			System.out.println(a1.nasceu());
			
			while (op != 4) {
				System.out.println("O que o " + a1.getNome() + " vai fazer agora?" + "\n1 - Comer \n2 - Correr \n3 - Dormir\n4 - Morrer");
				op = sc.nextInt();
				
				if (op > 0 || op < 5) {					
					switch (op) {
					case 1:
						System.out.println(a1.comer());
						break;
					case 2:
						System.out.println(a1.correr());
						break;
					case 3:
						System.out.println(a1.dormir());
						break;
					case 4:
						System.out.println(a1.morrer());
						break;						
					}				
				
				} else {
					System.out.println("Opção Inválida, tente novamente.");
				}
			}
			System.out.println("GAME OVER!");
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {   //Fecha o Scanner, para que softwares maliciosos não consigam inserir códigos maliciosos.
			sc.close();
		
		}
	}

}
