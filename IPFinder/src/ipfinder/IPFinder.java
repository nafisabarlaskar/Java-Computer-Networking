

package ipfinder;

import java.util.*;
import java.io.*;
import java.net.*;

public class IPFinder {

 
    public static void main(String[] args) {
            
        InetAddress address;
        String host;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter the name of the host");
            host = input.next();
            address = InetAddress.getByName(host);
            System.out.println("IP AAddress of host is " +address.toString() );
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
