
public class BuscaBinaria 
{
	public boolean binaria (int x, int numeros[])
	{
		int inicio = 0;
		int fim = numeros.length - 1;
		int meio;
		
		while(inicio<=fim)
		{
			meio = (inicio+fim)/2;
			
			if(x == numeros[meio])
			{
				return true;
			}
			
			if(x < numeros[meio])
			{
				fim = meio-1;
			}
			else
			{
				inicio = meio+1;
			}
		}
		return false;
	}
}
