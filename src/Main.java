import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int RegNo=scanner.nextInt();
        int evensum=0;
        int oddsum=0;
        while(RegNo!=0)
        {
            int single=RegNo%10;
            if(single%2==0)
            {
                evensum+=single;
            }
            else
            {
                oddsum+=single;
            }
            RegNo=RegNo/10;
        }
        String Result=(evensum==oddsum)?"true":"false";
        System.out.println(Result);
    }
}