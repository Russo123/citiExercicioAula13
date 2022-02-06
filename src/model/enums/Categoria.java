package model.enums;

public enum Categoria {
	
	BASICO(1, "B�sico"),
	INTERMEDIARIO(2, "Intermedi�rio"),
	EXECUTIVO(3, "Executivo"),
	PREMIUM(4, "Premium");
	
	private final int codigo;
	private final String categoriaPorExtenso;
	
	private Categoria(int codigo, String categoriaPorExtenso ) {
		this.codigo = codigo;
		this.categoriaPorExtenso = categoriaPorExtenso;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getCategoriaPorExtenso() {
		return categoriaPorExtenso;
	}
	
	
}
