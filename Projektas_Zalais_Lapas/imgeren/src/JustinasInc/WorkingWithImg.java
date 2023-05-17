package JustinasInc;

import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Scanner;

public class WorkingWithImg {

    static String imagePath;
    static BufferedImage myPicture;

    static String Read() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    static void WorkingWithImg(String path) throws IOException {

        String Sakinys = Read();

        // Creating a subimage of given dimensions
        BufferedImage Image = new BufferedImage((int)Math.sqrt(Sakinys.length())+1, (int)Math.sqrt(Sakinys.length())+1, BufferedImage.TYPE_INT_RGB);
        File f = null;

        int width = Image.getWidth();
        int height = Image.getHeight(); 

        int w = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                w++;

                // // replace RGB value with avg

                //int p = (q << 16) | ((int) (Math.round(q / 1.8)) << 8) | 0;

                if (Sakinys.length() > w) {
                    

                    int q = Sakinys.toCharArray()[w];

                    int p2 = (q << 16) | (q << 8) | (q << 0);
                    Image.setRGB(x, y, p2);
                } else {
                    Image.setRGB(x, y, 0x080808);
                }
            }
        }

        // int x[] = new int[Sakinys.length()];
        // for (int letter : Sakinys.toCharArray()) {
        // x[letter] = Sakinys.toCharArray()[letter];
        // }

        f = new File(
                "/home/justinas/Programming/Java_Vilnius_Coding/1_Įžanga/Projektas_Zalais_Lapas/imgeren/src/JustinasInc/Image.png");
        ImageIO.write(Image, "png", f);
    }

}
