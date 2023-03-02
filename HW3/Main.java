package HW3;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "babynames.txt";
        String outputFileName1 = "boynames.txt";
        String outputFileName2 = "girlnames.txt";

        try {
            File inputFile = new File(inputFileName);
            Scanner in = new Scanner(inputFile);
            PrintWriter boy = new PrintWriter(outputFileName1);
            PrintWriter girl = new PrintWriter(outputFileName2);

            int totalBoys = 0;
            int totalGirls = 0;

            String TenMillionthBaby = "";
            int TenMillionSum = 0;

            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split("  ");

                boy.println(tokens[1]);
                totalBoys += Integer.parseInt(tokens[2]);

                girl.println(tokens[4]);
                totalGirls += Integer.parseInt(tokens[5]);

                if (TenMillionSum < 10000000) {
                    for (int i = 2; i <= 5; i += 3) {
                        TenMillionSum += Integer.parseInt(tokens[i]);

                        if (TenMillionSum >= 10000000) {
                            TenMillionthBaby = tokens[i - 1];
                            break;
                        }
                    }
                }

            }

            System.out.println("total boys: " + totalBoys);
            System.out.println("total girls: " + totalGirls);
            System.out.println("10 millionth baby: " + TenMillionthBaby);

            in.close();
            boy.close();
            girl.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
