public class Do_While_Loop {
    public static void main(String[] args) {
        String[] arr = new String[] { "Amit", "Ayon", "Bedita", "Hridi", "Mazus", "Nayeem", "Riyad", "Rokib", "Sakib",
                "Sazzad", "Supty", "Shuvo" };

        int i = 0;
        do {
            System.out.println((i + 1) + ". " + arr[i]);
            i++;
        } while (i < arr.length);
    }
}
