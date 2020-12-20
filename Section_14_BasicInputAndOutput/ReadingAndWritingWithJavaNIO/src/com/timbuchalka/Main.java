package com.timbuchalka;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    try {
//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel(); //calling the getChannel method to get a channel
            Path dataPath = FileSystems.getDefault().getPath("data.txt");
            Files.write(dataPath, "\nLine 6".getBytes("UTF-8"), StandardOpenOption.APPEND); //append the bytes to the end of the file
            List<String> lines = Files.readAllLines(dataPath); // creates a list of string array..readAllLines reads the entire file into memory
            for(String line : lines) {
                System.out.println(line);
            }

        } catch(IOException e) {
	        e.printStackTrace();
        }
    }
}
