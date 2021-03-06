package ru.job4j.condition;

/**
 *Class Point 3.4. Расстояние между точками в системе координат [#188]
 *@author Spirinars mailto:spirinars@ya.ru
 *since 10.07.2018
 */
public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
    public static void main(String[] args) {
        Point a = new Point(0, 2);
        Point b = new Point(2, 0);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}