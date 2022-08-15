package Exercicios;

public class Exercicio3 {

	public Integer fatorial(Integer num) {
		
		if (num == 0)
			return 1;
		else
			return num*fatorial(num-1);
	}
	
	
}
