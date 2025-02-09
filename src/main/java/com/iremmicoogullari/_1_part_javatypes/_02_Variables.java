package com.iremmicoogullari._1_part_javatypes;

public class _02_Variables {

    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken:
        /*

            2-) _ veya $ ile başlayabilirsiniz.
            3-) sayı ile bitebilir.
            4-) sayı ile başlayamaz.
            5-) _ veya $ dışında özel simgelerle başlanmaz.
            6-) değişken isimleri camelCase kuralına göre yazılır.
        */
       // veri isimlendirmeleri;
       //   1-) isim, sıfat veya zamir kullanmamız lazım.
       //   Anlamlı ve açıklayıcı isimler seçilmeli.
        int studentCounter = 18;
        double hamBurgerxD = 355.6;
        int schoolNumber = 762;
        System.out.println(schoolNumber);

        int _schoolNumber = 507;
        System.out.println(_schoolNumber);

        int $schoolNumber = 507;
        System.out.println($schoolNumber);

        int schoolNumber33 = 33;
        System.out.println(schoolNumber33);

        // yazılamaz
        // int schoolNumber = 762; // same variable name is not written!
        // int 44schooulNumber = 762; // sayıyla başlanılamaz
        // int ``schoolNumber = 762; // underscore ve ampersand dışındaki özel simgelerle başlanamaz.!

        //değişmeyen değerler için örn: pi sayısı. Başına final gelir ve sonrasında tekrar o değişken ismi tanımlanamaz.
        final int MAX_STUDENT = 555;
        // MAX_STUDENT = 200; Tekrar tanımlanamaz. cannot assign a value to final variable MAX_STUDENT. HATASI ALINIR.
    }
}
