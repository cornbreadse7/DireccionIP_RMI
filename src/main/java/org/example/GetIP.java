package org.example;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GetIP extends Remote {
    public String getIP() throws RemoteException;
}
