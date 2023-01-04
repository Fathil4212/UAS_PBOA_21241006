public class Lingkaran {
    Float r;
    Float diameter;

    public Lingkaran(float r, float diameter){
        this.r = r;
        this.diameter = diameter;
    }
    void display() {
        float luas = (float)(Math.PI*r*r);
        float Keliling = (float) (2*3.14*r);
        System.out.println("Keliling lingkaran " + luas);
        System.out.println("Luas lingkran " + Keliling);
    }


    public static void main(String[] args) throws Exception{
        Lingkaran lingkaran = new Lingkaran (20,40);
        System.out.println("Jari-jari : " + lingkaran.r);
        System.out.println("Diameter : " + lingkaran.diameter);
        lingkaran.display();
    } 
}