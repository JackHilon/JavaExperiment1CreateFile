package javaexperiment1createfile;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class UsingApacheFileUtils {

    // Apache Commons IO library (external lib)
 
    // https://commons.apache.org/proper/commons-io/download_io.cgi
    
    public static File Run(String pathStr) {

        try {

            File fil = new File(pathStr);

            if (fil.isDirectory()) {
                throw new IllegalArgumentException();
            }

            if (fil.exists()) {
                System.out.println("A file already exists (UsingFileUtils-Apache).");
                return fil;
            } else if (!fil.exists()) {

                FileUtils.touch(fil);

                System.out.println("A file is created (UsingFileUtils-Apache)....");

                return fil;
            } 
            else {
                throw new Exception("Somthing is wrong");
            }
        }catch(IllegalArgumentException e)
        {
            System.out.println(e.toString() + " | This is a folder and not a file!");
            return null;
        }
        catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
        catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

}
