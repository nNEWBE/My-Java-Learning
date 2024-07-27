public class For_Loop {
    public static void main(String[] args) {
        String[] arr = new String[] { "Amit", "Ayon", "Bedita", "Hridi", "Mazus", "Nayeem", "Riyad", "Rokib", "Sakib",
                "Sazzad", "Supty", "Shuvo" };

        //! Alternative
        /*
         * for (String str : arr) {  
         #   System.out.println(str);  
         ? }  
        */

        for(int i = 0; i<arr.length; i++) {
            System.out.println((i+1)+". "+arr[i]);
        }
    }
}
