package assignment8;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class readfile {

    public readfile(){

    }


    public StringBuffer read(StringBuffer stringBuffer){
        try {

            FileReader fileReader = new FileReader(main.file);

            int numCharsRead;

            char[] charArray = new char[1024];

            while ((numCharsRead = fileReader.read(charArray)) > 0)
            {
                stringBuffer.append(charArray, 0, numCharsRead);
            }

            fileReader.close();


        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return stringBuffer;
    }


    public void textAnalyse(StringBuffer e){
        StringTokenizer stringTokenizer = new StringTokenizer(this.read(e).toString(),"\t");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }


    }

}
