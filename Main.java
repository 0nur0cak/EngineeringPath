import java.util.Scanner;

public class Main{

     public static void main(String []args){
        int number; // Kullanıcıdan bir sayi isteyeceğimiz için int türünde değişkenimizi tanımladık.
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Giriniz : "); //Kullanıcıdan veri istedik.
        number=scan.nextInt(); // İstediğimiz veriyi değişkenimize atadık.
        
        
        
        int remainder = number % 2; // Sayinin 2'ye bölümünü sağladık.
        // System.out.println(remainder);
        
        boolean isPrime = true;
        
        if(number<2) {
            System.out.println("Geçersiz Sayi !"); // 1 girdiğimizde sayıyı asal göstermemesi için bir kural belirledik.
            return; 
        }
        
        for(int i=2; i<number; i++) {
           if(number %i == 0) {
              isPrime = false;
           }
        }
        
        if(isPrime) {
           System.out.println("Sayi Asaldır");
        }
           else {
              System.out.println("Sayi Asal Değildir");
           }
     }
}