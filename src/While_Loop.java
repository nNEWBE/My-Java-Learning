public class While_Loop {
    public static void main(String[] args) {
        String[] arr = new String[] { "Amit", "Ayon", "Bedita", "Hridi", "Mazus", "Nayeem", "Riyad", "Rokib", "Sakib",
                "Sazzad", "Supty", "Shuvo" };

        int i = 0;
        while (i < arr.length) {
            System.out.println((i + 1) + ". " + arr[i]);
            i++;
        }
    }
}
