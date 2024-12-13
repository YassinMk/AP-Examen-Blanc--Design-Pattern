# Rapport de Projet : Examen Design Pattern et Programmation Orientée Aspect

## Introduction
L'objectif de ce projet est de concevoir et d'implémenter une application permettant de gérer des conteneurs d'agents. Chaque agent gère un ensemble de transactions, et le système exploite des **design patterns** pour répondre aux exigences fonctionnelles et structurelles. Ce rapport présente les étapes clés de réalisation, les choix techniques, et les résultats obtenus.

---

## Partie 1 : Diagramme de Classe

### Description
Un diagramme UML a été élaboré pour représenter la structure statique du modèle. Les **design patterns** suivants ont été intégrés :
- **Builder** : Pour créer des transactions de manière flexible et extensible.
- **Observer** : Permet aux agents de s'abonner et de recevoir des notifications en cas d'ajout de transactions.
- **Strategy** : Fournit des stratégies interchangeables pour traiter les notifications.

![image](https://github.com/user-attachments/assets/000b15be-e69c-4275-a8d3-58a4441f6642)
---
-structure de projet :
drawing-app/
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── ma
    │           └── enset
    │               └── drawingapp
    │                   ├── model
    │                   │   ├── Point.java
    │                   │   ├── Figure.java
    │                   │   ├── Circle.java
    │                   │   ├── Rectangle.java
    │                   │   ├── FigureGroup.java
    │                   │   ├── DrawingParameterManager.java
    │                   │   ├── DrawingProcessor.java
    │                   │   └── ProcessingStrategy.java
    │                   └── strategies
    │                       ├── DefaultProcessingStrategy.java
    │                       └── DetailedProcessingStrategy.java
    └── test
        └── java
            └── ma
                └── enset
                    └── drawingapp
                        └── DrawingAppTest.java
## Partie 2 : Implémentation et Tests

### 2.1 Classe `Transaction`
- **Rôle** : Représente une transaction avec ses attributs (id, date, montant, type).
- **Tests** : Vérification des getters, setters et calculs liés.

### 2.2 Classe `Agent`
- **Rôle** : Gère les transactions et agit en tant qu'observateur. Implémente des stratégies comme :
  - `ScoringStrategy` : Calcule le solde d’un agent.
  - `HistoryStrategy` : Garde un historique des notifications.
- **Tests** : Validation des notifications et des stratégies dynamiques.

### 2.3 Classe `Container`
- **Rôle** : Gestion centralisée des agents dans une structure **HashMap**.
- **Design Pattern** : Singleton pour garantir une seule instance.
- **Tests** : Ajout, suppression et recherche d’agents.

---

## Partie 3 : Patterns Supplémentaires

### 3.1 Adapter
Permet d'utiliser des afficheurs non compatibles HDMI avec l’interface standard.

### 3.2 Décorateur
Ajoute dynamiquement des fonctionnalités supplémentaires aux agents, comme le suivi des statistiques.

---

## Partie 4 : Aspects Techniques

### 4.1 Journalisation
- **Annotation** : `@Log`.
- **Fonctionnalité** : Mesure la durée d'exécution des méthodes annotées.

### 4.2 Cache
- **Annotation** : `@Cachable`.
- **Fonctionnalité** : Implémentation d’un cache pour accélérer le calcul des transactions les plus élevées.

### 4.3 Sécurité
- **Annotation** : `@SecuredBy(roles={"role1", "role2"})`.
- **Fonctionnalité** : Restreint l’accès aux ressources selon les rôles.

---

## Résultats et Observations
- L’application répond aux exigences initiales.
- L’utilisation des **design patterns** facilite l’extensibilité et la maintenabilité.
- Les aspects implémentés enrichissent la fiabilité et la performance du système.
![image](https://github.com/user-attachments/assets/1dcbb69b-989d-425d-b010-0f4ea6485f88)
![image](https://github.com/user-attachments/assets/56b3fdd4-e721-428d-aaa8-6fbc88436ec0)




---

## Conclusion
Ce projet démontre la puissance des **design patterns** combinée à la **programmation orientée aspect** pour concevoir des systèmes modulaires, performants et évolutifs. De futures améliorations pourraient inclure d'autres stratégies ou des intégrations supplémentaires.

*(Ajouter ton code source et fichiers nécessaires en annexe.)*
