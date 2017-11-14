
public class Numero {


		
		
		double var1, var2;
	
	Numero ()
	{
	}
		
		
	void ValidaNumero () throws Exception
	{
		if (var1 <= 0)
		{
			throw new Exception ("O número 1 precisa ser maior que 0 ");
			
		}
		
		if (var2 <=0)
			
			throw new Exception ("O número 2 precisa ser maior que 0 ");
	}

	
	double Dividir (){
		
		return var1/var2;
	}
}
 

