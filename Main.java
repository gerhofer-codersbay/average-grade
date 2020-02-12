import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] noten = new int[0];
        double summe = 0;

        while (!scanner.hasNext("q") && !scanner.hasNext("Q")) {
            int newGrade = scanner.nextInt();
            int[] biggerArray = new int[noten.length + 1];
            for (int i = 0; i < noten.length; i++) {
                biggerArray[i] = noten[i];
            }
            biggerArray[noten.length] = newGrade;
            noten = biggerArray;
            summe += newGrade;
        }
        System.out.println("you entered q or Q");
        System.out.println("Notendurchschnitt ist " + summe / noten.length);
    }
}
