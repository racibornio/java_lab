package pl.patryk.jipp.lab.lab1;
import java.io.*;
import java.util.ArrayList;

public class Lab1_Z2 {
    public static void main(String[] args) throws IOException {
        Lab1_Z2_QuadraticEquation quadraticEquation = new Lab1_Z2_QuadraticEquation();
        quadraticEquation.saveFactors();
        ArrayList readFactors = quadraticEquation.readFactorsFromFile();
        quadraticEquation.readFactorsFromList(readFactors);
        quadraticEquation.countRoots();
    }
}
