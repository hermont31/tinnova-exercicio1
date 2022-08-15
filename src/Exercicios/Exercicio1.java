package Exercicios;

public class Exercicio1 {

	Integer total = 1000;
	Integer validos = 800;
	Integer brancos = 150;
	Integer nulos = 50;
	
		
	public Exercicio1() {
	}
	public Integer percentualValidos() {
		return 100*validos/total;
	}
	public Integer percentualBrancos() {
		return 100*brancos/total;
	}
	public Integer percentualNulos() {
		return 100*nulos/total;
	}
}
