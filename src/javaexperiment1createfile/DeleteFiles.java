
package javaexperiment1createfile;

import java.io.File;
import java.nio.file.Files;


public class DeleteFiles {
    
    private static void DeleteFileWithException(File fil) {
        try {
            if (fil.isFile()) {
                Files.delete(fil.toPath()); // this throw an exception 
                                            // if delete-operation fails
            }
        }//end-try
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    //==========================================================================
    
    public static void DeleteFileGroupWithException(File... files) {
        
        for (int i = 0; i < files.length; i++) {
            DeleteFileWithException(files[i]);
            System.out.println("Successful"+i);
        }
    }
}
