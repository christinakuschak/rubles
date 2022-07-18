public class Main {
    public static void main(String[] args) {
        int initial = 270;
        int refill = 1500;
        int total = initial + refill + refill / 100;
        int total1 = initial + refill;

        if (refill > 1000) {
            System.out.println(" Зачислено " + total + " руб."
            );
        } else {
            System.out.println(" Зачислено " + total1 + " руб.");
        }
    }
}
