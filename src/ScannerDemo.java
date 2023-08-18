import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Please enter name");
        String name=a.next();
        System.out.println("Please enter age");
        int age=a.nextInt();
        boolean isMajor;
        if(age>=18)
        {
            System.out.println(name +" is major");
        }else {
            System.out.println(name+" : is minor");
        }
    }
}
