import java.util.ArrayList;
public class arrayListAccess {
    public static void main(String[] args) {
        ArrayList<Integer>oddNumbers = new ArrayList<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        oddNumbers.add(11);
        System.out.println("value at index(4):"+oddNumbers.get(4));//use get() method to access a value in ArrayList
        oddNumbers.set(2,88);//use set() method to update the values of the element
        System.out.println("updated ArrayList:"+oddNumbers.toString());
        System.out.println("length of the ArrayList:"+oddNumbers.size());// size() for length of ArrayList instead of length() for Arrays
        //removing element by valueOf or index using remove() method
        oddNumbers.remove(Integer.valueOf(11));
        System.out.println("After removal:"+oddNumbers.toString());
    }
    
}
