

class Herbivora {
    private String nama;
    private double berat;
    private int umur;

    public Herbivora(String nama, double berat, int umur) {
        this.nama = nama;
        this.berat = berat;
        this.umur = umur;
    }

    public void makan() {
        System.out.println(nama + " sedang makan tumbuhan.");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }

    public void gerak() {
        System.out.println(nama + " sedang bergerak.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Berat : " + berat + " kg");
        System.out.println("Umur : " + umur + " tahun");
    }
}


public class Main {
    public static void main(String[] args) {

        Herbivora Jerapah = new Herbivora("Jerapah", 400.0, 10);
        Jerapah.makan();
        Jerapah.tidur();
        Jerapah.gerak();
        Jerapah.tampilkanInfo();

        Herbivora kuda = new Herbivora("Kuda", 300.0, 20);
        kuda.makan();
        kuda.tidur();
        kuda.gerak();
        kuda.tampilkanInfo();

        Herbivora zebra = new Herbivora("Zebra", 200.0, 6);
        zebra.makan();
        zebra.tidur();
        zebra.gerak();
        zebra.tampilkanInfo();
    }
}
