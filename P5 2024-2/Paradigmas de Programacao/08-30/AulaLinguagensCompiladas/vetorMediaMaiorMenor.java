//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] vetor = {5, 12, 7, 20, 15, 8, 3, 11, 6, 9};
        int soma = 0;
        int maiorValor = vetor[0];
        int menorValor = vetor[0];
        for (int i = 0; i< vetor.length; i++){
            soma += vetor[i];
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
            }
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }
        float media = (float) soma / vetor.length;
        
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maiorValor);
        System.out.println("Menor: " + menorValor);
    }
}
