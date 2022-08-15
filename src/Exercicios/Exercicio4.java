package Exercicios;

public class Exercicio4 {

	public Integer somamultiplos(Integer num) {
		
		int soma = 0;
		
		for (int i=num-1;i>=3; i--) {
			if (i % 3 == 0 || i % 5 == 0) {
				
				soma = soma + i;
			}
			
		}
				
		
		return soma;
	}
	
	
}
