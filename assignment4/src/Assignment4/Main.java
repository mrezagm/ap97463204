package Assignment4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {

        System.out.format("Tedad Satr Hara Vared Konid :");

        Scanner input = new Scanner(System.in);

        int satr = input.nextInt();
        System.out.format("Tedad Soton Hara Vared Konid :");

        int soton = input.nextInt();
        int a[][];

        a = new int[satr][soton];
        Random R = new Random();

        for (int k = 0; k <= satr - 1; k++) {
            for (int l = 0; l <= soton - 1; l++) {
                a[k][l] = R.nextInt(99 - 1 + 1) + 1;
            }
        }
        for (int t = 0; t <= satr - 1; t++) {
            for (int u = 0; u <= soton - 1; u++) {
                System.out.format("%4d", a[t][u]);
            }
            System.out.format("\n");
        }
        System.out.format("Shomare Satr Ya Soton Ra Vared Konid:");

        String s = input.next();
        String s1 = s.substring(0, 1); //s1,ya r ya k
        int adad = Integer.parseInt(s.substring(1));





        if (s1.compareTo("r") == 0) {
            for (int i = soton - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (a[adad][j] > a[adad][j+1]) {
                        for (int h = 0; h <= satr - 1; h++) {

                            int temp = a[h][j];
                            a[h][j] = a[h][j+1];
                            a[h][j+1] = temp;

                        }
                    }
                }
            }
        }











        if (s1.compareTo("c") == 0) {
            for (int i = satr - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (a[j][adad] > a[j + 1][adad]) {
                        for (int h = 0; h <= soton - 1; h++) {

                            int temp = a[j][h];
                            a[j][h] = a[j + 1][h];
                            a[j + 1][h] = temp;

                        }
                    }
                }
            }
        }




        for (int x = 0; x <= satr - 1; x++) {
            for (int y = 0; y <= soton - 1; y++) {

                System.out.format("%4d", a[x][y]);
            }
            System.out.format("\n");
        }


    }

}
