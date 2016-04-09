
package clientprogram;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientProgram {
    private static InetAddress host;
    private static int port = 1234;
    public static void main(String[] args) {
       try{
           host = InetAddress.getLocalHost();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       accessServer();
    }
    
    private static void accessServer()
    {
        Socket socket = null;
        try{
            socket = new Socket(host,port);
            Scanner input =  new Scanner(socket.getInputStream());
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
            Scanner user = new Scanner(System.in);
            String message;
            do{
                System.out.println("enter the message");
               message = user.nextLine();
               output.println(message);
               String response = input.nextLine();
               System.out.println(" Server: "  + response);
            }while(! message.equals("close"));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
              System.out.println("Closing Connection");
                socket.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
   /* public void run() {
        try{
        Socket socket = new Socket("localhost",1234);
        PrintStream ps = new PrintStream(socket.getOutputStream());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message here");
        String msg = input.next();
        ps.println(msg);
        InputStreamReader Ir = new InputStreamReader(socket.getInputStream());
        BufferedReader Br = new BufferedReader(Ir);
        
        String message = Br.readLine();
        System.out.println(message);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }*/
}
