package com.guia1;

public class Rectangle {
    private double alt;
    private double base;
    private Point point;

    public Rectangle(double alt,double anch, Point aPoint){
        this.alt = alt;
        this.base = anch; 
        this.point = aPoint;
    }

    public double getArea(){
        return this.base * this.alt;
    }

    public Point getOrigin(){
        return this.point;
    }
    
    public Point getCorner(){
        double x = this.point.getX() + this.base;
        double y = this.point.getY() - this.alt;
        Point pointCorner = new Point(x,y);
        return pointCorner;
    }

    public double getPerimeter(){       
        return this.base * 2 + this.alt * 2;
    }
}
