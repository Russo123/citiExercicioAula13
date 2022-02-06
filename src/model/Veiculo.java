package model;

import model.enums.Categoria;
import model.enums.Marca;

public class Veiculo {

	private Integer id;
	private String modelo;
	private String motor;
	private String cor;
	private Marca marca;
	private Categoria categoria;
	private double preco;

	public Veiculo(Integer id, String modelo, String motor, String cor, Marca marca, Categoria categoria,
			double preco) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.motor = motor;
		this.cor = cor;
		this.marca = marca;
		this.categoria = categoria;
		this.preco = preco;
	}

	public Veiculo(Integer id, String modelo, String motor, Marca marca, Categoria categoria,
			double preco) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.motor = motor;
		this.marca = marca;
		this.categoria = categoria;
		this.preco = preco;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
