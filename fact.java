import java.util.Scanner;

class rec {
    public int re_fe(int a) {
        int fact;
        if (a == 0) {

        } else {
            fact = a * re_fe(a - 1);
        }
        return fact;
    }
}

class nor {
    public int nre_fe(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;

        }
        return fact;

    }
}

class fact {
    public static void main(String[] arg) {
        rec obj1 = new rec();
        nor obj2 = new nor();
        System.out.print("For recursive function " + obj1.re_fe(5));
        System.out.print("For nonrecursive function " + obj2.nre_fe(5));
    }
}