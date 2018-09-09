import javax.swing.JOptionPane;

public class Principal 
{
	
	public static void main(String[] args) 
	{
		
		int numeros[] = {1235,99,56,77,55,450};
		int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero para buscar: "));
		
		OrdenacaoBolha ordenar = new OrdenacaoBolha();
		ordenar.ordenarBolha(numeros);
		
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println(numeros[i]);
		}
		BuscaBinaria buscar = new BuscaBinaria();
		buscar.binaria(x, numeros);
		
		if(buscar.binaria(x, numeros) == true)
		{
			System.out.println("\nNumero "+x+" encontrado!");
		}
		else
		{
			System.out.println("\nO numero "+x+" não foi encontrado!");
		}
		
	}

}
