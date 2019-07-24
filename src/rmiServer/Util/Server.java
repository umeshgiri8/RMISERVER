package rmiServer.Util;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {


    public static void main(String[] args) {
        try {
            Utils utils = new UtilsImpl();
            System.out.println("Starting Server on 127.0.0.1 port 1888");
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(1888);
            registry.rebind("utils", utils);
            System.out.println("Started Server on 127.0.0.1 port 1888");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
