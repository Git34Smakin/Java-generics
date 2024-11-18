import java.util.Arrays;//filling an array with the same value
public class esaEight {
public static void main(String[] args) {
    char vowels[] = {'a','i','o','e','u'};
    Arrays.fill(vowels,'p');
    System.out.println("the filled array:"+ Arrays.toString(vowels));

    
}
}
