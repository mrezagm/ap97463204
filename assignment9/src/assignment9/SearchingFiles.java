package assignment9;

import java.io.File;
import java.io.IOException;

public class SearchingFiles {


    String FileName;

    boolean Exist=false;

    int LayerCount=0;


    public boolean Search(File file,String FileNameToSearch,int LayerLevel) throws IOException {

        FileName=FileNameToSearch;

        for (File Dir:file.listFiles())
        {

            if (LayerCount<=LayerLevel-1){

                if (Dir.isDirectory())
                {
                    LayerCount++;
                    Search(Dir,FileName,LayerLevel);
                    LayerCount--;
                }

                else
                {
                    LayerCount++;

                    if (Dir.getName().contains(FileName))
                    {
                        SearchedFiles searchedFiles=new SearchedFiles();

                        searchedFiles.FileName=FileName;

                        searchedFiles.Directory=Dir.getAbsolutePath();

                        ManagingFiles managingfiles=new ManagingFiles();

                        ManagingFiles.Add(searchedFiles.FileName,searchedFiles.Directory);

                        System.out.println("FileName:"+Dir.getName()+"\tDirectory:"+Dir.getAbsolutePath()+"\n");

                        Exist=true;

                        LayerCount=LayerLevel+10;
                        break;
                    }
                    LayerCount--;
                }
            }
        }

        return Exist;
    }
}
