public class Karyawan {
    public String nik;
    public String nama;
    public String alamat;

    public Karyawan(String nik, String nama, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }

    public Integer hitungGajiKotor(Integer totalMinggu, Integer gajiPerJam) {
        Integer totalHari = totalMinggu * 5;
        Integer totalJam = totalHari * 8;
        Integer totalGaji = gajiPerJam * totalJam;
        return totalGaji;
    }

    public Integer hitungGajiBersih(Integer totalGajiKotor, Integer totalGajiLembur) {
        Integer totalGaji = totalGajiKotor + totalGajiLembur;
        totalGaji = totalGaji - (totalGaji/100 * 7);
        return totalGaji;
    }
}
