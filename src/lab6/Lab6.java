/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author pede9227
 */
import javax.swing.*;

public class Lab6 {

	public static void main(String[] args) {
		//creates an array of numbers up to 100
		int[] numArray = new int [100];
		//new argurment to read TextFileInput.class
		String filename = args[0];
		//counter to keep count of how many inputs the file has
		int count = inputFromFile(filename, numArray);
		
		showNums(numArray, count);
		
		int totalSum = sum(numArray, count);

		int avg = average(totalSum, count);
		
		JOptionPane.showMessageDialog(null,"The sum is:" + totalSum + "\n" + "The average is: "+avg);
	} //main

	private static int inputFromFile(String filename, int[] numbers){
      TextFileInput in = new TextFileInput(filename);
      int index = 0;
      int lengthLimit = numbers.length;
      String temp = in.readLine();
      
      
      
      while(index < lengthLimit) {
    	  numbers[index] = Integer.parseInt(temp);
    	  index++;
    	  temp = in.readLine();
    	  if(temp == null)
    		  break;
    	  
    	  
      }
      
      
      
//      String line = in.readLine();
//	  
//      while ( index < numbers.length && line != null ) {
//		int n = Integer.parseInt(line);
//         numbers[index++] = n;
//         line = in.readLine();
//      } // while 

      if ( temp != null ) {
         System.out.println("File contains too many numbers.");
         System.out.println("This program can process only " + numbers.length + " numbers.");
         System.exit(1);
      } // if
      in.close();
      return index; 

   }  // method inputFromFile 

   	//function to calculate total sum.
	public static int sum (int[] myArray, int myArraySize){
		int sum=0;
		for(int i=0; i<myArraySize; i++){
			sum += myArray[i];
		}
		return sum;	
	}

	//function to calculate average
	public static int average(int sum, int myArraySize){
		return sum / myArraySize;
	}
	
	private static void showNums(int[] numbers, int N) {
		for(int i=0; i<N; i++)
			System.out.println(numbers[i]);
	}

} // class Lab6Program1
