package pl.patryk.jipp.lab.sem3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Z2_QuadraticEquation {

    private int a, b, c;
    private String filePath = "/Users/user/squareequation.txt";

    public void saveFactors() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (a == 0) {
            System.out.println("Enter a...");
            a = Integer.parseInt(br.readLine());
        }

        while (b == 0) {
            System.out.println("Enter b...");
            b = Integer.parseInt(br.readLine());
        }

        while (c == 0) {
            System.out.println("Enter c...");
            c = Integer.parseInt(br.readLine());
        }

        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(a + "," + b + "," + c);
        fileWriter.close();
        System.out.println("The file has been saved.");
    }

    public ArrayList readFactorsFromFile() throws IOException {
        ArrayList factorsList = new ArrayList();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String factors = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(factors, ",");
        while (stringTokenizer.hasMoreTokens()) {
            factorsList.add(stringTokenizer.nextToken());
        }

        fileReader.close();
        return factorsList;
    }

    public void readFactorsFromList(ArrayList factorsList) {
        System.out.println("a:" + factorsList.get(0));
        System.out.println("b:" + factorsList.get(1));
        System.out.println("c:" + factorsList.get(2));
    }

    public void countRoots() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("There is no real root for this equation.");
        } else if (discriminant == 0) {
            double root1 = (- b) / (2 * a);
            System.out.println("There is one root: " + root1);
        } else {
            double root1 = (- b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (- b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("There are two roots, 1: " + root1 + ", 2: " + root2);
        }
    }
}
