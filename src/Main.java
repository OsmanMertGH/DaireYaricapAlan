import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float pi=3.14f;
        double r,alan,cevre,alfa,dilimAlan;

        Scanner input=new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz:");
        r=input.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Dairenin Alanı:" + alan);
        System.out.println("Dairenin Çevresi:" + cevre);

        System.out.print("Merkez Açı Ölçüsü:");
        alfa=input.nextDouble();

        dilimAlan=(pi*(r*r)*alfa)/360;


        System.out.println("Merkez Açı Ölçüsü "+alfa+" Olan Daire Diliminin Alanı: "+dilimAlan);
    }
}