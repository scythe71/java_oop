package p_prosbyvalue;
public class P_ProsByValue {
    public static void main(String[] args) {
        int x, y;
        TestPassValue z;

        z = new TestPassValue(53, 103);
        x = 13;
        y = 23;

        System.out.println("Nilai sebelum passed by value: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z.hitung(x, y);
        System.out.println("Nilai setelah passed by value: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Nilai sebelum passed by reference: ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);
        z.hitung(z);
        System.out.println("Nilai setelah passed by reference: ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);
    }
}
