public class Barang {
    // Semua atribut dibuat private biar nggak bisa diotak-atik langsung dari luar
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;
    
    // Khusus kategori pakai protected supaya bisa diakses kelas dalam satu package
    protected String kategori;

    // Konstruktor: ID dan Nama diisi pas barang dibuat, stok & harga mulai dari 0
    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
    }

    // Getter & Setter (Jalur resmi buat akses data private)
    public String getIdBarang() { return idBarang; }
    public String getNamaBarang() { return namaBarang; }

    public int getStok() { return stok; }
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Gagal: Stok tidak boleh negatif!");
        }
    }

    public double getHargaSatuan() { return hargaSatuan; }
    public void setHargaSatuan(double harga) {
        if (harga > 0) {
            this.hargaSatuan = harga;
        } else {
            System.out.println("Gagal: Harga harus lebih dari nol!");
        }
    }

    // Fungsi tambahan buat kelola stok di gudang
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("Stok berhasil ditambah.");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && (this.stok - jumlah) >= 0) {
            this.stok -= jumlah;
            System.out.println("Stok berhasil dikurangi.");
        } else {
            System.out.println("Gagal: Jumlah tidak valid atau stok di gudang tidak cukup!");
        }
    }

    // Fitur buat cetak semua detail barang ke layar
    public void tampilkanDetailBarang() {
        System.out.println("\n=== DETAIL BARANG GUDANG ===");
        System.out.println("ID Barang    : " + idBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Kategori     : " + kategori);
        System.out.println("Stok Saat Ini: " + stok);
        System.out.println("Harga Satuan : Rp" + hargaSatuan);
        System.out.println("============================");
    }
}