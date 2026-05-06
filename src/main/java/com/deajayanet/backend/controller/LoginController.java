// package com.deajayanet.backend.controller;

// import com.deajayanet.backend.service.AuthService;
// import com.deajayanet.view.LoginView;
// import com.deajayanet.backend.model.user.User;

// public class LoginController {
//     private LoginView view;
//     private AuthService authService;

//     public LoginController(LoginView view, AuthService authService) {
//         this.view = view;
//         this.authService = authService;

//         this.view.addLoginListener(e -> login());
//     }

//     private void login() {
//         String username = view.getUsername();
//         String password = view.getPassword();

//         if (username.isEmpty() || password.isEmpty()) {
//             view.showMessage("Username and password cannot be empty.");
//             return;
//         }

//         User user = authService.login(username, password);

//         if (user != null && "ADMIN".equals(user.getRole())) {
//             view.showMessage("Login successful! Welcome Admin.");
//             // Here you can open the admin dashboard
//             view.dispose();
//         } else {
//             view.showMessage("Invalid username or password for Admin.");
//         }
//     }

//     public void showView() {
//         view.setVisible(true);
//     }
// }
