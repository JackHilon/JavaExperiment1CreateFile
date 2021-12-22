package javaexperiment1createfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingFiles {

    public static File Run(String pathStr) {
        try {
            Path path = (Path) Paths.get(pathStr);

            Files.createFile(path);
            
            File fil = new File(pathStr);
           
            if(fil.isDirectory()){
                throw new IllegalArgumentException("This is a folder not a file!!!");
            }
            if (fil.isFile()){
                System.out.println("A file is created (UsingFiles)....");
                return fil;
            }
            else
                throw new Exception("Somthing is wrong!");

        }// end-try
        catch (FileAlreadyExistsException e) {
            System.out.println("The file already exists (UsingFiles)....");
            return new File(pathStr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            return null;
        }
    }
    
    //==========================================================================
}
