package com.timbuchalka;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) {

	    try(FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel()) {

            byte[] outputBytes = "Hello World!".getBytes(); // creating a byte array
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            // buffer's position is the index of the next element that should be read or written..cannot be greater than the buffer's capacity
            // buffer's capacity is the number of elements it can contain
            // buffer's mark is used by the buffer.resetPosition() method..when called the buffer is reset to its mark
            // you mark the point and then call the reset to reset it to the mark
            int numBytes = binChannel.write(buffer); // to know how may bytes were written
            System.out.println("numBytes written was: " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES); //allocating the size we want the integer to be
            intBuffer.putInt(245); // write the int into the buffer
            intBuffer.flip(); // flip method resets the buffer's position to zero
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);


//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();
//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//            Files.write(dataPath, "\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
//            List<String> lines = Files.readAllLines(dataPath);
//            for(String line : lines) {
//                System.out.println(line);
//            }

        } catch(IOException e) {
	        e.printStackTrace();
        }
    }
}
