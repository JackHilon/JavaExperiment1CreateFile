package javaexperiment1createfile;

import java.io.File;
import java.io.FileOutputStream;

public class UsingFileOutputStream {

    public static File Run(String pathStr) {

        try {

            File fil = new File(pathStr);

            FileOutputStream fos = new FileOutputStream(pathStr);

            fos.close();
            
            System.out.println("A file is created (UsingFileOutputStream)....");

            if (fil.isFile()) 
            {
                return fil;
            } 
            else {
                throw new IllegalArgumentException("This is a folder not a file!!!");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
