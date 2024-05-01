import java.util.*;

public class Validation {
    //validasi angka
    public static int validationInteger(){
        int nilaiAngka = 0;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        while(!valid){
            try{
                nilaiAngka = input.nextInt();
                valid = true; // keluar dari loop jika 
            }catch(InputMismatchException e){
                System.out.print("Masukkan tidak valid. Harap masukkan angka :");
                input.nextLine();
                return validationInteger();
            }
        }
        return nilaiAngka;
    }
    //validasi range 2 angka
    public static int validationTwoChoice(){
        int nilaiAngka = 0;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        while(!valid){
            try{
                nilaiAngka = input.nextInt();
                if(nilaiAngka >= 0 && nilaiAngka <= 2){
                    valid = true; // keluar dari loop jika pilihannya berada pada rentang itu
                }else{
                    System.out.print("Masukkan tidak valid. Harap masukkan angka antara 0 - 2: ");
                }
            }catch(InputMismatchException e){
                System.out.print("Masukkan tidak valid. Harap masukkan angka : ");
                input.nextLine();
                return validationTwoChoice();
            }
        }
        return nilaiAngka;
    }

    // validasi 4 pilihan 
    public static int validationFourChoice(){
        int nilaiAngka = 0;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        while(!valid){
            try{
                nilaiAngka = input.nextInt();
                if(nilaiAngka >= 0 && nilaiAngka <= 3){
                    valid = true; // keluar dari loop jika pilihannya berada pada rentang itu
                }else{
                    System.out.print("Masukkan tidak valid. Harap masukkan angka antara 0 - 3: ");
                }
            }catch(InputMismatchException e){
                System.out.print("Masukkan tidak valid. Harap masukkan angka : ");
                input.nextLine();
                return validationFourChoice();
            }
        }
        return nilaiAngka;
    }

        public static String validasiID() {
        Scanner input = new Scanner(System.in);
        boolean inputValid = false;
        String id = null;
        while (!inputValid) {
            inputValid = true;
            id = input.nextLine();
            if (id.isBlank()) {
                System.out.println("    ID tidak boleh kosong");
                inputValid = false;
            }
            if (id.length() > 9) {
                System.out.println("    Maksimal panjang ID adalah 9 huruf.");
                inputValid = false;
            }
            if (id.contains(" ")) {
                System.out.println("    ID tidak boleh berisi whitespace.");
                inputValid = false;
            }

            if (!inputValid) {
                System.out.println("    Mohon masukkan ID yang benar.");
                System.out.print("    ID:");
            } else {
                id = id.toUpperCase();
            }
        }
        return id;
    }
}
