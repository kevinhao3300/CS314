import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//  CodeCamp.java - CS314 Assignment 1 - Tester class

/*  Student information for assignment:
 *
 *  Name: Kevin Hao
 *  email address: kevinhao3300@yahoo.com
 *  UTEID: kjh2858	
 *  Section 5 digit ID: 51365 
 *  Grader name: Levi
 *  Number of slip days used on this assignment: 0
 */


/* CS314 Students: place results of shared birthdays experiments in this comment.
	Average number of pairs of people with shared birthdays: 45
	I think it will take 50 people so there is a 50% chance that at least 2 of the people have a shared birthday in a 365 day years.
	Num people: 2, number of experiments with one or more shared birthday: 138.0, percentage: 0.28
	Num people: 3, number of experiments with one or more shared birthday: 439.0, percentage: 0.88
	Num people: 4, number of experiments with one or more shared birthday: 806.0, percentage: 1.61
	Num people: 5, number of experiments with one or more shared birthday: 1411.0, percentage: 2.82
	Num people: 6, number of experiments with one or more shared birthday: 2003.0, percentage: 4.01
	Num people: 7, number of experiments with one or more shared birthday: 2874.0, percentage: 5.75
	Num people: 8, number of experiments with one or more shared birthday: 3716.0, percentage: 7.43
	Num people: 9, number of experiments with one or more shared birthday: 4754.0, percentage: 9.51
	Num people: 10, number of experiments with one or more shared birthday: 5860.0, percentage: 11.72
	Num people: 11, number of experiments with one or more shared birthday: 7121.0, percentage: 14.24
	Num people: 12, number of experiments with one or more shared birthday: 8414.0, percentage: 16.83
	Num people: 13, number of experiments with one or more shared birthday: 9797.0, percentage: 19.59
	Num people: 14, number of experiments with one or more shared birthday: 11312.0, percentage: 22.62
	Num people: 15, number of experiments with one or more shared birthday: 12667.0, percentage: 25.33
	Num people: 16, number of experiments with one or more shared birthday: 14154.0, percentage: 28.31
	Num people: 17, number of experiments with one or more shared birthday: 15760.0, percentage: 31.52
	Num people: 18, number of experiments with one or more shared birthday: 17472.0, percentage: 34.94
	Num people: 19, number of experiments with one or more shared birthday: 18867.0, percentage: 37.73
	Num people: 20, number of experiments with one or more shared birthday: 20716.0, percentage: 41.43
	Num people: 21, number of experiments with one or more shared birthday: 21984.0, percentage: 43.97
	Num people: 22, number of experiments with one or more shared birthday: 23839.0, percentage: 47.68
	Num people: 23, number of experiments with one or more shared birthday: 25449.0, percentage: 50.90
	Num people: 24, number of experiments with one or more shared birthday: 26813.0, percentage: 53.63
	Num people: 25, number of experiments with one or more shared birthday: 28414.0, percentage: 56.83
	Num people: 26, number of experiments with one or more shared birthday: 29944.0, percentage: 59.89
	Num people: 27, number of experiments with one or more shared birthday: 31291.0, percentage: 62.58
	Num people: 28, number of experiments with one or more shared birthday: 32692.0, percentage: 65.38
	Num people: 29, number of experiments with one or more shared birthday: 34054.0, percentage: 68.11
	Num people: 30, number of experiments with one or more shared birthday: 35406.0, percentage: 70.81
	Num people: 31, number of experiments with one or more shared birthday: 36407.0, percentage: 72.81
	Num people: 32, number of experiments with one or more shared birthday: 37728.0, percentage: 75.46
	Num people: 33, number of experiments with one or more shared birthday: 38839.0, percentage: 77.68
	Num people: 34, number of experiments with one or more shared birthday: 39797.0, percentage: 79.59
	Num people: 35, number of experiments with one or more shared birthday: 40853.0, percentage: 81.71
	Num people: 36, number of experiments with one or more shared birthday: 41584.0, percentage: 83.17
	Num people: 37, number of experiments with one or more shared birthday: 42445.0, percentage: 84.89
	Num people: 38, number of experiments with one or more shared birthday: 43319.0, percentage: 86.64
	Num people: 39, number of experiments with one or more shared birthday: 43792.0, percentage: 87.58
	Num people: 40, number of experiments with one or more shared birthday: 44531.0, percentage: 89.06
	Num people: 41, number of experiments with one or more shared birthday: 45111.0, percentage: 90.22
	Num people: 42, number of experiments with one or more shared birthday: 45567.0, percentage: 91.13
	Num people: 43, number of experiments with one or more shared birthday: 46163.0, percentage: 92.33
	Num people: 44, number of experiments with one or more shared birthday: 46629.0, percentage: 93.26
	Num people: 45, number of experiments with one or more shared birthday: 47090.0, percentage: 94.18
	Num people: 46, number of experiments with one or more shared birthday: 47410.0, percentage: 94.82
	Num people: 47, number of experiments with one or more shared birthday: 47774.0, percentage: 95.55
	Num people: 48, number of experiments with one or more shared birthday: 47917.0, percentage: 95.83
	Num people: 49, number of experiments with one or more shared birthday: 48427.0, percentage: 96.85
	Num people: 50, number of experiments with one or more shared birthday: 48519.0, percentage: 97.04
	Num people: 51, number of experiments with one or more shared birthday: 48669.0, percentage: 97.34
	Num people: 52, number of experiments with one or more shared birthday: 48900.0, percentage: 97.80
	Num people: 53, number of experiments with one or more shared birthday: 49103.0, percentage: 98.21
	Num people: 54, number of experiments with one or more shared birthday: 49228.0, percentage: 98.46
	Num people: 55, number of experiments with one or more shared birthday: 49329.0, percentage: 98.66
	Num people: 56, number of experiments with one or more shared birthday: 49417.0, percentage: 98.83
	Num people: 57, number of experiments with one or more shared birthday: 49509.0, percentage: 99.02
	Num people: 58, number of experiments with one or more shared birthday: 49596.0, percentage: 99.19
	Num people: 59, number of experiments with one or more shared birthday: 49616.0, percentage: 99.23
	Num people: 60, number of experiments with one or more shared birthday: 49734.0, percentage: 99.47
	Num people: 61, number of experiments with one or more shared birthday: 49721.0, percentage: 99.44
	Num people: 62, number of experiments with one or more shared birthday: 49789.0, percentage: 99.58
	Num people: 63, number of experiments with one or more shared birthday: 49824.0, percentage: 99.65
	Num people: 64, number of experiments with one or more shared birthday: 49866.0, percentage: 99.73
	Num people: 65, number of experiments with one or more shared birthday: 49891.0, percentage: 99.78
	Num people: 66, number of experiments with one or more shared birthday: 49923.0, percentage: 99.85
	Num people: 67, number of experiments with one or more shared birthday: 49922.0, percentage: 99.84
	Num people: 68, number of experiments with one or more shared birthday: 49930.0, percentage: 99.86
	Num people: 69, number of experiments with one or more shared birthday: 49940.0, percentage: 99.88
	Num people: 70, number of experiments with one or more shared birthday: 49968.0, percentage: 99.94
	Num people: 71, number of experiments with one or more shared birthday: 49967.0, percentage: 99.93
	Num people: 72, number of experiments with one or more shared birthday: 49967.0, percentage: 99.93
	Num people: 73, number of experiments with one or more shared birthday: 49973.0, percentage: 99.95
	Num people: 74, number of experiments with one or more shared birthday: 49981.0, percentage: 99.96
	Num people: 75, number of experiments with one or more shared birthday: 49989.0, percentage: 99.98
	Num people: 76, number of experiments with one or more shared birthday: 49991.0, percentage: 99.98
	Num people: 77, number of experiments with one or more shared birthday: 49993.0, percentage: 99.99
	Num people: 78, number of experiments with one or more shared birthday: 49994.0, percentage: 99.99
	Num people: 79, number of experiments with one or more shared birthday: 49995.0, percentage: 99.99
	Num people: 80, number of experiments with one or more shared birthday: 49998.0, percentage: 100.00
	Num people: 81, number of experiments with one or more shared birthday: 49996.0, percentage: 99.99
	Num people: 82, number of experiments with one or more shared birthday: 49998.0, percentage: 100.00
	Num people: 83, number of experiments with one or more shared birthday: 49998.0, percentage: 100.00
	Num people: 84, number of experiments with one or more shared birthday: 49999.0, percentage: 100.00
	Num people: 85, number of experiments with one or more shared birthday: 49999.0, percentage: 100.00
	Num people: 86, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 87, number of experiments with one or more shared birthday: 49999.0, percentage: 100.00
	Num people: 88, number of experiments with one or more shared birthday: 49999.0, percentage: 100.00
	Num people: 89, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 90, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 91, number of experiments with one or more shared birthday: 49999.0, percentage: 100.00
	Num people: 92, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 93, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 94, number of experiments with one or more shared birthday: 49998.0, percentage: 100.00
	Num people: 95, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 96, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 97, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 98, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 99, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	Num people: 100, number of experiments with one or more shared birthday: 50000.0, percentage: 100.00
	
	It takes 23 people so there is a 50% chance that at least 2 of the people have a shared birthday in a 365 day year.
	This answer is surprising because 23 people seems relatively low compared to the 365 days in a year to make a 50% success rate.
*/

public class CodeCampTester
{
    public static void main(String[] args)
    {
        final String newline = System.getProperty("line.separator");

    	//hammingDistance test 1
        int[] h1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] h2 = {1, 0, 3, 4, 0, 6, 7, 8, 0};
        int expected = 3;
        int actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println("Test 1 hamming distance: expected value: " + 
                expected + ", actual value: " + actual);
        if( expected == actual )          
            System.out.println(" passed test 1, hamming distance");
        else
            System.out.println(" ***** FAILED ***** test 1, hamming distance");
        
      //hammingDistance test 2
        h1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        h2 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        expected = 8;
        actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println(newline + "Test 2 hamming distance: expected value: " + 
                expected + ", actual value: " + actual);
        if( expected == actual )          
            System.out.println(" passed test 2, hamming distance");
        else
            System.out.println(" ***** FAILED ***** test 2, hamming distance");
        
      //isPermutation test 1
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {0, 1, 2, 3, 4, 5};
        boolean expectedBool = false;
        boolean actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 1 isPermutation: expected value: " 
                + expectedBool + ", actual value: " + actualBool);
        if ( expectedBool == actualBool )
            System.out.println(" passed test 1, isPermutation");
        else
            System.out.println(" ***** FAILED ***** test 1, isPermutation");
        
        //isPermutation test 2
        a = new int[]{1, 2, 3, 4, 5};
        b = new int[]{5, 4, 3, 2, 1};
        expectedBool = true;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 2 isPermutation: expected value: " 
                + expectedBool + ", actual value: " + actualBool);
        if ( expectedBool == actualBool )
            System.out.println(" passed test 2, isPermutation");
        else
            System.out.println(" ***** FAILED ***** test 2, isPermutation");
        
        //mostVowels test 1
        String[] sList = {null, null, "n", "o", null};
        int expectedResult = 3;
        int actualResult = CodeCamp.mostVowels(sList);
        System.out.println(newline + "Test 1 mostVowels: expected result: " 
                + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 1, mostVowels");
        else
            System.out.println("***** FAILED ***** test 1, mostVowels");

        //mostVowels test 2
        sList = new String[] {"a", "aa", "aa"};
        expectedResult = 1;
        actualResult = CodeCamp.mostVowels(sList);
        System.out.println(newline + "Test 2 mostVowels: expected result: " 
                + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 2, mostVowels");
        else
            System.out.println("***** FAILED ***** test 2, mostVowels");
        
        //sharedBirthdays test 1 
        int pairs = CodeCamp.sharedBirthdays(1, 100);
        System.out.println(newline + "Test 1 shared birthdays: expected: 0, actual: " + pairs);
        int expectedShared = 0;
        if( pairs == expectedShared )
            System.out.println("passed test 1, shared birthdays");
        else
            System.out.println("***** FAILED ***** test 1, shared birthdays");
        
        //sharedBirthdays test 2
        pairs = CodeCamp.sharedBirthdays(101, 100);
        System.out.println(newline + "Test 2 shared birthdays: expected: " +
                "a value of 1 or more, actual: " + pairs);
        if( pairs > 0 )
            System.out.println("passed test 2, shared birthdays");
        else
            System.out.println("***** FAILED ***** test 2, shared birthdays");        
        
        //queensAreASafe test 1
        char[][] board = {{'q', '.', '.'},
        				  {'.', '.', 'q'},
        				  {'.', '.', '.'}};
        expectedBool = true;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(newline + "Test 1 queensAreSafe: expected value: " 
                + expectedBool + ", actual value: " + actualBool);
        if ( expectedBool == actualBool )
            System.out.println(" passed test 1, queensAreSafe");
        else
            System.out.println(" ***** FAILED ***** test 1, queensAreSafe");

        //queensAreASafe test 2
        board = new char[][]{{'q', '.', 'q'},
                             {'.', 'q', '.'},
                             {'q', '.', 'q'}};
        expectedBool = false;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(newline + "Test 2 queensAreSafe: expected value: " 
                + expectedBool + ", actual value: " + actualBool);
        if ( expectedBool == actualBool )
            System.out.println(" passed test 2, queensAreSafe");
        else
            System.out.println(" ***** FAILED ***** test 2, queensAreSafe");
        
        //getValueOfMostValuablePlot test 1
        int[][] city = {{0, -1, -1, 0, -1},
                        {-1, -1, -1, -1, -1},
                        {-1, -0, -1, -1, 0}};
        
        expected = 0;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(newline + "Test 1 getValueOfMostValuablePlot: expected value: " 
                + expected + ", actual value: " + actual);
        if( expected == actual )          
            System.out.println(" passed test 1, getValueOfMostValuablePlot");
        else
            System.out.println(" ***** FAILED ***** test 1, getValueOfMostValuablePlot");

        //getValueOfMostValuablePlot test 2
        city = new int[][]{{1, 2, 3, 4, 5},
        				   {-5, -4, -3, -2, -1},
        				   {1, 2, 3, 4, 5}};
        expected = 18;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(newline + "Test 2 getValueOfMostValuablePlot: expected value: " 
                + expected + ", actual value: " + actual);
        if( expected == actual )          
            System.out.println(" passed test 2, getValueOfMostValuablePlot");
        else
            System.out.println(" ***** FAILED ***** test 2, getValueOfMostValuablePlot");
    }
    
    // pre: list != null
    private static int[] intListToArray(List<Integer> list) 
    {
        if(list == null)
            throw new IllegalArgumentException("list parameter may not be null.");
        int[] result = new int[list.size()];
        int arrayIndex = 0;
        for(int x : list) {
            result[arrayIndex++] = x;
        }
        return result;
    }
}
