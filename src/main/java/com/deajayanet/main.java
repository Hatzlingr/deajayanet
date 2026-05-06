package com.deajayanet;

import javax.swing.SwingUtilities;
// import com.deajayanet.backend.controller.LoginController;
// import com.deajayanet.backend.controller.SignUpController;
import com.deajayanet.backend.config.DatabaseConnection;
import com.deajayanet.backend.dao.user.UserDao;
import com.deajayanet.backend.service.AuthService;
// import com.deajayanet.view.LoginView;
// import com.deajayanet.view.MainView;
// import com.deajayanet.view.SignUpView;

public class main { 
    public static void main(String[] args) {

        // PENTING: Eksekusi pembuatan tabel SATU KALI saja di awal program
        DatabaseConnection.createNewTable();

        // SwingUtilities.invokeLater(() -> {
        //     MainView mainView = new MainView();
        //     UserDao userDao = new UserDao();
        //     AuthService authService = new AuthService(userDao);

        //     mainView.addLoginListener(e -> {
        //         LoginView loginView = new LoginView();
        //         new LoginController(loginView, authService).showView();
        //         mainView.dispose();
        //     });

        //     mainView.addSignUpListener(e -> {
        //         SignUpView signUpView = new SignUpView();
        //         new SignUpController(signUpView, userDao).showView();
        //         mainView.dispose();
        //     });

        //     mainView.setVisible(true);
        // });

    }
}