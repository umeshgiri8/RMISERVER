package rmiServer.Util;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Utils extends Remote {
    public String getCurrentTime() throws RemoteException;
}
