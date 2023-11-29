/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi - Reg. Pagi
 * NIM      : 22166030
 */
class Character {
    void info() {
        System.out.println("Ini adalah karakter dalam serial Detective Conan.");
    }
}

// Subclass Detective
class Detective extends Character {
    void info() {
        System.out.println("Ini adalah seorang detektif dalam serial Detective Conan.");
    }
}

// Subclass Culprit
class Culprit extends Character {
    void info() {
        System.out.println("Ini adalah seorang pelaku kejahatan dalam serial Detective Conan.");
    }
}

// Karakter spesifik dari Detective Conan
class Conan extends Detective {
    void info() {
        System.out.println("Conan adalah detektif cilik yang pintar dalam serial ini.");
    }
}

class Ran extends Detective {
    void info() {
        System.out.println("Ran adalah teman baik Conan yang pintar.");
    }
}

class BlackOrganization extends Culprit {
    void info() {
        System.out.println("Black Organization merupakan organisasi kriminal dalam cerita ini.");
    }
}

class KaitoKid extends Culprit {
    void info() {
        System.out.println("Kaito Kid adalah penjahat yang mahir dalam mencuri.");
    }
}

// Main class untuk menjalankan program
public class PBOLat60 {
    public static void main(String[] args) {
        Character conan = new Conan();
        Character ran = new Ran();
        Character blackOrg = new BlackOrganization();
        Character kaitoKid = new KaitoKid();

        conan.info();
        ran.info();
        blackOrg.info();
        kaitoKid.info();
    }
}
