import java.util.Scanner;

public class Beasiswa {

    public static void main(String[] args) {

        String nama,status,smester,jurusan,kelas,prodi,namaortu;
        int gajiortu,nim;
        double ipk;

        Scanner keyboard = new Scanner(System.in);

        //Tampilkan output ke user
        System.out.println("Data Penerimaan Beasiswa");
        System.out.print("Nama Mahasiswa :");
        nama = keyboard.nextLine();
        //input nim
        System.out.print("Nim :");
        nim = keyboard.nextInt();

        keyboard.nextLine();

        //input jurusan
        System.out.print("Kelas :");
        kelas = keyboard.nextLine();

        System.out.print("Jurusan :");
        jurusan = keyboard.nextLine();

        System.out.print("Program Study :");
        prodi = keyboard.nextLine();

        System.out.print("Smester :");
        smester = keyboard.nextLine();
        //input ipk
        System.out.print("Nilai IPK :");
        ipk = keyboard.nextDouble();
        //input data orang tua
        System.out.print("Gaji Orang tua :");
        gajiortu = keyboard.nextInt();
        
        System.out.print("Nama Orang Tua :");
        namaortu = keyboard.nextLine();

        //menentukan apa yang diterima mahasiswa atau tidak menerima
        if(ipk > 3  && gajiortu < 2000000) {
            status = "penerima";
        } else{
            status = "bukan penerima";
        }
        keyboard.close();

        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("=====Data Penerima Beasiswa=====");
        System.out.println("NIM  : " + nim);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Program Study  : " + prodi);
        System.out.println("Smester  : " + smester);
        System.out.println("Nama Orang Tua  : " + namaortu);
        System.out.println("Status  : " + status);
    }

}