package com.guia1;

public class Circle {
    private double radio;
    private Point point;

    public Circle(double radio, Point aPoint){
        this.radio = radio;
        this.point = aPoint;
    }
    public Circle(double radio, double x,  double y){
        this.radio = radio;
        this.point = new Point(x, y);
    }

    public double getArea(){
        double square = this.radio * this.radio;
        double result = square *  Math.PI;
        return result;
    }

    public Point getCenter(){
        return this.point;
    }

    public double getRadius(){
        return this.radio;
    }
    public double getPerimeter(){
        return Math.PI * this.radio * 2;
    }    
}