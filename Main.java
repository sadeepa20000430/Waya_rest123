/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author u212102
 */
public class Main {
    public static void main(String[] args) {
// Create a new User
User user = new User("john_doe", "john@example.com", 1234567890, "1990-01-01", "pass123");

// Print initial details
System.out.println("Username: " + user.getUsername());
System.out.println("Email: " + user.getEmail());

// Update some info
user.setEmail("newemail@example.com");
user.setPassword("newpass456");

// Print updated info
System.out.println("Updated Email: " + user.getEmail());
System.out.println("Updated Password: " + user.getPassword());
}
}
