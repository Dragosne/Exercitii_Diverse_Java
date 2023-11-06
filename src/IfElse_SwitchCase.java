public class IfElse_SwitchCase {
    public static void main(String[] args) {
//        Print "1" daca x este egal cu y,
//        Print "2" daca x e mai mare ca y,
//        Altfel print "3".


        int x = 30;
        int y = 40;
        if (x == y) {
            System.out.println("1");
        }
        else if (x > y) {
            System.out.println("2");
        }
        else {
            System.out.println("3");
        }
        int time = 10;
        String result = (time < 18) ? "Good day." : "Good evening."; // de studiat
        System.out.println(result);

        int day = 1;
        switch (day){
            case 1:
                System.out.println("Sambata");
                break;
            case 2:
                System.out.println("Duminica");
                break;
        }

        System.out.println("printeaza i cat timp i < 6");

        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }
        System.out.println("printeaza a cat timp a < 6 cu do/while");
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }
        while (a < 6);

        for (int f = 0; f < 10; f++) { //sare cifra 4
            if (f == 4) {
                continue;
            }
            else if (f == 6) { //sare cifra 6
                continue;
            }
            System.out.println(f);
        }

    } // inchide psvm
}// inchide clasa
