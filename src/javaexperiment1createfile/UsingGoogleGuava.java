
package javaexperiment1createfile;

import com.google.common.io.Files;
import java.io.*;



public class UsingGoogleGuava {
    
    // lib: com.google.common.io
    
       
    // source https://guava.dev/releases/19.0/api/docs/com/google/common/io/Files.html
 
    
    public static File Run(String pathStr) {
        
        try {

            File fil = new File(pathStr);

            if (fil.isDirectory()) {
                throw new IllegalArgumentException();
            }

            if (fil.exists()) {
                System.out.println("A file already exists (UsingGoogleGuava).");
                
                return fil;
            } 
            else 
            {
                Files.touch(fil);

                System.out.println("A file is created (UsingGoogleGuava)....");

                return fil;
            }     
        }//end-try
        
        catch(IllegalArgumentException e)
        {
            System.out.println(e.toString() + " | This is a folder and not a file!");
            return null;
        }
        catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
        catch (Exception e) {
            System.out.println("Something is wrong.");
            return null;
        }
    }

}
