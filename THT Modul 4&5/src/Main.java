public class Main {
    public static void main(String[] args) {
        // Test Kasus 1: Kamar dengan input asal-asalan (Presidential & harga minus)
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 2, -10000);
        
        // Test Kasus 2: Kamar kedua dengan pendaftaran kilat
        KamarHotel kamar2 = new KamarHotel("202", "Suite", 2);
        kamar2.setHargaPerMalam(1000000);

        // Uji coba pesan kamar kedua dengan tamu berlebih (Overcapacity)
        System.out.println("\n--- Simulasi Pemesanan Kamar 2 ---");
        kamar2.pesanKamar(4); // Harusnya gagal
        kamar2.pesanKamar(2); // Harusnya sukses
        kamar2.pesanKamar();  // Harusnya dibilang sudah terisi

        // Uji coba hitung tagihan
        System.out.println("\n--- Simulasi Pembayaran ---");
        
        // Kamar 1: Coba voucher PROMO tapi cuma 2 malam (Harus ditolak diskonnya)
        System.out.println("Kamar 1 (2 malam, kode PROMO):");
        double tagihan1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Bayar: Rp" + tagihan1);

        // Kamar 2: Coba voucher PROMO selama 4 malam (Harus dapet diskon 20%)
        System.out.println("\nKamar 2 (4 malam, kode PROMO):");
        double tagihan2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Bayar: Rp" + tagihan2);

        // Cetak Struk Akhir
        System.out.println("\n=== STRUK INFORMASI AKHIR ===");
        kamar1.tampilkanProfil();
        kamar2.tampilkanProfil();
    }
}   