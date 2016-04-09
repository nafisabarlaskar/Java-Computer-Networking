
package ipaddressofmachine;

import java.net.InetAddress;


public class IPAddressOfMachine {

    
    public static void main(String[] args) {
        try{
            
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
