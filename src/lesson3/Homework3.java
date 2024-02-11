package lesson3;

public class Homework3 {
    public static void main(String[] args) {

     //       Easy: Написать программу рассчитывающую факториал введенного целого числа.
    //       (Если реализовывали на занятии через for например - можно попробовать через while)
//
       long factorial = 10;
        long result = 1;

     for (int i = 1; i <= factorial; i++) {

            result = result * i;

           System.out.println(result);}


//        int factorial = 10;
//        int i = factorial;
//        while (i > 1) {
//            i--;
//            factorial = factorial * i;
//            System.out.println(factorial);
//        }

     //  Medium: Написать программу, определяющую, является ли введенное целое число простым,
        //  т.е. делится без остатка только на 1 и само на себя.

//        int num = 11345;
//        for (int i = 2; i < num; i++) {   // зчем мы здесь пишем i++?  НЕ ПОНИМАЮ:(
//            if (num % i == 0) {
//                System.out.println(num + " не является простым");
//                break;
//            }
//            else {
//                System.out.println( num + " является простым");
//                break;
//            }
//
//
//    }
      //  Имеется число. Посчитать сумму цифр данного числа.
//
//        int num = 58968;
//        int sum =0;
//        while (num > 0) {
//            sum = sum + num % 10;
//            num = num / 10;
//            System.out.println(sum);
//        }

    }
}
