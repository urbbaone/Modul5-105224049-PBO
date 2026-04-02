public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("BRG-99", "Monitor LED");
        barang1.kategori = "Elektronik";

        System.out.println("Tes: Input harga -250000...");
        barang1.setHargaSatuan(-250000);

        barang1.setStok(10); 
        System.out.println("Stok sekarang ada: " + barang1.getStok());
        System.out.println("Tes: Kurangi stok sebanyak 15...");
        barang1.kurangiStok(15);

        barang1.setHargaSatuan(1200000);
        barang1.tambahStok(5);

        barang1.tampilkanDetailBarang();
    }
}