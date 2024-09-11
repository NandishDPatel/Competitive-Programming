import java.util.Scanner;

public class Q8MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();
        printGrade(marks);
    }
    static void printGrade(int mrk){
        if(mrk>90){
            System.out.println("AA");
        } else if(mrk>80){
            System.out.println("AB");
        } else if(mrk>70){
            System.out.println("BB");
        } else if(mrk>60){
            System.out.println("BC");
        } else if(mrk>50){
            System.out.println("CD");
        } else if(mrk>40){
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }
}
