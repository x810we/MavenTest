//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package github.x810we;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for(int i = 1; i <= 5; ++i) {
            System.out.println("i = " + i);
        }
        int z1;
        z1 = Rechnen(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Rechen = " + z1);


/*        try {
            BufferedImage var4 = ImageIO.read(new File("test.tif"));
        } catch (IOException var2) {
            throw new RuntimeException(var2);
        } */
    }
    public static int Rechnen(int... x) {
        int z1 = 0;

        for (int i=0;i<x.length;i++) {
            z1+= x[i];
        }

        return z1;


    }
}
