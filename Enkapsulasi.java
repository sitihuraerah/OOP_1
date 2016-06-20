package enkapsulasi;

public class Enkapsulasi {

    public static void main(String[] args) {
       Kapsul pp = new Kapsul(); 
       pp.setPanjang(50); 
       pp.setLebar(100); 
       System.out.println("Panjang  : "+ pp.getPanjang()); 
       System.out.println("Lebar    : "+ pp.getLebar()); 
       System.out.println("Luas     : "+ pp.getLuas());
    }
}
