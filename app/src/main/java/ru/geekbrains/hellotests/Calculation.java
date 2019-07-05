package ru.geekbrains.hellotests;

import java.util.concurrent.ExecutionException;

public class Calculation {
    private int arg1;
    private int arg2;
    private Operation operation;

    public Calculation(Operation operation){
        this.operation = operation;
    }

    public int getArg1() {
        return arg1;
    }

    public Calculation setArg1(int arg1) {
        this.arg1 = arg1;
        return this;
    }

    public int getArg2() {
        return arg2;
    }

    public Calculation setArg2(int arg2) {
        this.arg2 = arg2;
        return this;
    }

    public int calculate() {
        return operation.doOperation(getArg1(), getArg2());
    }

}
