public class Main {

    public static void main(String[] args) {
	/*Return functionlarda istediğimiz kadar input girebilmek için variable
	* argumentleri kullanırız*/


        System.out.println(topla(1,2,1400,50));
    }

    /*Variable argumentlerin kullanımı aşağıdaki gibidir.*/
    public static int topla(int... sayilar){
        int toplam=0;
        for (int sayi : sayilar){
            toplam=toplam+sayi;
        }
        return toplam;
    }
}
