import java.util.Scanner;
public class Main {

    static void desen() {
        Scanner input = new Scanner(System.in);
        int sayi, gecici=0, ilkSayi;
        do {
            System.out.print("N sayisi: ");
            sayi = input.nextInt();
            ilkSayi = sayi;
        }
        while(sayi<0);
        System.out.println(sayi);

        while(sayi>0){
            sayi = sayi - 5;
            System.out.println(sayi);
        }

        while(sayi<ilkSayi){
            sayi = sayi + 5;
            System.out.println(sayi);
        }

    }

    public static void main(String[] args) {
        desen();
    }
}