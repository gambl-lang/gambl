package com.doge.parsing;

import java.io.*;
import java.nio.file.Path;

/**
 * Created by michno on 28/4/15.
 */
public class FileHandling {

    public File GetFileForOutputCode(String filename, String dest){
        File outputSourcecode = null;
        try {
            outputSourcecode = new File(dest + filename);
            if (!outputSourcecode.exists()) {
                if (!outputSourcecode.getParentFile().exists())
                    outputSourcecode.getParentFile().mkdirs();
                outputSourcecode.createNewFile();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return outputSourcecode;
    }

    public boolean WriteToFile(File file, StringBuilder text){
        try {
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            Writer writer = new BufferedWriter(fileWriter);
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public FileInputStream GetFileInputStreamFromPath(String path){
        String inputFile = path;
        FileInputStream fileInputStream = null;
        if (inputFile != null) try {
            fileInputStream = new FileInputStream(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileInputStream;
    }

    public boolean ExportResource(String resourceName, String dest){
        InputStream stream = null;
        OutputStream resStreamOut = null;
        try {
            stream = getClass().getClassLoader().getResourceAsStream(resourceName);
            if(stream == null) {
                System.out.println("Cannot get resource \"" + resourceName + "\"");
                return false;
            }

            int readBytes;
            byte[] buffer = new byte[4096];
            resStreamOut = new FileOutputStream(dest + resourceName);
            while ((readBytes = stream.read(buffer)) > 0) {
                resStreamOut.write(buffer, 0, readBytes);
            }

            stream.close();
            resStreamOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
}
