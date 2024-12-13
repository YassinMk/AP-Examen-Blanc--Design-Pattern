package org.yassinmk.drawingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yassinmk.drawingapp.model.*;
import org.yassinmk.drawingapp.strategies.DefaultProcessingStrategy;
import org.yassinmk.drawingapp.strategies.DetailedProcessingStrategy;

@SpringBootApplication
public class DrawingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrawingAppApplication.class, args);
        System.out.println("Application started.");

        // Configuration du contexte de sécurité
        SecurityContext securityContext = SecurityContext.getInstance();
        // Authentification avec rôle ADMIN
        securityContext.login("admin_user", new String[]{"ADMIN"});
        System.out.println("User logged in with ADMIN role.");

        Drawing drawing = new Drawing();
        Point point = new Point(10, 20);

        // Création de figures
        Circle circle = new Circle(point, 5, 2, "Rouge", "Bleu");
        Rectangle rectangle = new Rectangle(point, 10, 20, 3, "Vert", "Jaune");

        // Test avec utilisateur autorisé
        try {
            drawing.addFigure(circle);
            drawing.addFigure(rectangle);
            drawing.processDrawing();
            drawing.displayAllFigures();
            System.out.println("Drawing processed with authenticated user.");
        } catch (SecurityException e) {
            System.out.println("Erreur de sécurité : " + e.getMessage());
        }

        // Déconnexion
        securityContext.logout();
        System.out.println("User logged out.");

        // Test sans authentification
        try {
            drawing.processDrawing();
            System.out.println("Drawing processed without authentication.");
        } catch (SecurityException e) {
            System.out.println("Erreur de sécurité : " + e.getMessage());
        }
    }
}
