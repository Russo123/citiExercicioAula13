package model.enums;

public enum Marca {
	FIAT(1, "Fiat"), 
	VW(2, "Volkswagen"), 
	JEEP(3, "Jeep"), 
	RENAULT(4, "Renault"), 
	TOYOTA(5, "Toyota"), 
	GM(6, "General Motors"), 
	PORSCHE(7, "Porsche"), 
	FORD(8, "Ford");

	private final int codigo;
	private final String marcaPorExtenso;

	private Marca(int codigo, String marcaPorExtenso) {
		this.codigo = codigo;
		this.marcaPorExtenso = marcaPorExtenso;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getMarcaPorExtenso() {
		return marcaPorExtenso;
	}
}
