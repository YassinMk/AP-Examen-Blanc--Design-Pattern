package org.yassinmk.drawingapp.strategies;

import org.yassinmk.drawingapp.model.Drawing;
import org.yassinmk.drawingapp.model.Figure;
import org.yassinmk.drawingapp.model.ProcessingStrategy;

public class DetailedProcessingStrategy implements ProcessingStrategy {
    @Override
    public void process(Drawing drawing) {
        System.out.println("Traitement détaillé du dessin");
        System.out.println("Nombre total de figures : " + drawing.getFigures().size());
        System.out.println("Surface totale : " +
                drawing.getFigures().stream()
                        .mapToDouble(Figure::calculateSurface)
                        .sum());
        drawing.displayAllFigures();
    }
}