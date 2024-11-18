import java.util.Arrays;//table formatting
public class esaFour {
    public static void main(String[] args) {
        int mediCare[][] ={
            {1,2,3,4,5,6,7},//weekly days
            {0,1,1,0,0,1,0},//morning
            {1,1,0,0,1,0,0},//afternoon
            {0,1,1,0,0,1,1}//night

        };
        System.out.println(Arrays.deepToString(mediCare).replace("],","]\n"));/*you can make
         multidimensional arrays look like a table using clever programming  */
         
    }
    
}
