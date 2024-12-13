package org.yassinmk.drawingapp.model;

import java.util.ArrayList;
import java.util.List;

public class FigureGroup extends Figure {
    private List<Figure> figures = new ArrayList<>();

    public FigureGroup(int borderThickness, String borderColor, String fillColor) {
        super(borderThickness, borderColor, fillColor);
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public double calculatePerimeter() {
        return figures.stream()
                .mapToDouble(Figure::calculatePerimeter)
                .sum();
    }

    @Override
    public double calculateSurface() {
        return figures.stream()
                .mapToDouble(Figure::calculateSurface)
                .sum();
    }

    @Override
    public void draw() {
        System.out.println("Dessin d'un groupe de " + figures.size() + " figures");
        figures.forEach(Figure::draw);
    }
}
