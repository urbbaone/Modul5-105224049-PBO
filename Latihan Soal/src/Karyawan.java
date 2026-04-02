public class Karyawan {
    private String idKaryawan;
    private String nama;
    private double gajiPokok;
    protected String departemen;

    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
    }

    public String getIdKaryawan() { return idKaryawan; }
    public void setIdKaryawan(String idKaryawan) { this.idKaryawan = idKaryawan; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getGajiPokok() { return gajiPokok; }
    public void setGajiPokok(double gaji) {
        if (gaji >= 0) {
            this.gajiPokok = gaji;
        } else {
            System.out.println("Peringatan: Gaji tidak boleh negatif!");
        }
    }

    public String getDepartemen() { return departemen; }
    public void setDepartemen(String departemen) { this.departemen = departemen; }

    public void tampilkanDataKaryawan() {
        System.out.println("--- Profil Karyawan ---");
        System.out.println("ID: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gajiPokok);
    }
}