package P_ProsByValue;
public class TestPassValue {
    int i, j;

    TestPassValue(int a, int b) {
        i = a;
        j = b;
    }

    void hitung(int m, int n) {
        m = m * 13;
        n = n / 5;
    }

    void hitung(TestPassValue e) {
        e.i = e.i * 13;
        e.j = e.j / 5;
    }
}
