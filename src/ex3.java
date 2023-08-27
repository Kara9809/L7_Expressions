public class ex3 {
    public static void main(String[] args) {
        int movie = (int) (Math.random()*251)+100;
        System.out.println("Movie in minutes : "+movie);
        System.out.println("Movie length : " + (movie / 60) + " hours amd " + (movie % 60) + " minutes");
    }
}
