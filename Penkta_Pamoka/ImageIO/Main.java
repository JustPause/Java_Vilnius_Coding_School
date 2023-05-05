// Java program to demonstrate colored
// to red colored image conversion

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Main {
    public static void main(String args[])
            throws IOException {

        // get width and height
        int width = 400;
        int height = 200;

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        BufferedImage img1 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int MIN = 0, MAX = 255;
        // convert to red image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = img.getRGB(0, 0);

                Random rand = new Random();
                int a = (rand.nextInt(MAX - MIN + 1) + MIN);
                // rand = new Random();
                int b = (rand.nextInt(MAX - MIN + 1) + MIN);
                // rand = new Random();
                int c = (rand.nextInt(MAX - MIN + 1) + MIN);

                // set new RGB keeping the r
                // value same as in original image
                // and setting g and b as 0.
                p = (a << 8 * 2) | (c << 8 * 1) | (c << 8 * 0) | (a << 8 * 3);

                img.setRGB(x, y, p);
            }
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x > 0 && y > 0 && x < width - 1 && y < height - 1) {

                    int Sum = img.getRGB(x - 1, y + 1) +
                            img.getRGB(x + 0, y + 1) +
                            img.getRGB(x + 1, y + 1) +
                            img.getRGB(x - 1, y + 0) +
                            img.getRGB(x + 0, y + 0) +
                            img.getRGB(x + 1, y + 0) +
                            img.getRGB(x - 1, y - 1) +
                            img.getRGB(x + 0, y - 1) +
                            img.getRGB(x + 1, y - 1);

                    int p = (Sum / 9 << 8 * 2) | (Sum / 9 << 8 * 1) | (Sum / 9 << 8 * 0);
                    // img.setRGB(x, y, p);

                    img1.setRGB(x - 1, y + 1, p);
                    img1.setRGB(x + 0, y + 1, p);
                    img1.setRGB(x + 1, y + 1, p);
                    img1.setRGB(x - 1, y + 0, p);
                    img1.setRGB(x + 0, y + 0, p);
                    img1.setRGB(x + 1, y + 0, p);
                    img1.setRGB(x - 1, y - 1, p);
                    img1.setRGB(x + 0, y - 1, p);
                    img1.setRGB(x + 1, y - 1, p);
                }
            }
        }

        // write image
        try {
            File f = new File(
                    "./GFG.png");
            ImageIO.write(img, "png", f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}