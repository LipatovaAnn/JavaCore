package Lesson5;

import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        var data = new AppData();

        data.read("test.csv");

        data.write("output.csv");
    }
}
