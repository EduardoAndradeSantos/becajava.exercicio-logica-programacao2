import java.util.Scanner;

public class exercicioLogica2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 
		float salario, porcentagem, reajuste;
		
		System.out.printf("Digite o salario: ");
		salario = (float) ler.nextDouble();
		
		System.out.printf("Digite a porcentagem do reajuste: ");
		porcentagem = (float) ler.nextDouble();
		
		reajuste = ((salario/100)*(porcentagem))+salario;
		
		System.out.println("valor reajustado: "+reajuste);
	}

}
