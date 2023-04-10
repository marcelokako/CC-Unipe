
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

	public static String separador(String lista) {
		String resp = "oi";
		int tamanho = (lista.length()/3); // cada numero adicionado na lista possui 3 char
		int linhas = 0;
		int sequencia = 1;
		int incremento = 1;
		while (tamanho>=sequencia) {
			
			sequencia = sequencia + ++incremento;
			//System.out.println(sequencia);

			linhas++;
		}
		System.out.println(linhas);
		return resp;
	}//------------------------------------------------------------------separador

	
}
