package org.example;
import java.rmi.Naming;

public class GetIPClient {
    public static void main(String[] args) {
        try {
            GetIP getIP = (GetIP) Naming.lookup("rmi://localhost/GetIP");
            System.out.println("La dirección IP es: " + getIP.getIP());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
