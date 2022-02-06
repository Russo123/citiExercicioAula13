package servico;

import java.util.HashMap;
import java.util.Map;

import model.Veiculo;
import model.enums.Categoria;
import model.enums.Marca;

public class DadosVeiculos {

	public Map<Integer, Veiculo> carregarVeiculos() {

		try {

			Map<Integer, Veiculo> veiculos = new HashMap<>();

			var veiculo1 = new Veiculo(1, "Modelo Way", "Motor 1.0", "Cor Preto", Marca.FIAT, Categoria.BASICO, 130.00);
			var veiculo2 = new Veiculo(2, "Modelo G3", "Motor 1.0", "Cor Branco", Marca.VW, Categoria.BASICO, 150.00);
			var veiculo3 = new Veiculo(3, "Renegade - Modelo std AT", "Motor 1.8", Marca.JEEP, Categoria.INTERMEDIARIO,
					350.00);
			var veiculo4 = new Veiculo(4, "Duster - Modelo Dynamique", "Motor 1.6", Marca.RENAULT,
					Categoria.INTERMEDIARIO, 350.00);
			var veiculo5 = new Veiculo(5, "Hilux – Modelo SW4", "Motor 3.0", Marca.TOYOTA, Categoria.EXECUTIVO,
					1500.00);
			var veiculo6 = new Veiculo(6, "TrailBlazer – Modelo LTZ –", "Motor 3.0", Marca.GM, Categoria.EXECUTIVO,
					1800.00);
			var veiculo7 = new Veiculo(7, "Cayenne – Modelo turbo GT", "Motor 4.0", Marca.PORSCHE, Categoria.PREMIUM,
					3500.00);
			var veiculo8 = new Veiculo(8, "Mustang - Modelo Mach 1", "Motor 5.0", Marca.FORD, Categoria.PREMIUM,
					4000.00);

			veiculos.put(1, veiculo1);
			veiculos.put(2, veiculo2);
			veiculos.put(3, veiculo3);
			veiculos.put(4, veiculo4);
			veiculos.put(5, veiculo5);
			veiculos.put(6, veiculo6);
			veiculos.put(7, veiculo7);
			veiculos.put(8, veiculo8);

			return veiculos;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public HashMap<String, String> veiculoEscolhido(int carroEscolhido, Map<Integer, Veiculo> veiculos) {

		HashMap<String, String> veiculoEscolhido = new HashMap<>();

		try {

			for (Map.Entry<Integer, Veiculo> veiculo : veiculos.entrySet()) {
				if (carroEscolhido == veiculo.getValue().getId()) {
					veiculoEscolhido.put("Marca", veiculo.getValue().getMarca().toString());
					veiculoEscolhido.put("Modelo", veiculo.getValue().getModelo());
					veiculoEscolhido.put("Categoria", veiculo.getValue().getCategoria().toString());
					veiculoEscolhido.put("Preco", String.valueOf(veiculo.getValue().getPreco()));
				}
			}
			return veiculoEscolhido;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public void listarTodosVeiculos(Map<Integer, Veiculo> veiculos) {
		try {

			for (Map.Entry<Integer, Veiculo> veiculo : veiculos.entrySet()) {

				Integer key = veiculo.getKey();
				var v = veiculo.getValue();

				System.out.println();
				System.out.println("Opção: " + v.getId());
				System.out.println("Modelos: " + v.getMarca() + " " + v.getModelo());
				System.out.println("Categoria: " + v.getCategoria());
				System.out.println();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
