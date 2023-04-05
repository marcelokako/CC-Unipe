
public class Secundaria {

	
	public static String gerador(int num) {
		java.util.Random rand = new java.util.Random();
		String resp = "";
		int temp;
		for (int i=0; i<num;i++) {
			temp = rand.nextInt(90) + 10; // gera numero entre 10 e 99  
			resp = resp.concat(Integer.toString(temp));
			resp = resp.concat(" ");
		}
		
		return resp;
	}
}
