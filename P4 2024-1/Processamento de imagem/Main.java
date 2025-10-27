import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // String url_imagem = "exe.png";
        String url_imagem1 = "exemplo.png";
        String url_imagem2= "exemplo_VAR.png";

        BufferedImage imagem1 = ManipulaImg.pegarImagem(url_imagem1);
        BufferedImage imagem2 = ManipulaImg.pegarImagem(url_imagem2);
        //BufferedImage imagem2 = ManipulaImg.pegarImagem(url_imagem2);

        BufferedImage diferencas = OperacoesManuais.MostraDiferenca(imagem1, imagem2);

        ManipulaImg.exibirImagem(
                "Processamento de imagem",
               imagem1
                ,imagem2
                ,diferencas
                );

        //ManipulaImg.salvarImagem(imagem, "png", "/exemplo_edit.png");
    }

}
