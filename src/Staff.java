public class Staff extends Karyawan{
    public Integer gajiPerJam;

    public Staff(String nik, String nama, String alamat, Integer gajiPerJam) {
        super(nik, nama, alamat);
        this.gajiPerJam = gajiPerJam;
    }

    public Integer hitungGajiLembur(Integer totalJam) {
        Integer gajiPerJamLembur = this.gajiPerJam + (this.gajiPerJam/100 * 30);
        Integer totalGajiLembur = gajiPerJamLembur * totalJam;
        return totalGajiLembur;
    }
}
