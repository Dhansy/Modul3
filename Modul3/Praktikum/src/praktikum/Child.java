
package praktikum;

public class Child extends Mother{

    public Child(String name, String gender, String divisi, double gaji, int nomer) {
        super(name, gender, divisi, gaji, nomer);
    }

    @Override
    public void printData(){
        System.out.println(" === identitas pegawai ==== ");
        System.out.println("nama = " + nama);
        System.out.println("Jenis kelamin = " + kelamin);
        System.out.println("Nomor pegawai " + no);
        System.out.println("Bekerja di bagian = " + bagian);
        System.out.println("Gaji utama yang didapat $" + this.gaji);
        System.out.println("Gaji yang didapat jika bekerja secara baik menjadi $" + this.gaji*2);
    }
{
}
}
    

