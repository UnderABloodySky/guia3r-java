package com.guia1;

public class Vector3D extends Point {
    private double z;

    public Vector3D(){
        super();
        this.z = 0.0;
    }

    public Vector3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    public double getZ(){
        return this.z;
    }

    public double norm(){
        double x2 = this.getX() * this.getX();
        double y2 = this.getY() * this.getY();
        double z2 = this.getZ() * this.getZ();
        double sum = x2 + y2 + z2;
        double result = Math.sqrt(sum);
        return result;
    }

    public Vector3D add(Vector3D aVector) {
        double x = this.getX() + aVector.getX();
        double y = this.getY() + aVector.getY();
        double z = this.getZ() + aVector.getZ();
        Vector3D aNewVector = new Vector3D(x, y, z);
        return aNewVector;
    }

    public double dotProduct(Vector3D aVector){
        double resultX = this.getX() * aVector.getX();  
        double resultY = this.getY() * aVector.getY();
        double resultZ = this.getZ() * aVector.getZ();
        double result = resultX + resultY + resultZ;
        return result;
    }
}

