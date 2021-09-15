package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;


    public void write(String fileName) {
        var headerStr = String.join(";", header);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(headerStr);
            for (int i = 0; i < data.length; i++) {
                writer.newLine();
                String[] strArr = new String[data[i].length];
                for (int j = 0; j < data[i].length; j++) {
                    strArr[j] = "" + data[i][j];
                }
                var dataStr = String.join(";", strArr);
                writer.write(dataStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(String fileName) {
        List<String> list;

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName))) {
            list = reader.lines().toList();
        } catch (IOException e) {
            e.printStackTrace();
            list=new ArrayList<>(0);
        }

        String str;
        for (int i = 0; i < list.size(); i++) {
            str=list.get(i);

            if (i==0){
                this.header=str.split(";");
                this.data=new int[list.size()-1][this.header.length];
            }else {
                var items=str.split(";");
                for (int j = 0; j < items.length; j++) {
                    this.data[i-1][j]=Integer.parseInt(items[j]);
                }
            }
        }
    }
}
