public class ex4 {
    public static void main(String[] args) {

        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        int sum = a + b;
        System.out.println("Max : " + Math.max(a, b));
        System.out.println("Min : " + Math.min(a, b));
        System.out.println("Avg : " + (a + b) / 2);
        System.out.println("Sum : " + (a + b));

        if (sum % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        }
    }