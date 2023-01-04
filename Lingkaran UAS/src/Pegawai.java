public class Pegawai {
    public String nama;
    public String jabatan;
    public double pajak;
    private double GajiPokok;
    private double GajiBersih;

    public Pegawai(String nama,String jabatan, double pajak) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;

    }

    public void setGajiPokok(double GajiPokok) {
        this.GajiPokok = GajiPokok;

    }

    public double getGajiBersih(){
        return GajiBersih;
    }

    void display() {
        GajiBersih = (GajiPokok*pajak) - GajiPokok;
        System.out.println("nama : " + nama);
        System.out.println("jabatan : " + jabatan);
        System.out.println("GajiBersih : " + GajiBersih);
    
    }

    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Adam","Direktur",0.1);
        pegawai.setGajiPokok(10000000);
        pegawai.display();
    }


    
}
