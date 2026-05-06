// package com.deajayanet.backend.controller;

// import com.deajayanet.backend.dao.user.UserDao;
// // import com.deajayanet.backend.view.SignUpView;
// import com.deajayanet.backend.model.user.Admin;

// public class SignUpController {
//     private SignUpView view;
//     private UserDao userDao;

//     public SignUpController(SignUpView view, UserDao userDao) {
//         this.view = view;
//         this.userDao = userDao;

//         this.view.addSignUpListener(e -> signUpAdmin());
//     }

//     private void signUpAdmin() {
//         String name = view.getName();
//         String username = view.getUsername();
//         String password = view.getPassword();
//         String email = view.getEmail();
//         String phoneNumber = view.getPhoneNumber();

//         if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
//             view.showMessage("Name, username, and password cannot be empty.");
//             return;
//         }

//         Admin admin = new Admin(name, username, password, email, phoneNumber, 0);
//         if (userDao.createUserAdmin(admin)) {
//             view.showMessage("Admin account created successfully!");
//             view.dispose();
//         } else {
//             view.showMessage("Failed to create admin account. Username might already exist.");
//         }
//     }

//     public void showView() {
//         view.setVisible(true);
//     }
// }
