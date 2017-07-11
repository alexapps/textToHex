package ua.alexapps.helper;

import java.io.*;

/**
 * Created by OIvanchenko on 11.07.2017.
 */
public class MainHelper {

    public static void main(String[] args) {
        String inputFileName = args[0];
        String outputFileName = args[1];
        //String linePreffix = args[2];
        //String lineSuffix = args[3];

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                System.out.println(line);
                byte[] ba = new byte[line.length()];
                // TODO

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
