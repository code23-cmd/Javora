import java.util.Scanner;

public class StudentPercentageArray{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

// store marks of 10 students
int marks[][] = new int[10][5];

for(int i=0;i<10;i++)
{
    System.out.println("Enter marks for Student " + (i+1));

    // enter 5 subject marks
    for(int j=0;j<5;j++)
    {
        marks[i][j] = sc.nextInt();
    }
}

// calculate percentage
for(int i=0;i<10;i++)
{
    int total = 0;    //in java there is no system of any garbage value

    for(int j=0;j<5;j++)
    {
        total = total + marks[i][j];
    }

    double percentage = total / 5.0;

    System.out.println("Student " + (i+1) + " Percentage = " + percentage + "%");
}

}
}