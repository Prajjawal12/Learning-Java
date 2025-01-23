package Miscellanous.StaticKeyword;
//static keyword is used for memory management
//it can be applied to variables, methods, blocks and nested classes
//basic intuition is that, if we use static keyword then it becomes part of the class rather than belonging to the instance of the class
//static method cannot call non static members or non static methods directly
// this and super cannot be used in static context
//static members,methds and block

public  class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(Student.count);
        Student.printMessage();
        System.out.println(Student.checkFee);
        System.out.println(Student.schoolName);
    }
}
