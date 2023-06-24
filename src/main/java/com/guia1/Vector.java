package com.guia1;

public class Vector {
    private double[] coords;
    
    public Vector(int coordinateCount){
        double[] zeros = new double[coordinateCount]; 
        int i= 0;
        while(i < coordinateCount){
            zeros[i]= 0.0;
            i++;
        }
        this.coords = zeros;
    };

    public Vector(double[] coordinates){
        this.coords = coordinates;
    }

    public double getCoordinate(int index){
        double coord = this.coords[index];
        return coord;
    }

    public double norm(){
        double sum = 0.0;
        for(int i = 0; i < this.coords.length; i++){
            double coord = this.coords[i];
            double coord2 = coord * coord;
            sum += coord2;
        }
        double result = Math.sqrt(sum);
        return result;
    }
    

    public Vector add(Vector aVector){
        double[] addCoords = new double[this.coords.length];
        for(int i = 0; i < this.coords.length; i++){
            double coord = this.coords[i] + aVector.coords[i];
            addCoords[i] = coord;
        }
        Vector aNewVector = new Vector(addCoords);
        return aNewVector;
    }

    public double dotProduct(Vector aVector){
        double sum = 0.0;
        for(int i = 0; i < this.coords.length; i++){
            double coord = this.coords[i] * aVector.getCoordinate(i);
            sum += coord;
        }
        return sum;
    }
}
