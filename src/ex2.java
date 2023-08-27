public class ex2 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*101);
        int b = (int) (Math.random()*101);
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("Sum : "+(a+b));
        System.out.println("Avg : "+(a+b)/3);
        System.out.println("a reminder by 10 : "+a % 10);
        System.out.println("b reminder by 10 : "+b % 10);
        System.out.println("Area : "+a*b);
        System.out.println("Perimeter : "+2*(a+b));

    }
}
