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
    public static int validationThreeChoice(){
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
                return validationThreeChoice();
            }
        }
        return nilaiAngka;
    }
    public static int validationTwoChoice(){
        int nilaiAngka = 0;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        while(!valid){
            try{
                nilaiAngka = input.nextInt();
                if(nilaiAngka > 0 && nilaiAngka <= 2){
                    valid = true; // keluar dari loop jika pilihannya berada pada rentang itu
                }else{
                    System.out.print("Masukkan tidak valid. Harap masukkan angka antara 1 - 2: ");
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
    // validasi double
    public static double validationDouble(){
        double nilaiAngka = 0.0;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        while(!valid){
            try{
                nilaiAngka = input.nextDouble();
                valid = true; // keluar dari loop jika 
            }catch(InputMismatchException e){
                System.out.print("Masukkan tidak valid. Harap masukkan angka :");
                input.nextLine();
                return validationDouble();
            }
        }
        return nilaiAngka;
    }

    public static String validateString() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        String name = null;
        while (!inputValid) {
            inputValid = true;
            name = scanner.nextLine();
            if (name.isBlank()) {
                System.out.print("Tidak boleh kosong. mohon masukan kembali: ");
                inputValid = false;
            }
        }
        return name;
    }
}
