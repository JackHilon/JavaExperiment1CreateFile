
package javaexperiment1createfile;

import java.io.File;
import java.io.IOException;


public class UsingFile {
    
    public static File Run(String pathStr) {
        
        try{
        File fil = new File(pathStr);
        
        if(fil.createNewFile())
            System.out.println("A file is created (UsingFile)....");
        else if(!fil.createNewFile())
            System.out.println("A file already exists (UsingFile)....");
        if(fil.isFile())
            return fil;
        else
            throw new IllegalArgumentException("This is a folder not a file!!!");
        }// end-try
        catch(Exception e)
        {
            System.out.println(e.toString());
            return null;
        }
    }
}
