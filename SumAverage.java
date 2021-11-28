import java.util.Scanner;
public class SumAverage 
{
	public static void main(String[] args)
	{
        Scanner sha =new Scanner(System.in);
       // creating an empty array
       int num[] = new int[10];
       int i=0;
       for(i=0;i<10; i=i+1)
       {
       System.out.println("Enter the numbers");  
       num[i]=sha.nextInt();
       }
	    int sum=0;
        for( int x=0; x<10; x=x+1)
        {
        System.out.println(num[x]); 
        sum=sum+num[x];
        }
        System.out.println("Total marks are"  +sum);
        float avg = sum/(1.0f*i);
        System.out.println("The average marks are"   + avg);
	} 
}	