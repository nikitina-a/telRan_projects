package org.anefdef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        LinePrint lp = new LinePrint();
        lp.setDaemon(true);
        lp.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null && !line.equals("exit")) {
            lp.setLine("Print: " + line);
            lp.interrupt();
        }
    }
}
