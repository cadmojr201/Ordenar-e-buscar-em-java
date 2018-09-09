
public class OrdenacaoBolha 
{
	public int ordenarBolha(int numeros[]) 
	{
		//int numeros[] = {93,112,8,100};
		
		int x;
		
		for(int i=1;i<numeros.length;i++)
		{
			for(int j=numeros.length-1;j>=i;j--)
			{
				if(numeros[j-1]>numeros[j])
				{
					x=numeros[j-1];
					numeros[j-1]=numeros[j];
					numeros[j]=x;
				}
				
			}
			
			System.out.printf("\n%s%2d","Interação",i);
			
			for(int k=0; k<numeros.length;k++)
			{
				System.out.printf("%5d", numeros[k]);
			}
			
		}
		System.out.println("\n");
		return 0;
	}
}
