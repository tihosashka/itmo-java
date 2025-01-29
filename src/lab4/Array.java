package lab4;

import lab2.Colour;
import lab2.MobilePhone;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ints = new int[100];
        ints[0] = 0;
        ints[1] = 1;
        ints[2] = 2;
        ints[3] = 3;
        ints[4] = 4;

        /*System.out.println(Arrays.toString(ints));*/

        String[] strings = new String[5];
//        System.out.println(Arrays.toString(strings));

        long[] longs = new long[]{100L, 110L};
//        System.out.println(Arrays.toString(longs));

        long[] longs2 = {100L, 111L};
//        System.out.println(Arrays.toString(longs2));

        MobilePhone[] mobilephones = new MobilePhone[2];

        mobilephones[0] = new MobilePhone("iphone", "Apple", 125, 567980.0, true, Colour.Grey);
//        System.out.println(Arrays.toString(mobilephones));

//        int [][] arr = new int[2][3];

        int length = longs.length;
        for (int i = 0; i< length; i++){
           if (longs[i]%2==0){
               System.out.println(longs[i]);
           }
        }

//        for (MobilePhone mobilePhone : mobilephones) {
//            if (mobilePhone!= null && mobilePhone.getColour() == Colour.Grey) {
//                System.out.println(mobilePhone);
//            }
//        }

        int x = 0;
//
//        do {
//            System.out.println(x++);
//        } while (x!=10);

//        while (x!=5) {
//            x++;
//
//            if (x<2) {
//                continue;
//            }
//                System.out.println(x);
//
//            if(x==3){
//                break;
//            }
//        }


//        varargMethod("Hello");
//        varargMethod("Hello", "world", "!");

//        Arrays.sort(ints);
//        System.out.println(Arrays.toString(ints));
//
//        int i = Arrays.binarySearch(ints, 2);
//        System.out.println(i);


    }


//        public static void varargMethod(String... line) {
//            for (String s: line) {
//                System.out.println(s);
//            }
//        }




}
