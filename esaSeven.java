import java.util.Arrays;//binary search(searching for a sorted value) using Array.binarySearch()method
public class esaSeven {
  public static void main(String[] args) {
    int numbers[]= {1,2,3,4,5,6,7};
    int key= 6;
    int foundItemIndex = Arrays.binarySearch(numbers,key);
    System.out.println("the number 6 is at index:"+ foundItemIndex);
    
  }  
}
