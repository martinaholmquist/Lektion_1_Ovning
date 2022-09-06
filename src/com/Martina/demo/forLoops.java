package com.Martina.demo;

public class forLoops {
    public static void main(String[] args) {
        // om variabeln i är mindre än 5.. Plussa i med +1 och kör kodstycket. reultat: 0,1,2,3,4
        // i++ = i =i+1
        //0 = 0 + 1
        //0 = 1 + 1
        //0 = 2 + 1
        //0 = 3 + 1

        for (int i = 0; i < 5; i++){
            System.out.println(i);

            if (i== 4){  //när i är 4 så printar det ny vad i är dvs 4
                System.out.println("inside ifcase: " + i);
            }
        }


    }
}
