package assignment8;

import java.io.File;
import java.util.ArrayList;

public class main {

    static File file = new File("Students.txt");

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        writestudent studentWriter = new writestudent();

        savefile fileSaver = new savefile();

        readfile fileRead = new readfile();


        ArrayList<student> students = studentWriter.generate();

        fileSaver.Save(students);

        System.out.println("File Saved");

        fileRead.read(stringBuffer);

        System.out.println(stringBuffer.toString());

    }

}
