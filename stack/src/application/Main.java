package application;

import demoStack.DemoStack;

public class Main {

    public static void main(String[] args) {
        DemoStack stack = new DemoStack();
        stack.pushElement(1);
        stack.pushElement(2);
        stack.pushElement(3);
        System.out.println(stack.popElement());
        stack.pushElement(5);
        System.out.println(stack.popElement());
        System.out.println(stack.popElement());
        System.out.println(stack.popElement());
    }
}
