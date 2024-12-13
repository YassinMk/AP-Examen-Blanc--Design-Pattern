package org.yassinmk.drawingapp.model;

public abstract class Figure {
    protected int borderThickness;
    protected String borderColor;
    protected String fillColor;

    public Figure(int borderThickness, String borderColor, String fillColor) {
        this.borderThickness = borderThickness;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateSurface();
    public abstract void draw();

    // Getters et setters
    public int getBorderThickness() { return borderThickness; }
    public void setBorderThickness(int borderThickness) { this.borderThickness = borderThickness; }
    public String getBorderColor() { return borderColor; }
    public void setBorderColor(String borderColor) { this.borderColor = borderColor; }
    public String getFillColor() { return fillColor; }
    public void setFillColor(String fillColor) { this.fillColor = fillColor; }
}
