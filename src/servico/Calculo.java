package servico;

public class Calculo {

	public void calculoTotal(double valorDoCarro, int quantidadeDeDias, int quantidadeDeVeiculos, String categoria) {
		
		double calculoTotal;
		if(categoria == "BASICO") {
			double calculo = (valorDoCarro * quantidadeDeVeiculos) * quantidadeDeDias;
		}
		
	}
}
