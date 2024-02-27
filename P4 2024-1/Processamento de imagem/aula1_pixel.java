import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File image_file = new File("img_samples/imagem.jpg");

        BufferedImage imagem = ImageIO.read(image_file);
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        int qtdPixel = altura * largura;
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Quantidade de pixels: " + qtdPixel);

        boolean salvo = ImageIO.write(imagem,"jpg",new File("img_samples/imagem2.jpg"));
        if (salvo){
            System.out.println("Imagem salva com sucesso");
        } else {
            System.out.println("Erro ao salvar a imagem");
        }

    }
}
