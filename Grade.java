// import java.io.PrintStream;
import java.util.*;
public class Grade {
    public static void grade(float average_percentage ){
        if(average_percentage>=85){
            System.out.print("You Passed with Grade 'A'");  
        }
        else if(average_percentage>=70 && average_percentage<85){
            System.out.print("You Passed with Grade 'B'");
        }
        else if(average_percentage>=55 && average_percentage<70){
            System.out.print("You Passed with Grade 'C'");
        }
        else if(average_percentage>=40 && average_percentage<55){
           System.out.print("You Passed with Grade 'D'"); 
        }
        else{
            System.out.print("Fail");
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Number of Subjects:");
        int n=sc.nextInt();
        int marks[]=new int[n];
        float total=0;
        float average_percentage;

        for(int i=0;i<n;i++){
            System.out.print("Enter the total marks of subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
            total=total+marks[i];
        }
        average_percentage=(total/(n*100))*100;

        System.out.print("Total marks : "+total);
        System.out.println();
        System.out.print("Percentage : "+average_percentage+"%");
        System.out.println();
        grade(average_percentage);
        sc.close();
    }
}