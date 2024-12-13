package org.yassinmk.drawingapp;

import java.util.HashSet;
import java.util.Set;

public class SecurityContext {
    private static SecurityContext instance;
    private String currentUser;
    private Set<String> currentUserRoles;

    private SecurityContext() {
        currentUserRoles = new HashSet<>();
    }

    public static synchronized SecurityContext getInstance() {
        if (instance == null) {
            instance = new SecurityContext();
        }
        return instance;
    }

    public void login(String username, String[] roles) {
        this.currentUser = username;
        this.currentUserRoles = new HashSet<>(Set.of(roles));
    }

    public void logout() {
        this.currentUser = null;
        this.currentUserRoles.clear();
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public boolean hasRole(String role) {
        return currentUserRoles.contains(role);
    }

    public boolean isAuthenticated() {
        return currentUser != null;
    }
}