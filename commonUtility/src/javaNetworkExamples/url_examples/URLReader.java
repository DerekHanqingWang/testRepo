package javaNetworkExamples.url_examples;

import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("https://www.treasury.gov/resource-center/data-chart-center/interest-rates/Pages/TextView.aspx?data=yield");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));
        BufferedWriter out = new BufferedWriter(
        		new FileWriter("C:\\workspaces\\data\\outputIndexPage1.txt"));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
        	out.write(inputLine);
        	System.out.println(inputLine);
        }
            
        in.close();
    }
}