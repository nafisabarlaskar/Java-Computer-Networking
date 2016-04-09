
package ipmachine;

import java.util.*;
import java.net.*;
import java.io.*;

public class IPMAchine {

    public static void main(String[] args) {
        try{
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("IP address of machine is " +address );
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }
}
