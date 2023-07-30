/* Question : There are N people standing in a circle waiting to the executed.

 * 			The counting out begins at some point in the circle and proceeds around the circle in a fixed direction.
 * 			In each state a certain number of people skipped and the next person is executed.
 * 			The elimination proceeds around the circle (Which is becoming smaller and smaller as the executed people are removing).
 * 			Until only the last person remains, who is given freedom 
 * 			Given: the total number of persons and the number came which indicate
 * 			k-1 person are skipped and the k person are killed in the circle
 *   		the task is to choose the person in the initial circle that survives.
 * 
 */

package org.tnsif.Day_04Challenge;
import java.util.Scanner;
public class CircleSurviveChallenge {
	
	static int survive(int n,int k)
	{
		if(n==1) 
		{
			return 1;
		}
		else {
			return (survive(n-1,k)+k-1)%n+1;
			
		}
			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of people / value of N: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		
		System.out.println("The last number of the person which will be survive at the end is:");
		
		System.out.println(survive(n,k));
		
		
		

	}

}
