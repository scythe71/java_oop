public class Operator {
    

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // 30
        System.out.println("Subtraction: " + (b - a)); // 10
        System.out.println("Multiplication: " + (a * b)); // 200
        System.out.println("Division: " + (b / a)); // 2
        System.out.println("Modulus: " + (b % a)); // 0

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false

        // Assignment Operators
        int c = a; // c = 10
        c += 5;    // c = c + 5 -> c = 15
        System.out.println("c after += 5: " + c); // 15
        c -= 3;    // c = c - 3 -> c = 12
        System.out.println("c after -= 3: " + c); // 12
        c *= 2;    // c = c * 2 -> c = 24
        System.out.println("c after *= 2: " + c); // 24
        c /= 4;    // c = c / 4 -> c = 6
        System.out.println("c after /= 4: " + c); // 6
        c %= 4;    // c = c % 4 -> c = 2
        System.out.println("c after %= 4: " + c); // 2
    }
}
