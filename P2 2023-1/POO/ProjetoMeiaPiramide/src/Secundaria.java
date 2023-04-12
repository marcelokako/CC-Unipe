
public class Secundaria {

	
	public static String gerador(int num) {
		java.util.Random rand = new java.util.Random();
		String resp = "";
		int temp;
		for (int i=0; i<num;i++) {
			temp = rand.nextInt(90) + 10; // gera numero entre 10 e 99  
			resp = resp.concat(Integer.toString(temp)); // adiciona numero à string
			resp = resp.concat(" ");// adiciona espaço depois do numero
		}
		
		return resp;
	}//------------------------------------------------------------------gerador

	public static int separador(String lista) {
		int tamanho = (lista.length()/3); // cada numero adicionado na lista possui 3 char
		String[] array = lista.split(" ");
		int linhas = 1;
		int sequencia = 1;
		int incremento = 1;
		int contador = 0;
		while (tamanho>sequencia) {
			//System.out.println("\n contador: "+contador+"\n tamanho: "+ tamanho);
			//System.out.println("\n sequencia: "+sequencia+"\n incremento: "+ incremento);

			for (int i = 0; i<incremento; i++) {
				System.out.printf(array[contador++] + " ");
			}
			System.out.println();
			
			sequencia = sequencia + ++incremento;

			linhas++;
		}
		
		while (contador<tamanho) {
			System.out.printf(array[contador++] + " ");
		}
		
		return linhas;
	}//------------------------------------------------------------------separador

	
}
