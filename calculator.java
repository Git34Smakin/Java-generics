import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first operand");
        int num1 = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        System.out.println("enter second operand");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("choose operation");
        String operation = scanner.nextLine();
        switch (operation) {
            case "sum":

            System.out.printf("%d+%d=%d",num1,num2,num1+num2);
                
                break;
                case"sub":
                System.out.printf("%d-%d=%d",num1,num2,num1-num2);
                break;
                case"mult":
                System.out.printf("%d*%d=%d",num1,num2,num1*num2);
                break;
                case"div":
                if(num2==0){
                    System.out.println("can't divide by zero ");
                }else{
                System.out.printf("%d/%d=%d",num1,num2,num1/num2);
                }
                break;
                case"modu":
                System.out.printf("%d%%d=%d",num1,num2,num1%num2);
                break;
        
            default:
            System.out.println("invalid operation");
                break;
        }
        scanner.close();

        
    }
}
