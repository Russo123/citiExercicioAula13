package exercicio1_aula13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import servico.DadosVeiculos;

public class Main {

	static int idSequencial = 1;

	public static int gerarId() {
		return idSequencial++;
	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Cliente> listaCliente = new ArrayList<Cliente>();

		DadosVeiculos veiculos = new DadosVeiculos();
		
		veiculos.carregarVeiculos();
		
		System.out.println("=======================================");
		System.out.println("= EXERCÍCIO 01 - AULA 13              =");
		System.out.println("= ALUNO: FABIANA ALVES PEREIRA RUSSO  =");
		System.out.println("=======================================");

		System.out.println("\n");

		int opcMenu = 0;
		
		do {

			System.out.println("***************************************");
			System.out.println("**********Locação de Carros************");
			System.out.println("***************************************");
			System.out.println(" 1- Cadastro de cliente");
			System.out.println(" 2- Pesquisar");
			System.out.println(" 3- Sair");
			opcMenu = sc.nextInt();

			if (opcMenu == 1) {
				System.out.println("**********Cadastro De Cliente************");
				int id = gerarId();
				
				System.out.println("Nome: ");
				String nome = sc.next();
				
				System.out.println("Idade: ");
				int idade = sc.nextInt();
				
				if(idade > 18) {
					
					int quantidadeDeVeiculos = 0;
					int quantidadeDeDias = 0;
					
					Cliente cliente = new Cliente(null, nome, idade, null, quantidadeDeVeiculos, quantidadeDeDias);
					
					System.out.println("Qual o veículo que deseja alugar?");
					veiculos.listarTodosVeiculos(veiculos.carregarVeiculos());

					Integer carroEscolhido = sc.nextInt();
					HashMap<String, String> veiculoEscolhido = new HashMap<>();
						
					veiculoEscolhido = veiculos.veiculoEscolhido(carroEscolhido, veiculos.carregarVeiculos());
					
					
					System.out.println("Qual seria a quantidade de veiculo?");
					quantidadeDeVeiculos =  sc.nextInt();
					
					System.out.println("Por quantos dias?");
					
					quantidadeDeDias = sc.nextInt();
					double valorDoCarro = Double.parseDouble(veiculoEscolhido.get("Preco"));
					
					double calculo = (valorDoCarro * quantidadeDeVeiculos) * quantidadeDeDias;
					
					
					cliente.setId(id);
					cliente.setNome(nome);
					cliente.setIdade(idade);
					
					listaCliente.add(cliente);
					
					System.out.println("Eu "+ cliente.getNome() + " com " + cliente.getIdade() + " anos " + " quero alugar "+ quantidadeDeVeiculos +" carro(s) " + veiculoEscolhido.get("Categoria") + " por " + quantidadeDeDias +" dias:");
					System.out.println("Carro escolhido " + veiculoEscolhido.get("Modelo") + ", total a ser pago na categoria "+ veiculoEscolhido.get("Categoria")+": " + calculo);
				}else {
					System.out.println("Desculpe! Você nâo tem idade para dirigir!\n");
				}
				
			}
			if (opcMenu == 2) {
				System.out.println("\nPesquisa...Em construção\n");
			}

		} while (opcMenu != 3);
		System.out.println("Até Logo!");
	}

}
