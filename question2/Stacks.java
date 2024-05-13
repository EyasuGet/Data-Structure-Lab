package question2;

public class Stacks {
    int[] stack;
    int top;
    int size;

    //constructor

    public Stacks(int size) {
        stack = new int[size];
        top=0;
        this.size=size;
    }

    public void push(int value){
        stack[top] = value;
        top++;

    }

    public int pop(){
        int value;
        top--;
        value = stack[top];
        stack[top] = 0;
        return value;
    }

    public int peek(){
        return stack[top-1];

    }
    public boolean isEmpty(){
        return (top<=0);
    }

    public void show(){
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }



}
