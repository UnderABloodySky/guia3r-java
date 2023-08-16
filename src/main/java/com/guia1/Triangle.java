package com.guia1;

public class Triangle  implements Shape{
    private double alt;
    private double base;
    private double ladoA;
    private double ladoB;
    private Point[] vertices = new Point[3];
    
    //Complementación
    public Triangle(double alt, double aBase, double ladoA, double ladoB, Point[] vertices){
        this.alt = alt;
        this.base = aBase; 
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.vertices = vertices;
    }

    public double getArea(){
        return this.base * this.alt / 2;
    }
    
    public Point[] getVertices(){
        return this.vertices;
    }

    public Point getVertex(int index){
        return this.vertices[index]; 
    }
    public double getPerimeter(){
        return this.base + this.ladoA + this.ladoB;
    }
}
