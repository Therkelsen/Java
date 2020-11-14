
package javalearning;

import java.util.Arrays;

public class OpgaverMedArrays
{
    
    public OpgaverMedArrays()
    {
    }

    
    public void printStringArray()
    {
        String[] myStrings = new String[6];
        
        myStrings[0] = "this";
        myStrings[1] = "is";
        myStrings[2] = "Andy";
        myStrings[3] = "Warhol";
        myStrings[4] = "take";
        myStrings[5] = "one";
        
        for (int i = 0; i < myStrings.length; i++)
            System.out.println(myStrings[i]);
    }
    
    public static void printIntegerArray(int[] myInts)
    {
        for (int i = 0; i < myInts.length; i++)
            System.out.println(myInts[i]);
    }
    
    public int sumOfArray(int[] myInts)
    {
        // returnerer summen af elementerne i arrayet
        int sum = 0;
        for (int i = 0; i < myInts.length; i++) {
            sum += myInts[i];
        }
        return sum;
    }
    
    public int averageOfArray(int[] myInts)
    {
        // returnerer gennemsnitsværdien (udregnet ved heltalsdivision)
        return sumOfArray(myInts) / myInts.length;
    }
    
    public int maxOfArray(int[] myInts)
    {
        // returnerer den største værdi i arrayet
        int max = myInts[0];
        for(int i = 1; i < myInts.length; i++) {
            if(max<myInts[i]) max = myInts[i];
        }
        return max;
    }
    
    public static void sortArray(int[] myInts)
    {   
        int temp;
        for (int i = 1; i < myInts.length; i++) {
            for (int j = i; j > 0; j--) {
                if (myInts[j] < myInts [j - 1]) {
                    temp = myInts[j];
                    myInts[j] = myInts[j - 1];
                    myInts[j - 1] = temp;
                }
            }
        }
        printIntegerArray(myInts);
    }
    
    public static void addMatrices(int[][] a, int[][] b)
    {
        // adder to matricer af samme størrelse og udskriv resultatet
        // tjek efterfølgende metode printMatrix for inspiration
        int[][] add = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        for (int row = 0; row < add.length; row++) {
            for (int col = 0; col < add[row].length; col++) {
                add[row][col] = a[row][col] += b[row][col];
            }
        }
        printMatrix(add);

    }
    
    public static void printMatrix(int[][] m)
    {
         for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                System.out. print(m[i][j] + " ");
         System.out.println("\nLength "+m.length+" Width "+m[0].length);
    }
    
    public static void main(String[] args)
    {
        int[] myInts = {17,12,89,2,43,67,11};

        int[][] a = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        
        int[][] b = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        
        OpgaverMedArrays o = new OpgaverMedArrays();
        
        o.printStringArray();
        printIntegerArray(myInts);

        System.out.println("Sum " + o.sumOfArray(myInts));
        System.out.println("Avg " + o.averageOfArray(myInts));
        System.out.println("Max " + o.maxOfArray(myInts));
        sortArray(myInts);
        addMatrices(a, b);
        
        int[][] filter = {
            {-1, 0, 7, 4},
            {-2, 1, 8, 5},
            {-3, 2, 9, 6}
        };
        printMatrix(filter);
       
    }

}
