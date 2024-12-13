package org.yassinmk.drawingapp.model;

public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius, int borderThickness, String borderColor, String fillColor) {
        super(borderThickness, borderColor, fillColor);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Dessin d'un cercle : centre=" + center.getX() + "," + center.getY()
                + ", rayon=" + radius
                + ", épaisseur=" + borderThickness
                + ", couleur=" + borderColor);
    }
}