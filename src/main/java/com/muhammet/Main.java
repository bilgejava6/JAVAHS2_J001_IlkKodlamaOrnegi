package com.muhammet;

/**
 * comment - yorum satırı
 * ---
 * Konuşma dillerinin bir grameri vardır,
 * yazılım dillerinin de bir grameri vardır buna: syntax
 * ---
 *
 */

/**
 * public -> Access Modifier(erişim belirteci)
 * static -> özel bir keyword. sabit adresleme yapar.
 * void -> Return Type, methodlar için geri dönüş türünü belirtir.
 * DİKKAT!!!!
 * bir sınıfın çalıştırılabilmesi içi mutlaka main methodu
 * olmak zorundadır.
 *
 */
// Class
public class Main {
    // Method
    public static void main(String[] args) {
        /**
         * System -> bir java util sınıfıdır. Temel olarak
         * bağdaştırır isek, Bu bilgisayarın sistemi diyebiliriz.
         * out -> çıktıla
         * print -> yazdırmak
         * ln(line) -> tüm satıra yazdır.
         */
        System.out.println("Hello world!");
    } // End Method

    // Method
    public static void selamSoyleArkadaslara(){
        System.out.println("Bugün Java dayız");
    } // End Method2
}// End Class