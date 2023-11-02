import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        int decimal = input.nextInt();


        String binary = decimalToBinary(decimal);
        System.out.println("Hasil konversi ke biner: " + binary);


        input.close();
    }

    /**
     * method ini digunakan untuk mengconvert nilai decimal ke nilai binnary
     * @param decimal bilangan int yang akan di konvert
     * @return method ini berupa string
     */
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}
