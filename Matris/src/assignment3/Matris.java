package assignment3;

import java.util.*;
public class Matris {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println("inter number");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println();
        int[][] matris = new int[x][x];
        for(int i=0;i < matris.length;i++){
            for(int j=0;j < matris.length;j++){
                matris[i][j]=rnd.nextInt(100);
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int k = 0; k < 2*x; k++) {
            for(int i=0;i < matris.length;i++){
                for(int j=0;j < matris.length;j++){
                    if (i+j==k) {
                        System.out.print(matris[i][j]+" ");
                    }}}}}}