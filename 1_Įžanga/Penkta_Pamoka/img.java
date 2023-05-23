package Penkta_Pamoka;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class img {
    // Java program to demonstrate read and write of image

    public static void main(String args[])

            throws IOException {
        // width of the image
        int width = 963;

        // height of the image
        int height = 640;

        // For storing image in RAM
        BufferedImage image = ImageIO.read(new File("./gfg.png"));

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int avg = (128 + 32 + 64) / 3;
                image.setRGB(x, y, avg);
            }
        }

        // WRITE IMAGE
        try {
            // Output file path
            File output_file = new File("./gfg.png");

            // Writing to file taking type and path as
            ImageIO.write(image, "png", output_file);

            System.out.println("Writing complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
