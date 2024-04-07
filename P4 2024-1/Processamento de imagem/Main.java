import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String url_imagem = "exemplo.png";
        //String url_imagem2= "exemplo2_VAR.png";
        // String url_imagem = "src/exemplo.png";

        BufferedImage imagemAntes = ManipulaImg.pegarImagem(url_imagem);
        BufferedImage imagem = ManipulaImg.pegarImagem(url_imagem);
        //BufferedImage imagem2 = ManipulaImg.pegarImagem(url_imagem2);

        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        int qtdPixel = altura * largura;
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Quantidade de pixels: " + qtdPixel);

        //exibeRGBPixel(imagem);

//        BufferedImage bandaRed = OperacoesManuais.bandasRGB(imagem, true, false, false);
//        BufferedImage bandaGreen = OperacoesManuais.bandasRGB(imagem, false, true, false);
//        BufferedImage bandaBlue = OperacoesManuais.bandasRGB(imagem, false, false, true);

        // BufferedImage negativo = OperacoesManuais.negativo(imagem);
//        BufferedImage bandaCinza = OperacoesManuais.bandaCinza(imagem);
//        BufferedImage bandaCinzaR = OperacoesManuais.bandaCinzaR(imagem);
//        BufferedImage bandaCinzaG = OperacoesManuais.bandaCinzaG(imagem);
//        BufferedImage bandaCinzaB = OperacoesManuais.bandaCinzaB(imagem);

        // BufferedImage diferenca = OperacoesManuais.MostraDiferenca(imagem, imagem2);
        // BufferedImage imagemBinarizada = OperacoesManuais.BinarizarImg(imagem, 100);
        // BufferedImage imagemTomRed = OperacoesManuais.aumentoTonalidade(imagem, "red", 150);
        // BufferedImage imagemTomGreen = OperacoesManuais.aumentoTonalidade(imagem, "Green", 150);
        // BufferedImage imagemTomBlue = OperacoesManuais.aumentoTonalidade(imagem, "Blue", 150);
        // BufferedImage imagemBrilhoAdd = OperacoesManuais.aumentoBrilhoAdd(imagem, -200);
        // BufferedImage imagemBrilhoMult = OperacoesManuais.aumentoBrilhoMult(imagem, 10);

        BufferedImage teste_conversao = OperacoesManuais.yiq2rgb(OperacoesManuais.rgb2yiq(imagem));

        ManipulaImg.exibirImagem(
                "Processamento de imagem",
               imagemAntes
                // bandaRed,
                // bandaGreen,
                // bandaBlue,
//                bandaCinzaR,
//                bandaCinzaG,
//                bandaCinzaB,
                // negativo,
                // bandaCinza
                // imagemBinarizada,
                // imagemTomRed,
                // imagemTomGreen,
                // imagemTomBlue,
                // imagemBrilhoAdd,
                // imagemBrilhoMult
                ,teste_conversao
                );

        //ManipulaImg.salvarImagem(imagem, "png", "/exemplo_edit.png");
    }

}
