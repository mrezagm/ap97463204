package assignment8;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class savefile {

    public savefile(){

    }
    public void Save(ArrayList<student> students){
        try {

            FileWriter fileWriter = new FileWriter(main.file);

            fileWriter.write(students.toString());

            fileWriter.flush();

            fileWriter.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
