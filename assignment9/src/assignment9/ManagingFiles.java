package assignment9;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ManagingFiles {

    public void Add(String FileName,String Directory) throws IOException
    {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("SearchedFiles.txt",true));

        bufferedWriter.write(FileName+","+Directory+"\n");

        bufferedWriter.close();
    }

    public void AddToHashMap() throws FileNotFoundException {

    }
}
