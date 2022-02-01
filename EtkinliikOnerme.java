import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat<5){
            System.out.println("Kayak Yapabilirsin");
        }
        else if (heat >= 5 && heat <=25) {
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsin");
            }
            if (heat>=10){
                System.out.println("Pikniğe gidebilirsin");
            }
        }
        else{
            System.out.println("Yüzmeye Gidebilirsin");
        }

    }
}
