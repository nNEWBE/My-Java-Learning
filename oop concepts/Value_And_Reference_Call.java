public class Value_And_Reference_Call {
    int ref;
    void value(int i) {
        i = 20;
    }

    void reference(Value_And_Reference_Call j) {
        j.ref = 40;
    }

    public static void main(String[] args) {
        Value_And_Reference_Call value = new Value_And_Reference_Call();
        int i = 10;
        System.out.println("Value of i before passing : " + i );
        value.value(i);
        System.out.println("Value of i after passing : " + i );

        System.out.println();

        Value_And_Reference_Call reference = new Value_And_Reference_Call();
        reference.ref = 20;
        System.out.println("Reference of ref before passing : " + reference.ref );
        reference.reference(reference);
        System.out.println("Reference of ref before passing : " + reference.ref );
    }

}
