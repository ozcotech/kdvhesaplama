import java.util.Scanner;

public class kdvHesaplama{

  public static void main(String[] args){

    System.out.println("Bir Para Birimi Giriniz: ");

    Scanner para = new Scanner(System.in);

    double tutar = para.nextDouble();

    double oran1 = 1.18;

    double oran2 = 1.08;

    double sonuc1 = (tutar * oran1);

    double sonuc2 = (tutar * oran2);

    boolean bir = (tutar < 1000.0 && tutar > 0);

    double durum = bir ? sonuc1 : sonuc2;

    System.out.println ("KDV'li Tutar: " + durum + " TL");

    para.close();


  }

}