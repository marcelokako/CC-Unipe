public class Calculadora {
    public static int soma(int a, int b){
        return a+b;
    }

    public static int soma(int a, int b, int c){
        return a+b+c;
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * Calculadora.calcularFatorial(n - 1);
        }
    }
}

class Produto{
    private String nome;
    private int preco;

    public Produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

    public int getSoma(Produto p){
        return Calculadora.soma(p.preco, preco);
    }
}
