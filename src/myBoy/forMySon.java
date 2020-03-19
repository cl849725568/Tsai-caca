package myBoy;

import java.awt.*;
import java.awt.image.BufferedImage;

public class forMySon extends CaiLi_LiWei {
    public static void main(String[] args) {
        Boy cyc = new Boy();
        cyc.setName("蔡亦初");
        cyc.setBirthday("2019-10-14");
        cyc.setConstellation("Libra");//天秤座
        cyc.setHeight(68);//cm
        cyc.setWeight(6.6);//kg
        System.out.println("Best wishes to my son" + "\t" + cyc.getName() + "!");
        BufferedImage image = new BufferedImage(170, 50, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        g.setFont(new Font("楷体", Font.BOLD, 30));
        g.drawString("蔡亦初", 2, image.getHeight() - 20);
        int[] p = image.getRGB(0, 0, image.getWidth(), image.getHeight(), new int[image.getWidth() * image.getHeight()],
                0, image.getWidth());
        char[] cs = {'幸', '福', '安', '康'};
        int ics = 0;
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int off = i * image.getWidth() + j;
                if (p[off] != 0) {
                    System.out.print(cs[ics]);
                    ics = (ics + 1) % 4;
                } else {
                    System.out.print("　");
                }
                if (j == image.getWidth() - 1) {
                    System.out.println();
                }
            }
        }

    }
}

