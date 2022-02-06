package model;

public class Cliente {

	private Integer id;
	private String nome;
	private int idade;
	private Veiculo veiculo;
	private int quantidadeDeVeiculos;
	private int quantidadeDeDias;

	public Cliente(Integer id, String nome, int idade, Veiculo veiculo, int quantidadeDeVeiculos, int quantidadeDeDias) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.veiculo = veiculo;
		this.quantidadeDeVeiculos = quantidadeDeVeiculos;
		this.quantidadeDeDias = quantidadeDeDias;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public int getQuantidadeDeVeiculos() {
		return quantidadeDeVeiculos;
	}

	public void setQuantidadeDeVeiculos(int quantidadeDeVeiculos) {
		this.quantidadeDeVeiculos = quantidadeDeVeiculos;
	}

	public int getQuantidadeDeDias() {
		return quantidadeDeDias;
	}

	public void setQuantidadeDeDias(int quantidadeDeDias) {
		this.quantidadeDeDias = quantidadeDeDias;
	}

}
