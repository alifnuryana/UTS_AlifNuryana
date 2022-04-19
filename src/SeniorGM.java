public class SeniorGM extends GM{
    public Integer insentif;

    public SeniorGM(String nik, String nama, String alamat, Integer gajiPerJam, Integer insentif) {
        super(nik, nama, alamat, gajiPerJam);
        this.insentif = insentif;
    }

    @Override
    public Integer hitungGajiKotor(Integer totalMinggu, Integer gajiPerJam) {
        Integer totalHari = totalMinggu * 5;
        Integer totalJam = totalHari * 8;
        Integer totalGaji = (gajiPerJam + this.insentif ) * totalJam;
        return totalGaji;
    }
}
