package ru.geekbrains.hellotests;

public class Division implements Operation {
    @Override
    public int doOperation(int arg1, int arg2) {
        return arg1 / arg2;
    }
}
