package assignment9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Long startTime=System.currentTimeMillis();

        SearchingFiles searchingfiles=new SearchingFiles();

        System.out.print("Enter The Name Of The File To Search:");

        Scanner input1=new Scanner(System.in);

        String FileName=input1.next();

        System.out.print("Enter The Directory To Search:");

        Scanner input2=new Scanner(System.in);

        String Directory=input2.next();

        System.out.print("Enter The Number Of Layers To Search:");

        Scanner input3=new Scanner(System.in);

        int Layer_no=input3.nextInt();

        ManagingFiles managingfiles=new ManagingFiles();

        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("SearchedFiles.txt",true));

        bufferedWriter.close();

        ManagingFiles.AddToHashMap();

        SearchedFiles SF=new SearchedFiles();

        Scanner x=new Scanner(new File("SearchedFiles.txt"));

        x.useDelimiter("[,\n]");


        while (x.hasNext())
        {
            String Key=x.next();
            String Value=x.next();
            SF.hashMapFile.put(Key,Value);
        }


        if (SF.hashMapFile.containsKey(FileName)==false)
        {
            if (searchingfiles.Search((new File(Directory)),FileName,Layer_no)==false)
            {
                System.out.println("File Not Found");
            }
        }
        else
        {
            System.out.println("FileName:"+FileName+"\tDirectory"+SF.hashMapFile.get(FileName));
        }

        System.out.println((System.currentTimeMillis()-startTime)+" ms");
    }



}