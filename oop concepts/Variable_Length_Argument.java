import java.util.Arrays;

public class Variable_Length_Argument {
    void sum(int... num) {
        int sum = 0;
        System.out.println(Arrays.toString(num)); //! Print the array using Arrays.toString()
        for(int x:num){
            sum += x;
        }

        System.out.println("sum: " + sum);
    }

    public static void main(String[] args) {
        Variable_Length_Argument arguments = new Variable_Length_Argument();
        arguments.sum(10, 20, 30, 40); //? Pass variable-length arguments
    }
}
