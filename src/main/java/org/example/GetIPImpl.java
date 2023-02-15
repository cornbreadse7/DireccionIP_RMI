package org.example;
import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GetIPImpl extends UnicastRemoteObject implements GetIP {
    public GetIPImpl() throws RemoteException {
        super();
    }

    public String getIP() throws RemoteException {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            return null;
        }
    }
}

