
package getipaddress;

import java.net.*;
import java.util.*;

public class GetIPAddress {

    
    public static void main(String[] args) {
       String host;
       Scanner input = new Scanner(System.in);
       InetAddress inetAddress;
       System.out.println("\nEnter the host name \n");
       host = input.next();
       try{
           inetAddress = InetAddress.getByName(host);
           System.out.println("IP Address of the host is "+inetAddress);
       }catch(Exception e){
           System.out.println(e);
       }
       
    }
    
}
