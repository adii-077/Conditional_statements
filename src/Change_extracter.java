import java.util.Scanner;

public class Change_extracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 1};

        int count = amount / notes[0];
        if (count > 0) {
            System.out.println(notes[0] + " x " + count);
        }
        amount = amount % notes[0];

        int count1 = amount / notes[1];
        if (count1 > 0) {
            System.out.println(notes[1] + " x " + count1);
        }
        amount = amount % notes[1];

        int count2 = amount / notes[2];
        if (count2 > 0) {
            System.out.println(notes[2] + " x " + count2);
        }
        amount = amount % notes[2];

        int count3 = amount / notes[3];
        if (count3 > 0) {
            System.out.println(notes[3] + " x " + count3);
        }
        amount = amount % notes[3];

        int count4 = amount / notes[4];
        if (count4 > 0) {
            System.out.println(notes[4] + " x " + count4);
        }
        amount = amount % notes[4];

        int count5 = amount / notes[5];
        if (count5 > 0) {
            System.out.println(notes[5] + " x " + count5);
        }
        amount = amount % notes[5];

        int count6 = amount / notes[6];
        if (count6 > 0) {
            System.out.println(notes[6] + " x " + count6);
        }
        amount = amount % notes[6];

        int count7 = amount / notes[7];
        if (count7 > 0) {
            System.out.println(notes[7] + " x " + count7);
        }
//        amount = amount % notes[7];

    }
}
