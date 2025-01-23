package com.JavaDSA.Previous_Concepts;

public class Oops {
    public static void main(String[] args) {
        int[] studens = new int[5];

    }

    Students student1 = new Students("Avi",1625 , 8.8f);
    Students student2 = new Students();



    class Students{

        String name;
        int roll_no;
        float marks;

        Students(String Name, int roll, float mark){
            this.name = Name;
            this.roll_no = roll;
            this.marks = mark;
        }

        Students(){
          this.name = "XYZ";
          this.roll_no = 0;
          this.marks = 0.0f;
        }
    }


}
