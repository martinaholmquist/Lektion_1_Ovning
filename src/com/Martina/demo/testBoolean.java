package com.Martina.demo;

public class testBoolean {

        int number;
        String name;
        Boolean True;


        public void setData(int c, String d, Boolean e) {
            number = c;
            name = d;
            True = e;
        }

        public void showData() {
            System.out.println("Antalet = " + number + " " + " och namnet är = " + name + " och svaret på frågan är = "+ True);
            System.out.println();

        }

        public static void main(String[] args) {
            //create array of Array4 object
            testBoolean[] obj = new testBoolean[2];

            //create actual Array4 obj
            obj[0] = new testBoolean();
            obj[1] = new testBoolean();

            //assign data to Array4 objects
            obj[0].setData(100, "Martina", Boolean.TRUE);
            obj[1].setData(200, "Holmqvist", Boolean.FALSE);

            //DISPLAY THE Array4 object data
            System.out.println("Låda 1: ");
            obj[0].showData();
            System.out.println("Låda 2: ");
            obj[1].showData();
        }

    }


