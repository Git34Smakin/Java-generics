public class multiplicationTable {//for loop
    public static void main(String[] args) {
        int number = 12;
        for (int multiplier = 1; multiplier<=12; multiplier++ ){
           System.out.println(String.format("%d*%d=%d",number,multiplier,number*multiplier));
        }
    }
    
}
