package com.company;

import java.io.*;

public class Person {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\User\\Desktop\\Alice.txt");
        // try {
        //     FileInputStream fileInputStream = new FileInputStream(file);
        // }
        //  catch(IOException){
        //      System.out.println("doesnt exist");
        //  }
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int wC = 0;

        while ((line = bufferedReader.readLine()) != null) {

            String words[] = line.split("\\s+");
            wC += words.length;

        }

        System.out.println("word count = "+ wC);

    }


}
