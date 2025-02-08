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
    }
}
