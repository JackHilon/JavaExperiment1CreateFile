
package javaexperiment1createfile;

import java.io.File;


public class JavaExperiment1CreateFile {

    
    public static void main(String[] args) {
        
        
        
        File folder = CreateFolder.Run(myNames.folderName);
        
        //----------------------------------------------------------------------
        
        File fil1 = UsingFile.Run(myNames.fileName1);
        
        //----------------------------------------------------------------------
        
        File fil2 = UsingFileOutputStream.Run(myNames.fileName2);
        
        //----------------------------------------------------------------------
        
        File fil3 = UsingFiles.Run(myNames.fileName3);
        
        //----------------------------------------------------------------------
        
        File fil4 = UsingApacheFileUtils.Run(myNames.fileName4);
        
        //----------------------------------------------------------------------
        
        File fil5 = UsingGoogleGuava.Run(myNames.fileName5);
        
        //----------------------------------------------------------------------
        
        DeleteFiles.DeleteFileGroupWithException(fil1, fil2, fil3, fil4, fil5);
    }
    
}
