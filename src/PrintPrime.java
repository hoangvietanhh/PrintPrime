import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so: ");
        a = input.nextInt();
        int sum = 0;
        int i =1;
        while (i<a){
            if ( a % i ==0){
                sum += i;

            }
            i++;
        }
//        for (int i = 1;i<a;i++){
//            if ( a % i ==0){
//                sum += i;
//            }
//        }
        if (sum == a){
            System.out.println(a + "là số hoản hảo");
        }else{
            System.out.println("Không phải là số hoàn hảo");
        }

    }
//    public static void main(String[] args) {
//        int number;
//        int count = 0;
//        int n=2;
//        Scanner input = new Scanner(System.in);
//
//        number = input.nextInt();
//
//
//        while (count<number){
//
//        }
//
//        if (number < 2){
//            System.out.println(number + " is not a prime.");
//        } else {
//            int i = 2;
//            boolean check = true;
//            while (i <= Math.sqrt(number)){
//                if (number%i == 0){
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if (check) {
//                System.out.println(number + " is a prime.");
//            } else {
//                System.out.println(number + " is NOT a prime.");
//            }
//        }
//    }
}
