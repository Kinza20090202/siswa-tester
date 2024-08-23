package siswa.siswa;

import java.util.Scanner;

//Driver Class
public class siswatester {
    /**
     * @param <Siswa>
     * @param <Int>
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("inputkan nama siswa");
        String nama = input.nextLine();
        System.out.println("masukkan ID siswa");
        int id = input.nextInt();
        System.out.println("masukkan IPK");
        double ipk = input.nextDouble();

        siswa nimas = new siswa(id, nama, ipk);
        nimas.print();
        
        // object
        // Class object = new Construction
        siswa azzam = new siswa(22,"azzam",90);
        siswa bintang = new siswa(25,"bintang",90);
        siswa Melvin = new siswa(21,"Melvin",90);
        siswa Gilam = new siswa(19,"Gilam",90);
        siswa Kinza = new siswa(15,"kinza",90);

        

        System.out.println("ID : " + azzam.id);
        System.out.println("Nama : " + azzam.nama);
        System.out.println("IPK : " + azzam.ipk);
        System.out.println("    ");
        System.out.println("ID : " + bintang.id);
        System.out.println("Nama : " + bintang.nama);
        System.out.println("IPK : " + bintang.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Melvin.id);
        System.out.println("Nama : " + Melvin.nama);
        System.out.println("IPK : " + Melvin.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Gilam.id);
        System.out.println("Nama : " + Gilam.nama);
        System.out.println("IPK : " + Gilam.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Kinza.id);
        System.out.println("Nama : " + Kinza.nama);
        System.out.println("IPK : " + Kinza.ipk);

        input.close();
    }
}
    
    


    

