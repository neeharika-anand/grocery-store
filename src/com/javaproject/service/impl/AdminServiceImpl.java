package com.javaproject.service.impl;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.Model.User;
import com.javaproject.service.UserService;

public class AdminServiceImpl implements UserService {

    @Override
    public void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        if (password.equals("admin") && userName.equals("admin@gmail.com")) {
            // Valid admin login
            HttpSession session = request.getSession();
            session.setAttribute("username", userName);
            session.setAttribute("password", password);
            session.setAttribute("usertype", "admin");

            RequestDispatcher rd = request.getRequestDispatcher("adminViewProduct.jsp");
            rd.forward(request, response);
        } else {
            // Invalid admin login
            String status = "Login Denied! Invalid Username or password.";
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp?message=" + status);
            rd.include(request, response);
        }
    }
    // Implementing the getUserAddr method to resolve the error
    // Implementing the methods from UserService interface

    @Override
    public String registerUser(String userName, Long mobileNo, String emailId, String address, int pinCode,
                               String password) {
        // Add your implementation here
        return null; // Placeholder return value
    }

    @Override
    public String registerUser(User user) {
        // Add your implementation here
        return null; // Placeholder return value
    }

    @Override
    public boolean isRegistered(String emailId) {
        // Add your implementation here
        return false; // Placeholder return value
    }

    @Override
    public String isValidCredential(String emailId, String password) {
        // Add your implementation here
        return null; // Placeholder return value
    }

    @Override
    public User getUserDetails(String emailId, String password) {
        // Add your implementation here
        return null; // Placeholder return value
    }

    @Override
    public String getFName(String emailId) {
        // Add your implementation here
        return null; // Placeholder return value
    }
    @Override
    public String getUserAddr(String userId) {
        // Add your implementation here
        return null; // Placeholder return value
    }
}

