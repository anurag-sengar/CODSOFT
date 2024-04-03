import java.util.Scanner;
public class StudGrad
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks scored out of 100 in the following subjects :");
        System.out.println("English :");
        int Eng = sc.nextInt();
        System.out.println("Science :");
        int Sci = sc.nextInt();
        System.out.println("Mathematics :");
        int Mat = sc.nextInt();
        System.out.println("Social Studies :");
        int Sst = sc.nextInt();
        System.out.println("Computer :");
        int Cpt = sc.nextInt();
        int TotalMarks = Eng+Sci+Mat+Sst+Cpt;
        int AvgPercent = TotalMarks / 5;
        char Grade;
        if ( AvgPercent < 40)
        Grade = 'E';
        else if ( AvgPercent >= 40 && AvgPercent < 60)
        Grade = 'D';
        else if ( AvgPercent >= 60 && AvgPercent < 80)
        Grade = 'C';
        else if ( AvgPercent >= 80 && AvgPercent < 90)
        Grade = 'B';
        else
        Grade = 'A';
        System.out.println("Total marks : " + TotalMarks);
        System.out.println("Average percentage : " + AvgPercent + "%");
        System.out.println("Grade assigned : " + Grade);
        sc.close();
    }
}
