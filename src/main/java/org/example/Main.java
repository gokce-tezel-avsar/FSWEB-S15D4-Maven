package org.example;
public class Main {
    public static void main(String[] args) {
    }

    public static boolean checkForPalindrome(String cumle) {
        char[] harfler = cumle.toCharArray();
        for (int i = 0; i < harfler.length / 2; i++) {
            if (harfler[i] != harfler[harfler.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    public static String convertDecimalToBinary(int sayi) {
        if(sayi == 0){
            return "0";
        }
        StringBuilder binary = new StringBuilder();

        // sayi / 2 den kalanı yaz ve bu şekilde devam et.
        // 6/2=3 kalan =0   binarySayi= 0
        //bölümü tekrar 2ye böl kalanı sıranın başına ekle 3/2=1 kalan=1 binarySayi = 10
        //1/2 = 0 kalan=1  binarySayi = 110;

        while(sayi>0){
            int kalan = sayi % 2;
            binary.insert(0, kalan);
            sayi = sayi/2;
        }
        return binary.toString();
    }

}