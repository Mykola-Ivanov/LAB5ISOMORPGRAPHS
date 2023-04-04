package org.example;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    static String pathGraph1 = "src\\main\\resources\\L5_1.txt";
    static String pathGraph2 = "src\\main\\resources\\L5_2.txt";
    static String pathGraph3 = "src\\main\\resources\\L5_3.txt";
    public static void main( String[] args )
    {
        try {
            GraphLoader loaderGraph1 = new GraphLoader(pathGraph1,true);
            GraphLoader loaderGraph2 = new GraphLoader(pathGraph2,true);
            GraphLoader loaderGraph3 = new GraphLoader(pathGraph3,true);

            UllmanAlgorithm ullmanAlgorithm = new UllmanAlgorithm();
            boolean isGraph1IsomorphicToGraph2 = ullmanAlgorithm.isIsomorphic(
                    loaderGraph1.getAdjacencyList(),loaderGraph2.getAdjacencyList());
            System.out.println("\nG1 та G2 "+(isGraph1IsomorphicToGraph2?"Графи ізомрфні":"Графи не ізоморфні"));

            boolean isGraph1IsomorphicToGraph3 = ullmanAlgorithm.isIsomorphic(
                    loaderGraph1.getAdjacencyList(),loaderGraph3.getAdjacencyList());
            System.out.println("\nG1 та G3 "+(isGraph1IsomorphicToGraph3?"Графи ізомрфні":"Графи не ізоморфні"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
