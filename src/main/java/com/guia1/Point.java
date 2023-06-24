package com.guia1;

public class Point {
    private double x;
    private double y;
    
    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }

    public Point add(Point aPoint) {
        double x = this.getX() + aPoint.getX();
        double y = this.getY() + aPoint.getY();
        Point aNewPoint = new Point(x , y);
        return aNewPoint;
    }
}

