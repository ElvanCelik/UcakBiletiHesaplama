import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yas,mesafe,tarife;
        double normalTutar,indirim,yeniTutar,toplamTutar,a;
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi km cinsinden giriniz : ");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Gidiş Dönüş , 2 => Tek Yön ) : ");
        tarife=input.nextInt();
        if(yas < 0 || mesafe < 0){
            System.out.print("Yanlış değer girişi yaptınız!");
            System.exit(0);}

        normalTutar=mesafe*0.10;
        System.out.println("Biletin tutarı:"+normalTutar);

        switch (tarife) {
            case 1:
                if (yas < 12) {
                    indirim = normalTutar * 0.5;
                    yeniTutar=normalTutar-indirim;
                    a=yeniTutar*0.20;
                    toplamTutar=yeniTutar-a;
                    System.out.print("İndirimli toplam tutar: "+toplamTutar);
                } else if (yas >= 12 && yas < 24) {
                    indirim = normalTutar * 0.1;
                    yeniTutar = normalTutar - indirim;
                    a = yeniTutar * 0.20;
                    toplamTutar = yeniTutar - a;
                    System.out.print("İndirimli toplam tutar: " + toplamTutar);

                }
                else if (yas >= 24 && yas < 65) {
                    indirim = normalTutar * 0.2;
                    yeniTutar = normalTutar - indirim;
                    System.out.print("İndirimli toplam tutar: " + yeniTutar);

                }else if (yas>65) {
                    indirim = normalTutar * 0.3;
                    yeniTutar = normalTutar - indirim;
                    a = yeniTutar * 0.20;
                    toplamTutar = yeniTutar - a;
                    System.out.print("İndirimli toplam tutar: " + toplamTutar);
                }
                break;
            case 2:
                if (yas < 12) {
                indirim = normalTutar * 0.5;
                yeniTutar=normalTutar-indirim;
                System.out.print("Toplam tutar: "+yeniTutar);
            } else if (yas >= 12 && yas < 24) {
                indirim = normalTutar * 0.1;
                yeniTutar = normalTutar - indirim;
                System.out.print("Toplam tutar: " + yeniTutar);
            }  else if (yas >= 24 && yas < 65) {
                    System.out.print("Toplam tutar: " + normalTutar);
             }else if (yas>65) {
                indirim = normalTutar * 0.3;
                yeniTutar = normalTutar - indirim;
                System.out.print("Toplam tutar: " + yeniTutar);
            }
                break;
            default:
                System.out.println("Yanlış saçim yaptınız. Tekrar deneyiniz!");

        }



    }
}