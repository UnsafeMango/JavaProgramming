package com.company;

public class Main {

    public static void main(String[] args) {
	// while statement
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count Value is " + count);
//            count++;
//        }
//
////        DO WHILE STATEMENT
//        count = 6;
//        do {
//            System.out.println("Count Value was " + count);
//            count++;
//            if (count > 100) break;
//        } while (count != 6);


//        for (count = 1; count < 6; count++) {
//            System.out.println("Count Value is "  + count);
//        }

//        ANOTHER WAY TO DO TEH WHILE LOOP

//        count =1;
//        while (true) {
//            if (count == 6) break;
//            System.out.println("Count Value is " + count);
//            count++;
//        }


        int  number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println( "Total number of even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;

    }

}
