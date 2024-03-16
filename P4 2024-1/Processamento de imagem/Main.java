import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String url_imagem = "exemplo2.png";
        String url_imagem2= "exemplo2_VAR.png";
        // String url_imagem = "src/exemplo.png";

        BufferedImage imagemAntes = ManipulaImg.pegarImagem(url_imagem);
        BufferedImage imagem = ManipulaImg.pegarImagem(url_imagem);
        BufferedImage imagem2 = ManipulaImg.pegarImagem(url_imagem2);

        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        int qtdPixel = altura * largura;
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Quantidade de pixels: " + qtdPixel);

        //exibeRGBPixel(imagem);

        BufferedImage bandaRed = OperacoesManuais.bandasRGB(imagem, true, false, false);
        BufferedImage bandaGreen = OperacoesManuais.bandasRGB(imagem, false, true, false);
        BufferedImage bandaBlue = OperacoesManuais.bandasRGB(imagem, false, false, true);

        BufferedImage negativo = OperacoesManuais.negativo(imagem);
        BufferedImage bandaCinza = OperacoesManuais.bandaCinza(imagem);
        BufferedImage bandaCinzaR = OperacoesManuais.bandaCinzaR(imagem);
        BufferedImage bandaCinzaG = OperacoesManuais.bandaCinzaG(imagem);
        BufferedImage bandaCinzaB = OperacoesManuais.bandaCinzaB(imagem);
        
        BufferedImage diferenca = OperacoesManuais.MostraDiferenca(imagem, imagem2);

        ManipulaImg.exibirImagem(
                "Processamento de imagem", 
                imagemAntes,
                imagem2,
                // bandaRed,
                // bandaGreen,
                // bandaBlue,
                // bandaCinzaR,
                // bandaCinzaG,
                // bandaCinzaB,
                diferenca,
                negativo, 
                bandaCinza);
        //ManipulaImg.salvarImagem(imagem, "png", "/exemplo_edit.png");
    }

}
