import java.text.DecimalFormat;
import java.util.Scanner;

public class Executa {

	public static void main(String[] args)  {

		int i =0;
		
			while (i == 0 ) {
				
				try {
					
					Numero n = new Numero ();
				
			
			Scanner leia = new Scanner(System.in);

			
			System.out.println("Digite o primeiro numero");

			n.var1 = leia.nextInt();

			System.out.println("Digite o segundo numero");

			n.var2 = leia.nextInt();
			
			n.ValidaNumero();

			System.out.println("Fazendo a divisão...");

			DecimalFormat df = new DecimalFormat("0");
			String v = df.format(n.Dividir());
			

			System.out.println("Valor final: " + v);

		
			leia.close();
			i=1;
			}
		
		
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
		
	}
}
	
}
