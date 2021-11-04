package com.company;
public class Ball {
    private String colour = "no colour";
    private double radius = 0;
    private double diameter = 0;
    public Ball(double radius, String colour){
        this.colour = colour;
        this.radius = radius;
        diameter = radius * 2;
    };
    public Ball(){
    };
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void setColor(String colour) {
        this.colour = colour;
    }
    public String getColor(){
        return colour;
    }
    public double getDiameter() {
        return diameter;
    }
    public String BallInfo(){
        return "colour: " + this.getColor() +", diameter: "+this.getDiameter();
    }
}
