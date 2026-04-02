public class Main {
    public static void main(String[] args) {
        Karyawan k = new Karyawan("EMP-01", "Budi");
        
        k.setDepartemen("Produksi");
        
        // Tes input salah
        System.out.println("Coba input gaji -5000...");
        k.setGajiPokok(-5000);
        
        // Input benar
        k.setGajiPokok(4500000);
        k.tampilkanDataKaryawan();
    }
}