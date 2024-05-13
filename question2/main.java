package question2;

public class main {
    public static void main(String[] args) {
        Stacks st1 = new Stacks(10);
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.show();
        System.out.println("The number removed is " + st1.pop());
        st1.show();
        st1.peek();
    }


}
