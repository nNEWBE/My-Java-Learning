public class Break_and_Continue {
    public static void main(String[] args) {
        System.out.println("Use of Break Statement");
        for (int i = 1; i <= 20; i += 2) {
            if (i == 11)
                break;
            System.out.println(" " + i);
        }

        System.out.println("\nUse of Continue Statement");
        for (int i = 1; i <= 20; i += 2) {
            if (i == 11)
                continue;
            System.out.println(" " + i);
        }

        System.out.println("\nUse of Break and Continue Statements");
        for (int i = 1; i <= 100; i += 3) {
            if (i == 10)
                continue;
            if (i > 13)
                break;
            System.out.println(" " + i);
        }
        
    }
}

