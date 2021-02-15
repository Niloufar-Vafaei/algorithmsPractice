package com.imp.CompanyInterview.HootSuite;

import java.util.Stack;

public class HootSuite {
    int solutiosn(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        int m = 0;
        while (l < r - m) {
            m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else if (A[m] == X) {
                return m;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }

    //    public int solutivon(String S) {
//        // write your code in Java SE 8
//        Stack<Integer> Stack = new Stack<>();
//        Arrays.stream(S.split(" "))
//                .forEach(c ->
//                        {
//                            switch (c) {
//                                case "POP":
//                                    Stack.pop();
//                                    break;
//                                case "DUP":
//                                    if (Stack.size() < 1) try {
//                                        throw new IllegalAccessException("Stack is empty");
//                                    } catch (IllegalAccessException e) {
//                                        return -1;
//                                    }
//                                    else {
//                                        Stack.push(Stack.peek());
//                                    }
//                                case "+":
//                                    if (Stack.size() < 2) try {
//                                        throw new IllegalAccessException("Stack is empty");
//                                    } catch (IllegalAccessException e) {
//                                        return -1;
//                                    }
//                                    else {
//                                        Stack.push(Stack.pop() + Stack.pop());
//                                    }
//                                    break;
//                                case "-":
//                                    if (Stack.size() < 2) try {
//                                        throw new IllegalAccessException("Stack is empty");
//                                    } catch (IllegalAccessException e) {
//                                        return -1;
//                                    }
//                                    else {
//                                        Stack.push(Stack.pop() - Stack.pop());
//                                    }
//                                    break;
//                                default:
//                                    Stack.push(Integer.valueOf(c));
//                            }
//                        }
//                );
//
//    }
    private int checkRange(int n) {
        if (n < 0 || n > 0xFFFFF)
            throw new IllegalArgumentException("Input is out of range");
        else
            return n;
    }

    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();
        String[] splitS = S.split(" ");
        try{
            for (String c : splitS) {
                if (c.equals("POP")) {
                    stack.pop();
                } else if (c.equals("DUP")) {
                    if (stack.size() < 1) try {
                        throw new IllegalArgumentException("Stack is empty");
                    } catch (IllegalArgumentException e) {
                        return -1;
                    }
                    else {
                        stack.push(checkRange(stack.peek()));
                    }
                } else if (c.equals("+")) {
                    if (stack.size() < 2) try {
                        throw new IllegalArgumentException("Stack is empty");
                    } catch (IllegalArgumentException e) {
                        return -1;
                    }
                    else {
                        stack.push(checkRange(stack.pop() + stack.pop()));
                    }
                } else if (c.equals("-")) {
                    if (stack.size() < 2) try {
                        throw new IllegalArgumentException("Stack is empty");
                    } catch (IllegalArgumentException e) {
                        return -1;
                    }
                    else {
                        stack.push(checkRange(stack.pop() - stack.pop()));
                    }
                } else
                    stack.push(checkRange(Integer.valueOf(c)));
            }
        }catch (IllegalArgumentException e){
            return -1;
        }
        return stack.pop();
    }

}

