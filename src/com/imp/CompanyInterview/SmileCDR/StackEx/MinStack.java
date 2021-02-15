package com.imp.CompanyInterview.SmileCDR.StackEx;
/*
*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.
*
* Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]
* */

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    /**
     * initialize your data structure here.
     */
    List<Integer> s;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        s = new ArrayList<>();
    }

    public void push(int x) {
        s.add(x);
        if (x < min) min = x;
    }

    public void pop() {
       int removal= s.remove(s.size() - 1);
        if (min == removal) {
            min = Integer.MAX_VALUE;
            for (int m : s) {
                if (m < min) {
                    min = m;
                }
            }
        }
    }

    public int top() {
        return s.get(s.size() - 1);
    }

    public int getMin() {
        return min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

