
package javaexperiment1createfile;

import java.io.File;
import java.io.IOException;


public class CreateFolder {
    
    public static File Run(String pathStr) {
        
        try{
        File folder = new File(pathStr);
        
        if(folder.mkdir())
            System.out.println("A folder is created....");
        else if(!folder.mkdir())
            System.out.println("A folder already exists....");
        if(folder.isDirectory())
            return folder;
        else
            throw new IllegalArgumentException("This is a file not a folder!!!");
        }// end-try
        catch(Exception e)
        {
            System.out.println(e.toString());
            return null;
        }
        
    }
}
