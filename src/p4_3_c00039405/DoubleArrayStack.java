/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_3_c00039405;

import java.util.Arrays;

/**
 *
 * @author cxb02
 */
public class DoubleArrayStack {

    private final Double[] Array;
    private int position = 0;

    DoubleArrayStack() {                             //default constructor
        this.Array = new Double[5];
    }

    DoubleArrayStack(int s) {
        this.Array = new Double[s];
    }

    private int getPosition() {
        return this.position;
    }

    private void setPosition(int newPos) {
        this.position = newPos;
    }

    public void push(Double val) {
        this.Array[getPosition()] = val;
        setPosition(this.getPosition() + 1);

    }

    public Double pop() {
        int pos = getPosition() - 1;
        Double val = this.Array[pos];
        setPosition(this.getPosition() - 1);
        this.Array[pos] = null;
        return val;
    }

    public int size() {
        return this.getPosition();
    }

    public boolean isEmpty() {
        return this.getPosition() == 0;
    }

    public boolean isFull() {
        return this.getPosition() == this.Array.length;
    }

    @Override
    public String toString() {
        return "Stack: " + Arrays.toString(this.Array);
    }

}
