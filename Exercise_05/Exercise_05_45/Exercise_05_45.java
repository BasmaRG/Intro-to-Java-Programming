/*
(Statistics: compute mean and standard deviation) In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.
Write a program that prompts the user to enter ten numbers, and displays the
mean and standard deviations of these numbers using the following formula:
*/

     import java.util.Scanner;
     public class Exercises5 {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
                double [] numbers = new double [10] ;	
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) 
			numbers[i] = input.nextDouble();
                
		double mean,deviation;
               
                mean = mean(numbers);
                deviation = std(numbers, mean);
                
                System.out.println("The mean is " + mean);
		    System.out.printf("The standard deviation is %.5f\n", deviation);
                
      }
      public static double mean(double numArray[]){
            double sum = 0.0;
            int length = numArray.length;
            for(double num : numArray)
            sum += num;
        
            double mean = sum/length;
            
            return mean;
        }
     
        public static double std(double numArray[] , double mean{
        double standardDeviation = 0.0;
        int length = numArray.length;
        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }
       return Math.sqrt(standardDeviation /(length - 1));
     }
    }
