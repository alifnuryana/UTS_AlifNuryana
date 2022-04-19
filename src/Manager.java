public class Manager extends Karyawan{
    public Integer gajiPerJam;

    public Manager(String nik, String nama, String alamat, Integer gajiPerJam) {
        super(nik, nama, alamat);
        this.gajiPerJam = gajiPerJam;
    }

    public Integer hitungGajiLembur(Integer totalJam, Integer gajiPerJam) {
        Integer gajiPerJamLembur = gajiPerJam + (gajiPerJam/100 * 30);
        Integer totalGajiLembur = gajiPerJamLembur * totalJam;
        return totalGajiLembur;
    }
}
