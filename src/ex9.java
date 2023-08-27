public class ex9 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101);
        int c = (int) (Math.random() * 101);
        int d = (int) (Math.random() * 101);
        int e = (int) (Math.random() * 101);

        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);

        int max = Math.max(a,b);

        if (a>b && a>c && a>d && a>e)
            System.out.println ("The first of your numbers is the bigest");

        else if(b>a && b>c && b>d && b>e)
            System.out.println ("The second of your numbers is the bigest");

        else if (c>a && c>b && c>d && c>e)
            System.out.println ("The third of your numbers is the bigest");

        else if (d>a && d>b && d>c && d>e)
            System.out.println ("The fourth of your numbers is the bigest");

        else if (e>a && e>b && e>c && e>d)
            System.out.println ("The fifth of your numbers is the bigest");




        System.out.println("The max of 5 is: " + max);
    }
}



