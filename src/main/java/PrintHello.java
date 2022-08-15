import java.util.Scanner;

public class PrintHello {
    public static void print(){
        System.out.println("helloworld");
    }
    
    public static void main(String [] args){
        print();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String str = scanner.nextLine();
        System.out.println(str);
    }
}
