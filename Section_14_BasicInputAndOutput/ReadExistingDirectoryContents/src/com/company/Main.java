package com.company;

import java.io.IOException;
import java.nio.file.*;
//CHECK DOCUMENTATION   CLASS FILE SYSTEM    ->   getPathMatcher   ->   glob syntax
public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter = //has only one method called 'accept'
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException { // when accept returns true for a path, the path will be included in the directory stream results
//                        return (Files.isRegularFile(path)); //checks if its a regular file
//                    }
//                };

        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p); //using a lambda expression

        Path directory = FileSystems.getDefault().getPath("FileTree\\Dir2"); //FileSystems.getDefault() to get the directory
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            //DirectoryStream is an interface that implements the iterable interface..so you can iterate over it
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        //using the bitwise inclusive OR
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
    }
}
