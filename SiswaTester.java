
//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa felix = new Siswa(14, "Felix", 70);

        sabrina.setID(32);
        sabrina.setNama("Shabrina");
        sabrina.setIpk(38.0);
        rasyid.setID(30);
        rasyid.setNama("Rasyid");
        rasyid.setIpk(23.0);
        sabrina.print();
        rasyid.print();
        felix.print();
    }
}