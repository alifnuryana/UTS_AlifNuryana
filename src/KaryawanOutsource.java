public class KaryawanOutsource extends Karyawan{
    public Integer gajiPerJam;
    public String namaMitra;

    public KaryawanOutsource(String nik, String nama, String alamat, Integer gajiPerJam, String namaMitra) {
        super(nik, nama, alamat);
        this.gajiPerJam = gajiPerJam;
        this.namaMitra = namaMitra;
    }

    public Integer totalGajiBersih(Integer totalJam) {
        return this.gajiPerJam * totalJam;
    }
}
