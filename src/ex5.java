public class ex5 {
        public static void main(String[] args) {

            int a = (int) (Math.random() * 551) + 200;
            System.out.println("a : "+a);
            int b = (int) (Math.random() * 551) + 200;
            System.out.println("b : "+b);
            int c = (int) (Math.random() * 551) + 200;
            System.out.println("c : "+c);
            int Max = Math.max(a, Math.max(b, c));
            System.out.println("Max : " + Math.max(a, Math.max(b, c)));
            if (Max % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        }
}
