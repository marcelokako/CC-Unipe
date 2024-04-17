import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String url_imagem = "menino.png";
        //String url_imagem2= "exemplo2_VAR.png";
        // String url_imagem = "src/exemplo.png";

        BufferedImage imagemAntes = ManipulaImg.pegarImagem(url_imagem);
        BufferedImage imagem = ManipulaImg.pegarImagem(url_imagem);
        //BufferedImage imagem2 = ManipulaImg.pegarImagem(url_imagem2);

        BufferedImage suavizaMediana = OperacoesLocais.SuavizaImgMediana(imagem, 3);
        BufferedImage suavizaMedia = OperacoesLocais.SuavizaImgMedia(imagem, 5);

        ManipulaImg.exibirImagem(
                "Processamento de imagem",
               imagemAntes
                ,suavizaMediana
                ,suavizaMedia
                );

        //ManipulaImg.salvarImagem(imagem, "png", "/exemplo_edit.png");
    }

}
