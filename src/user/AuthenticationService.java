package user;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    private final Map<String, User> users;
    private final Map<String, User> activeSessions;

    public AuthenticationService() {
        this.users = new HashMap<>();
        this.activeSessions = new HashMap<>();
        // Pré-remplissage avec des utilisateurs
        users.put("john", new User("john", "password123"));
        users.put("alice", new User("alice", "alicepass"));
    }

    // Authentification
    public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password) && !user.isLoggedIn()) {
            user.setLoggedIn(true);
            activeSessions.put(username, user);
            System.out.println(username + " logged in successfully.");
            return user;
        } else if (user != null && user.isLoggedIn()) {
            System.out.println("User already logged in: " + username);
        } else {
            System.out.println("Invalid credentials.");
        }
        return null;
    }

    // Déconnexion
    public void logout(User user) {
        if (user != null && user.isLoggedIn()) {
            user.setLoggedIn(false);
            activeSessions.remove(user.getUsername());
            System.out.println(user.getUsername() + " logged out successfully.");
        }
    }

    // Vérifier si un utilisateur est connecté
    public boolean isUserLoggedIn(String username) {
        return activeSessions.containsKey(username);
    }
}
