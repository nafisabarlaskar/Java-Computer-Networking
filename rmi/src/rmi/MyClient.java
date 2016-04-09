package rmi;

import java.rmi.*;

public class MyClient {
    public static void main(String[] args)
    {
        try
        {
            Adder stub = (Adder)Naming.lookup("rmi://localhost/sonoo");
            System.out.println(stub.add(34,43));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
