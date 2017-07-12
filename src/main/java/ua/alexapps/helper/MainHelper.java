package ua.alexapps.helper;

import java.io.*;
import java.math.BigInteger;

/**
 * Created by OIvanchenko on 11.07.2017.
 */
public class MainHelper {

    public static void main(String[] args) {
        String inputFileName = args[0];
        String outputFileName = args[1];
        //String linePreffix = args[2];
        //String lineSuffix = args[3];


        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             OutputStream outputStream = new FileOutputStream(new File(outputFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                outputStream.write(asciiToHex(line).getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public String toHex(String arg) {
        return String.format("%040x", new BigInteger(1, arg.getBytes(/*YOUR_CHARSET?*/)));
    }

    private static String asciiToHex(String asciiValue)
    {
        char[] chars = asciiValue.toCharArray();
        StringBuffer hex = new StringBuffer();
        for (int i = 0; i < chars.length; i++)
        {
            hex.append(Integer.toHexString((int) chars[i])).append(0x0d);
        }
        return hex.toString();
    }


}
