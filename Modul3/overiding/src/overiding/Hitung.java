
package overiding;

public class Hitung {
 public static void main(String[] args) {
   Bangundatar bangundatar=new Bangundatar();
        
        Persegi Persegi = new Persegi();
        Persegi.sisi=8;
        
        Persegipanjang perjang =new Persegipanjang();
        perjang.lebar=11;
        perjang.panjang=2;
        
       bangundatar.luas();
       bangundatar.keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
       
} 
}
