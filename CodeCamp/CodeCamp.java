//  CodeCamp.java - CS314 Assignment 1

/*  Student information for assignment:
 * 
 * replace <NAME> with your name.
 *
 *  On my honor, Kevin Hao, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  Name: Kevin Hao
 *  email address: kevinhao3300@yahoo.com
 *  UTEID: kjh2858
 *  Section 5 digit ID: 51365
 *  Grader name: Levi
 *  Number of slip days used on this assignment: 0
 */

import java.util.Random;

public class CodeCamp 
{
    /**
     * Determine the Hamming distance between two arrays of ints. 
     * Neither the parameter <tt>aList</tt> or
     * <tt>bList</tt> are altered as a result of this method.<br>
     * @param aList != null, aList.length == bList.length
     * @param bList != null, bList.length == aList.length
     * @return the Hamming Distance between the two arrays of ints.
     */    
    public static int hammingDistance(int[] aList, int[] bList)
    {
        // check preconditions
        if (aList == null || bList == null || aList.length != bList.length) 
            throw new IllegalArgumentException("Violation of precondition: " +
            		"hammingDistance. neither parameter may equal null, arrays" +
            		" must be equal length.");
        
        /*CS314 STUDENTS: INSERT YOUR CODE HERE*/
        int count = 0;
        for(int index = 0; index < aList.length; index++)
        {
        	if (aList[index] != bList[index])
        		count++;
        }
        return count; 
    }
    
    /**
     * Determine if one array of ints is a permutation of another.
     * Neither the parameter <tt>listA</tt> or 
     * the parameter <tt>listB</tt> are altered as a result of this method.<br>
     * @param listA != null
     * @param listB != null
     * @return <tt>true</tt> if listB is a permutation of listA, 
     * <tt>false</tt> otherwise
     * 
    */
    public static boolean isPermutation(int[] listA, int[] listB) 
    {
        // check preconditions
        if (listA == null || listB == null) 
            throw new IllegalArgumentException("Violation of precondition: " +
            		"isPermutation. neither parameter may equal null.");
        /*CS314 STUDENTS: INSERT YOUR CODE HERE*/
        int lenA = listA.length;
        int lenB = listB.length;
        if (lenA != lenB)
        	return false;
        int[] a = listA;
        int[] b = listB;
        a = sortList(a);
        b = sortList(b);
        //check if sorted lists are equal
        for(int i = 0; i  <  lenA; i++)
        {
            if(a[i] != b[i])
               return false;	      
        }
        return true;
    }
    
    /**
     * sorts a given list
     * @param list list to be sorted
     * @return sorted list
     */
    public static int[] sortList(int[] list) 
    {
    	for (int i = 0; i < list.length - 1; i++)
            for (int j = 0; j < list.length - i - 1; j++)
            {
                if (list[j] > list[j+1])
                {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
    	return list;
    }

    /**
     * Determine the index of the String that 
     * has the largest number of vowels. 
     * Vowels are defined as <tt>'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 
     * 'U', and 'u'</tt>.
     * The parameter <tt>list</tt> is not altered as a result of this method.
     * <p>pre: <tt>list != null</tt>, <tt>list.length > 0</tt>, there is an least 1 non null element in list
     * <p>post: return the index of the non-null element in list that has the 
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero. 
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.<br>
     * @param list the array to check
     * @return the index of the non-null element in list that has 
     * the largest number of vowels.
     */
    public static int mostVowels(String[] list) 
    {
        // check preconditions
        if (list == null || list.length == 0 || !atLeastOneNonNull(list))  
            throw new IllegalArgumentException("Violation of precondition: " +
            		"mostVowels. parameter may not equal null and must contain " +
            		"at least one none null value.");
       
        // CS314 STUDENTS: ADD YOUR CODE HERE
        //  You can use all methods from the String class and native arrays.
        final String VOWELS = "AEIOUaeiou";
        int most = -1;
        String word;
        int ans = -1;
        for (int index = 0; index < list.length; index++)
        {
        	int num = 0;
        	word = list[index];
        	if (word != null)
        	{
	        	for (int i = 0; i < word.length(); i++)
	        	{
	        		if(VOWELS.indexOf(word.charAt(i)) != -1)
	        			num++;
	        	}
	        	
	        	if (num > most)
	        	{
	        		most = num;
	        		ans = index;
	        	}
        	}
        }
        return ans;
    }
   
    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people. 
     * Return the number of pairs of people that share the
     * same birthday.<br>
     * @param numPeople The number of people in the experiment.
     * This value must be > 0
     * @param numDaysInYear The number of days in the year for this experiment.
     * This value must be > 0
     * @return The number of pairs of people that share a birthday 
     * after running the simulation.
     */
    public static int sharedBirthdays(int numPeople, int numDaysInYear) 
    {
        // check preconditions
        if (numPeople <= 0 || numDaysInYear <= 0)
            throw new IllegalArgumentException("Violation of precondition: " +
            		"sharedBirthdays. both parameters must be greater than 0. " +
                    "numPeople: " + numPeople + 
                    ", numDaysInYear: " + numDaysInYear);
        
        //CS314 STUDENTS: ADD YOUR CODE HERE
        int[] people = new int[numPeople];
        //assign random birthdays
        for(int index = 0; index < numPeople; index++)
        {
        	people[index] = (int)(Math.random() * numDaysInYear) + 1;
        }
        int matches = 0;
        
        //check matches
        for (int i = 0; i < numPeople; i++)
        {
            for (int j = i + 1; j < numPeople; j++)
            {
                if (people[i] == people[j])
                	matches++;
            }
        }
        return matches;
    }
    
    /**
     * Determine if the chess board represented by board is a safe set up.
     * <p>pre: board != null, board.length > 0, board is a square matrix.
     * (In other words all rows in board have board.length columns.),
     * all elements of board == 'q' or '.'. 'q's represent queens, '.'s
     * represent open spaces.<br>
     * <p>post: return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     * the parameter <tt>board</tt> is not altered as a result of 
     * this method.<br>
     * @param board the chessboard
     * @return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
    */
    public static boolean queensAreSafe(char[][] board) 
    {
        char[] validChars = {'q', '.'};
        // check preconditions
        if (board == null || board.length == 0 || !isSquare(board) 
                || !onlyContains(board, validChars))
            throw new IllegalArgumentException("Violation of precondition: " +
            		"queensAreSafe. The board may not be null, must be square, " +
            		"and may only contain 'q's and '.'s");        
                
      //CS314 STUDENTS: ADD YOUR CODE HERE
        boolean[][] unsafe_spots = new boolean[board.length][board.length];
        boolean safe_queens = true;
        
        //loops through the board
        for (int row = 0; row < board.length; row++)
        {
        	for (int col = 0; col < board.length; col++)
        	{
        		//checks if there is a queen at the spot
        		if (board[row][col] == validChars[0])
        		{
        			//checks if new queen is "safe" or not
        			if (unsafe_spots[row][col] == false)
        			{
        				//loops through 2D boolean array to change spots to become unsafe based on new queen placement
        				for (int r = 0; r < board.length; r++)
            			{
        					for (int c = 0; c < board.length; c++)
                			{
                				unsafe_spots[row][c] = true;
                				unsafe_spots[r][col] = true;
                				if (Math.abs(r - row) == Math.abs(c - col))
                				{
                					unsafe_spots[r][c] = true;
                				}
                			}
            			}
        			}
        			else
        				safe_queens = false;
        		}
        	}
        }
        return safe_queens; 
    }
        
    /**
     * Given a 2D array of ints return the value of the
     * most valuable contiguous sub rectangle in the 2D array.
     * The sub rectangle must be at least 1 by 1. 
     * <p>pre: <tt>mat != null, mat.length > 0, mat[0].length > 0,
     * mat</tt> is a rectangular matrix.
     * <p>post: return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.<br>
     * @param city The 2D array of ints representing the value of
     * each block in a portion of a city.
     * @return return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.
     */
    public static int getValueOfMostValuablePlot(int[][] city) 
    {
        // check preconditions
        if (city == null || city.length == 0 || city[0].length == 0 
                || !isRectangular(city) )
            throw new IllegalArgumentException("Violation of precondition: " +
            		"getValueOfMostValuablePlot. The parameter may not be null," +
            		" must value at least one row and at least" +
                    " one column, and must be rectangular."); 
        
        //CS314 STUDENTS: ADD YOUR CODE HERE
        int highest_value = city[0][0];
        
        //loops through every possible plot and keeps track of highest value
        for (int top_row = 0; top_row < city.length; top_row++)
        {
        	for (int left_col = 0; left_col < city[0].length; left_col++)
        	{
        		for (int bottom_row = top_row; bottom_row < city.length; bottom_row++)
        		{
        			for (int right_col = left_col; right_col < city[0].length; right_col++)
        			{
        				int[][]block = makeBlock(city, top_row, left_col, bottom_row, right_col);
        				if (getValue(block) > highest_value)
        				{
        					highest_value = getValue(block);
        				}
        			}
        		}
        	}
        }
        return highest_value; 
    }
    
    /**
     * Given the original 2D array of ints and 2 coordinates 
     * returns a new block at the new location
     * @param city The 2D array of ints representing the value of
     * each block in a portion of a city.
     * @param y1 y coordinate of first point
     * @param x1 x coordinate of first point
     * @param y2 y coordinate of second point
     * @param x2 x coordinate of second point
     * @return a new block from given coordinates
     */
    public static int[][] makeBlock(int[][] city, int y1, int x1, int y2, int x2)
    {
    	int[][] block = new int[y2 - y1 + 1][x2 - x1 + 1];
    	for (int row = 0; row < y2 - y1 + 1; row++)
    	{
    		for (int col = 0; col < x2 - x1 + 1; col++)
    		{
    			block[row][col] = city[row + y1][col + x1];
    		}
    	}
    	return block;
    }
    
    /**
     * Given a 2D array returns the sum of the values at each index
     * @param block 2D array given
     * @return sum of all values in the 2D array
     */
    public static int getValue(int[][] block)
    {
    	int value = 0;
    	for (int row = 0; row < block.length; row ++)
    	{
    		for (int col = 0; col < block[row].length; col++)
    		{
    			value += block[row][col];
    		}
    	}
    	return value;
    }
    
    // !!!!! ***** !!!!! ***** !!!!! ****** !!!!! ****** !!!!! ****** !!!!!!
    // CS314 STUDENTS: Put your birthday problem experiment code here:
    /**
     * Performs 1,000,000 birthday experiments with fixed parameters and returns 
     * the average number of pairs of people who share a birthday
     * @return average number of pairs of people who share a birthday
     */
    public static int first_experiment()
    {
    	final int NUMEXPERIMENTS = 1000000;
    	final int NUMDAYS = 365;
    	final int NUMPEOPLE = 182;
    	int numPairs = 0;
    	for (int x = 0; x < NUMEXPERIMENTS; x++)
    	{
    		numPairs += sharedBirthdays(NUMPEOPLE, NUMDAYS);
    	}
    	int averagePairs = numPairs/NUMEXPERIMENTS;
    	return averagePairs;
    }
    
    /**
     * Performs 50,000 birthday experiments with fixed number of days with an increasing number of people
     * and prints out the percentage of experiments with at least one shared birthday
     */
    public static void second_experiment()
    {
    	final int NUMEXPERIMENTS = 50000;
    	final int NUMDAYS = 365;
    	final int MAXPEOPLE = 100;
    	final int MINPEOPLE = 2;
    	final int PERCENTMULTIPLIER = 100;
    	for (int x = MINPEOPLE; x <= MAXPEOPLE; x++)
    	{
    		double numSuccess = 0;
    		for (int i = 0; i < NUMEXPERIMENTS; i++)
    		{
    			int numPairs = 0;
    			numPairs += sharedBirthdays(x, NUMDAYS);
    			if (numPairs > 0)
    			{
    				numSuccess++;
    			}
    		}
    		double percentage  = numSuccess / NUMEXPERIMENTS * PERCENTMULTIPLIER;
    		System.out.print("Num people: " + x + ", number of experiments with one or more shared birthday:"
    				+ " " + numSuccess + ", percentage: ");
    		System.out.printf("%.2f%n", percentage);
    	}
    }
    
    // pre: list != null
    // post: return true if at least one element in list is null
    // otherwise return false.
    private static boolean atLeastOneNonNull(String[] list) 
    {
        // check precondition
        if(list == null)
            throw new IllegalArgumentException("Violation of precondition: " +
            		"atLeastOneNonNull. parameter may not equal null.");
        
        boolean foundNonNull = false;
        int i = 0;
        while( !foundNonNull && i < list.length ){
            foundNonNull = list[i] != null;
            i++;
        }
        return foundNonNull;
    }
    
    /* pre: mat != null
    post: return true if mat is a square matrix, false otherwise
     */
    private static boolean isSquare(char[][] mat) 
    {
        if(mat == null)
            throw new IllegalArgumentException("Violation of precondition: " +
            		"isSquare. paremeter may not be null.");

        final int numRows = mat.length;
        int row = 0;
        boolean isSquare = true;
        while( isSquare && row < numRows ) {
            isSquare = ( mat[row] != null) && (mat[row].length == numRows);
            row++;
        }
        return isSquare;
    }
    
    /* pre: mat != null, valid != null
    post: return true if all elements in mat are one of the characters in valid
     */
    private static boolean onlyContains(char[][] mat, char[] valid) 
    {
        // check preconditions
        if(mat == null || valid == null)
            throw new IllegalArgumentException("Violation of precondition: " +
            		"onlyContains. paremeters may not be null.");
 
        int row = 0;
        boolean correct = true;
        while( correct && row < mat.length) {
            int col = 0;
            while(correct && col < mat[row].length) {
                correct = contains(valid, mat[row][col]);
                col++;
            }
            row++;
        }
        return correct;
    }
    
    /*  pre: list != null
        post: return true if c is in list
     */
    private static boolean contains(char[] list, char tgtChar) 
    {
        // check preconditions
        if(list == null)
            throw new IllegalArgumentException("Violation of precondition: " +
            		"contains. paremeter may not be null.");

        boolean found = false;
        int index = 0;
        while( !found && index < list.length) {
            found = list[index] == tgtChar;
            index++;
        }
        return found;
    }
   
     // pre: mat != null, mat.length > 0
     // post: return true if mat is rectangular
    private static boolean isRectangular(int[][] mat) 
    {
        // check preconditions
        if(mat == null || mat.length == 0)
            throw new IllegalArgumentException("Violation of precondition: " +
            		"isRectangular. paremeter may not be null and must contain" +
            		" at least one row.");

        boolean correct = mat[0] != null;
        int row = 0;
        while(correct && row < mat.length) {
            correct = (mat[row] != null) && (mat[row].length == mat[0].length);
            row++;
        }
        return correct;
    }
    
    // make constructor private so no instances of CodeCamp can be created
    private CodeCamp() 
    	{
    	}
    }
