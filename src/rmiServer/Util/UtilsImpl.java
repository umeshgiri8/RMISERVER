package rmiServer.Util;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UtilsImpl  extends UnicastRemoteObject implements Utils {

    public UtilsImpl() throws RemoteException
    {

    }
    @Override
    public String getCurrentTime() {
            return String.valueOf(System.currentTimeMillis());
    }


}
