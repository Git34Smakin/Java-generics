import java.util.Scanner;
public class multTable {//while loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number =scanner.nextInt();
        int multiplier = 1;
        while(multiplier<=12){
            System.out.println(String.format("%d*%d=%d",number,multiplier,number*multiplier));
            multiplier++;
        }
        scanner.close();
    }
    
}
