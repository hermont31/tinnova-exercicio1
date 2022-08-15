package Exercicios;

public class Exercicio2 {

		
	public void bubbleSort(Integer[] vetor) {
		
		Integer len = vetor.length;
		
		for(int i=0; i<len-1; ++i) {
			
			//Após o "for J" estiver completo 
			//um número será ordenado e não precisará ser ordenado novamente
			
			// "for print" apenas para mostrar a ordenação
			for (int print = 0; print < len; ++print) {
				System.out.print(vetor[print] + " ");
			}	
			    System.out.println("");
		
			for (int j=0; j<len-i-1; ++j ) {
				
				if(vetor[j+1]<vetor[j]) {
					int guarda = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = guarda;
				}
	     	}
		}
		
		System.out.println("Vetor Ordenado!");
		
	}
	
}
