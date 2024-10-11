public interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Este é o corpo do relatorio: " + conteudo);
    }
}

class Contrato implements Imprimivel {
    private String conteudo;
    private String contratante;

    public Contrato(String conteudo, String contratante) {
        this.conteudo = conteudo;
        this.contratante = contratante;
    }

    @Override
    public void imprimir() {
        System.out.println("Este é o corpo do contrato: " + conteudo + " de " + contratante);
    }
}
