// variable in java example1
//identifier it is anamein java program
//Tt can be a class name, mthord name and variable name , label name

//Rules for writing an identifier 
//...............Rules.....................
//Rule1 :The only allowed characters in java identifiers are
// a to z , A to Z , 0 to 9  , _(underscore),$
//Rule2 :  if we use any other character we will get error
//int *8e8 = 10 ; (invalid) we use ( $ , _ )only
//int total = 10; (valid)
//int Total# = 4; (invalidwe use ( $ , _ )only
//int asmap1 = 100; (valid)
//Rule 3  int 1amap = 33(intvalid) it will not allowed to start with number
//Rule 5  int number = 8; (valid) , int Number = 3 ; it is treated as case sensitive
//Rule6 int oneNumber= 3 ; (valid) it follow camel case if you attach two differt word
//Rule7 we cant use reserve word for identifier
// int if = 3939; (invalid) it foll unser rule7
//Rule 8: Predefined class names can be use as identifier
//eg : --String ----------->inbuilt chass name
//eg2 : --Runnable----------->inbuit interfacename
//for example   int String = 03;
//              System.out.print(String); ---------output is 03 you will get

// Note 1 if you use reserve word(if , else , for , while foreach etc..) for identifer you will get error but in case of predefined class and interface your will not get an error.

class Student {
    // has a part
    int rollNo;
    String studentName;

}

class Car {
    // has a part
    int aWheel;
    String bransName;

}

public class Demovar {
    public static void main(String[] args) {

    }
}
