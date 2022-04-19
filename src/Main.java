public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("0620101052", "Alif Nuryana", "Pasir Impun", 25_000);

        Integer staffGajiKotor = staff.hitungGajiKotor(4, staff.gajiPerJam);
        Integer staffGajiLembur = staff.hitungGajiLembur(10);
        Integer totalGajiBersih = staff.hitungGajiBersih(staffGajiKotor, staffGajiLembur);

        System.out.println(totalGajiBersih);
    }
}
