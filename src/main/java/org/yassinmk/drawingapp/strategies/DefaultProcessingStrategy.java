package org.yassinmk.drawingapp.strategies;

import org.yassinmk.drawingapp.model.Drawing;
import org.yassinmk.drawingapp.model.ProcessingStrategy;

public class DefaultProcessingStrategy implements ProcessingStrategy {
    @Override
    public void process(Drawing drawing) {
        System.out.println("Traitement par défaut du dessin");
        drawing.displayAllFigures();
    }
}