public class Variable {
    public static void main(String[] args) {
        //variables and datatypes
        //long, int, byte, short, float, double, char,boolean, --> primitive data types
        //non primitive data types --> String, Classes
        //Declare a variable

       int number;
        //initialize the variable
        number=10;
        number =30;

        System.out.println(number);
        float cgpa=7.5f;
        System.out.println("Cgpa :"+cgpa);
        double weight=75.78;
        System.out.println("Weight :"+weight);
        System.out.println(weight);

        char vowel;
        vowel='a';
        vowel='e';
        System.out.println(vowel);

        int age=15;
        boolean isMajor;
        if(age>18){
            isMajor=true;
        }else{
            isMajor=false;
        }
        System.out.println("Major :"+ isMajor);
    }
}

