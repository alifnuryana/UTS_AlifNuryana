public class Direktur extends Karyawan{
    public Integer gajiPerJam;

    public Direktur(String nik, String nama, String alamat, Integer gajiPerJam) {
        super(nik, nama, alamat);
        this.gajiPerJam = gajiPerJam;
    }

    public Integer hitungGajiLembur(Integer totalJam, Integer gajiPerJam) {
        Integer gajiPerJamLembur = gajiPerJam + (gajiPerJam/100 * 50);
        Integer totalGajiLembur = gajiPerJamLembur * totalJam;
        return totalGajiLembur;
    }
}
