import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int nr;
        int nr2;
        int upperBound = 1000;
        Random number = new Random();
        nr = number.nextInt(upperBound);
        nr2 = number.nextInt(upperBound);
        System.out.println("the numbers are "+ nr+","+nr2);
        con(nr,nr2);
    }

    public static void con(int nr1, int nr2) {
        double finalNumber = 0;
        int digitCounter=0;
        int nr1Copy=nr1;
       /* if (nr1 < 10) {
            finalNumber = nr2 * 10 + nr1;
        } else if (nr1 > 10) {
            finalNumber = nr2 * 100 + nr1;

        }*/
        while(nr1>0){
            nr1/=10;
            digitCounter++;
        }

        finalNumber=nr2*Math.pow(10,digitCounter)+nr1Copy;

        System.out.println("the number is " +(int) finalNumber);
    }
}
