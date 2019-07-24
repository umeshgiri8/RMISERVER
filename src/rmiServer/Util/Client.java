package rmiServer.Util;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Fetching RMI from 127.0.0.1 port 1888");
            Utils utils = (Utils) Naming.lookup("rmi://127.0.0.1:1888/utils");
            System.out.println("Success Fetching RMI from 127.0.0.1 port 1888");
            System.out.println(utils.getCurrentTime());
        }catch (Exception e)
        {
            System.out.println("Failure Fetching RMI from 127.0.0.1 port 1888");
            e.printStackTrace();
        }
    }
}
