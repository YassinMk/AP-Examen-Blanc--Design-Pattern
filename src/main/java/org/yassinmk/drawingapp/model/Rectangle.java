package org.yassinmk.drawingapp.model;

public class Rectangle extends Figure {
    private Point topLeftCorner;
    private double width;
    private double height;

    public Rectangle(Point topLeftCorner, double width, double height,
                     int borderThickness, String borderColor, String fillColor) {
        super(borderThickness, borderColor, fillColor);
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateSurface() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Dessin d'un rectangle : coin=" + topLeftCorner.getX() + "," + topLeftCorner.getY()
                + ", largeur=" + width
                + ", hauteur=" + height
                + ", épaisseur=" + borderThickness
                + ", couleur=" + borderColor);
    }
}

