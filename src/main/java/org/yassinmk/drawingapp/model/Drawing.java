package org.yassinmk.drawingapp.model;

import org.yassinmk.drawingapp.Annotation.Log;
import org.yassinmk.drawingapp.Annotation.SecuredBy;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Figure> figures = new ArrayList<>();
    private ProcessingStrategy processingStrategy;
    @Log
    @SecuredBy(roles = {"ADMIN", "DESIGNER"})
    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    public void displayAllFigures() {
        figures.forEach(Figure::draw);
    }

    public void setProcessingStrategy(ProcessingStrategy strategy) {
        this.processingStrategy = strategy;
    }
    @Log
    @SecuredBy(roles = {"ADMIN", "DESIGNER"})
    public void processDrawing() {
        if (processingStrategy != null) {
            processingStrategy.process(this);
        }
    }

    public List<Figure> getFigures() {
        return figures;
    }
}
