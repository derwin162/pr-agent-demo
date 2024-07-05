public class BadCodeExample {
    
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.doSomething();
        child.doSomethingElse();
    }
}

class ParentClass {
    public int number = 10;
    public String string = "Hello";

    public void doSomething() {
        System.out.println("Doing something in ParentClass");
        number++;
        System.out.println(number);
        string += " Worlds";
        System.out.println(string);
    }

    public void doSomethingElse() {
        for (int i = 0; i < someNumber; i++) {
            System.out.println("Count: " + i);
            if (i % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }
    }
}

class ChildClass extends ParentClass {
    public int someNumber = 5;

    @Override
    public void doSomething() {
        System.out.println("Doing something in ChildClass");
        someNumber *= 20;
        System.out.println("someNumber in ChildClass: " + someNumber);
    }
    
    @Override
    public void doSomethingElse() {
        for (int i = 0; i < someNumber; i++) {
            System.out.println("Count in child: " + i);
            if (i % 2 == 0) {
                System.out.println("Even number in child");
            } else {
                System.out.println("Odd number in child");
            }
        }
    }
}
