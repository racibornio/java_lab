package pl.patryk.jipp.lab.sem3;
import java.io.*;
import java.util.ArrayList;

public class Z2 {
    public static void main(String[] args) throws IOException {
        Z2_QuadraticEquation quadraticEquation = new Z2_QuadraticEquation();
        quadraticEquation.saveFactors();
        ArrayList readFactors = quadraticEquation.readFactorsFromFile();
        quadraticEquation.readFactorsFromList(readFactors);
        quadraticEquation.countRoots();
    }
}
