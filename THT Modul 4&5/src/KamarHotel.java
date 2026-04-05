public class KamarHotel {
    // Atribut dibuat private biar gak bisa diakses sembarangan dari luar (Encapsulation)
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    // Constructor 1: Buat yang mau daftar cepet (Pendaftaran Kilat)
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); // Panggil setter biar validasi tipe tetep jalan
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    // Constructor 2: Pendaftaran yang datanya lengkap
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam); // Panggil setter biar validasi harga tetep jalan
        this.isTersedia = true;
    }

    // Getter untuk semua atribut
    public String getNomorKamar() { return nomorKamar; }
    public String getTipeKamar() { return tipeKamar; }
    public int getKapasitasMaksimal() { return kapasitasMaksimal; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public boolean isTersedia() { return isTersedia; }

    // Setter untuk Tipe Kamar dengan validasi "Reguler", "Premium", atau "Suite"
    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") || 
            tipeKamar.equalsIgnoreCase("Premium") || 
            tipeKamar.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("Peringatan: Tipe tidak dikenal, otomatis diatur ke Reguler.");
            this.tipeKamar = "Reguler";
        }
    }

    // Setter untuk Harga dengan batas minimal 50.000
    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println("Peringatan: Harga terlalu rendah, otomatis diatur ke 50000.");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    // Method Overloading 1: Pesan kamar tanpa parameter
    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("Peringatan: Kamar sudah terisi!");
        }
    }

    // Method Overloading 2: Pesan kamar dengan jumlah tamu
    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("Peringatan: Kamar sudah terisi!");
        } else if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("Gagal: Kapasitas tidak cukup untuk " + jumlahTamu + " orang!");
        } else {
            isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan untuk " + jumlahTamu + " orang.");
        }
    }

    public void batalPesan() {
        isTersedia = true;
        System.out.println("Pesanan kamar " + nomorKamar + " telah dibatalkan.");
    }

    // Method Overloading 3: Hitung bayar standar
    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    // Method Overloading 4: Hitung bayar pakai voucher "PROMO"
    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hitungTotalBayar(jumlahMalam);
        if (kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3) {
            return total * 0.8; // Diskon 20%
        } else {
            System.out.println("Voucher ditolak: Kode salah atau durasi inap kurang dari 3 malam.");
            return total;
        }
    }

    // Cetak profil kamar biar rapi
    public void tampilkanProfil() {
        System.out.println("--- INFORMASI KAMAR ---");
        System.out.println("Nomor     : " + nomorKamar);
        System.out.println("Tipe      : " + tipeKamar);
        System.out.println("Kapasitas : " + kapasitasMaksimal + " orang");
        System.out.println("Harga     : Rp" + hargaPerMalam);
        System.out.println("Tersedia  : " + (isTersedia ? "Ya" : "Tidak"));
        System.out.println("-----------------------");
    }
}

