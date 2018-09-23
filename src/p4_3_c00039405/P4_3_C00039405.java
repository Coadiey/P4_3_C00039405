// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 261
// Programming Project: #4
// Due Date : 9/20/18 23:00 CST
// Program Description: Modifying classes that implement stacks and queues
// and making classes that implemenet stacks and queues
// Certificate of Authenticity:
// I certify that the code in the method functions including method function main of this project are entirely my own work.
package p4_3_c00039405;

public class P4_3_C00039405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleArrayStack stack = new DoubleArrayStack();
        while (stack.isFull() == false) {
            stack.push(Math.random());
            System.out.println(stack);
        }
        System.out.println();
        DoubleArrayStack stackOf6 = new DoubleArrayStack(6);
        while (stack.isEmpty() == false) {
            stackOf6.push(stack.pop());
            System.out.println("Stack Of 6 " + stackOf6 + "\n");
            System.out.println(stack + "\n");
        }
        while (stackOf6.isFull() == false) {
            stackOf6.push(Math.random());
            System.out.println("Stack Of 6 " + stackOf6);
        }
        while (stackOf6.isEmpty() == false) {
            stackOf6.pop();
            System.out.println("Stack Of 6 " + stackOf6);
        }

    }

}
