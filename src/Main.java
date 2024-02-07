import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double e;
        double x;
        int n;
        Scanner inScan = new Scanner(System.in);
        System.out.println("Введите x, e, n через пробел");
        String s = inScan.nextLine();
        String[] ForParse;
        ForParse = s.split(" ");
        x = Double.parseDouble(ForParse[0]);
        e = Double.parseDouble(ForParse[1]);
        n = Integer.parseInt(ForParse[2]);

        System.out.println("|       SUMN        |            SUMNE        |        SUMNE10         |");
        for (double elem: solutinon(x,e,n)) {
            System.out.printf("     %.8f       ", elem);
        }
        System.out.print("\nВычисление функции e^x с помощью метода класса Math");
        System.out.println("\n"+Math.exp(x));
    }

    public static double[] solutinon(double x, double e, int n) {
        double SumN = 1, SumNE = 1, SumNE10 = 1;
        double an = 1;
        double factorial = 1;
        int i = 1;
        while (i < n || an > e / 10) {
            factorial *= i;
            an = Math.pow(x, i) / factorial;
            if(i < n) SumN = SumN +an;
            if(an > e) SumNE = SumNE+an;
            if(an>e/10) SumNE10 = SumNE10+an;
            i++;
        }
        return new double[]{SumN,SumNE,SumNE10};
    }


}