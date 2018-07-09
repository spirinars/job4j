package ru.job4j.calculator;

/**
 *Class Calculator Решение задачи части [185]
 *@author Spirinars
 *since 09.07.2018
 */
public class Calculator {
    private double result;
    /**
     * Method add.
     * @param first double.
     * @param second double.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method subtract.
     * @param first double.
     * @param second double.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Method div.
     * @param first double.
     * @param second double.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Method multiple.
     * @param first double.
     * @param second double.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Method getResult.
     * @return this.result.
     */
    public double getResult() {
        return this.result;
    }
}
