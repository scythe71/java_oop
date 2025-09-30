package P_ProsByValue;
public class P_prosbyvalue {
    public static void main(String[] args) {
        int x, y;
        TestPassValue e;

        e = new TestPassValue(53, 103);
        x = 13;
        y = 23;

        System.out.println("Nilai sebelum passed by value: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        e.hitung(x, y);
        System.out.println("Nilai setelah passed by value: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Nilai sebelum passed by reference: ");
        System.out.println("e.i = " + e.i);
        System.out.println("e.j = " + e.j);
        e.hitung(e);
        System.out.println("Nilai setelah passed by reference: ");
        System.out.println("e.i = " + e.i);
        System.out.println("e.j = " + e.j);
    }
}
