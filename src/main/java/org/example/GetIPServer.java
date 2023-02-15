package org.example;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GetIPServer {
    public static void main(String[] args) {
        try {
            GetIPImpl getIP = new GetIPImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("GetIP", getIP);
            System.out.println("Servidor listo");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
