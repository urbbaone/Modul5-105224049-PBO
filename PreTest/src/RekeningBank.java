public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomor, double saldoAwal) {
        this.nomorRekening = nomor;
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
            System.out.println("Saldo berhasil diperbarui.");
        } else {
            System.out.println("Error: Saldo tidak boleh negatif!");
        }
    }
}