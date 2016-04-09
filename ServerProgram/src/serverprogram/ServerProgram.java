
package serverprogram;
import java.io.*;
import java.util.*;
import java.net.*;


public class ServerProgram {

    private static ServerSocket serverSocket;
    private static final int port = 1234;
            
    public static void main(String[] args) {
        
        try {
            Scanner input =  new Scanner(System.in);
            try{
                System.out.println("Opening port");
                serverSocket = new ServerSocket(port);
            }catch(Exception e)
            {
                System.out.println(e);
            }
            do
            {
             handleClient();   
            } while(true);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private static void  handleClient()
    {
        Socket socket = null;
        try{
            socket = serverSocket.accept();
            Scanner input = new Scanner(socket.getInputStream());
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
            int numberOfmessages = 0;
            String message = input.nextLine();
            while(!message.equals("close"))
            {
                System.out.println("Message received");
                numberOfmessages++;
                output.println("Message: "+numberOfmessages+": "+message);
                message = input.nextLine();
            }
            output.println(numberOfmessages+" messages received");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally
        {
            try{
                System.out.println("Connection closing");
                socket.close();
            }
            catch(Exception e){
                System.out.println("Error closing: "+e);
            }
        }
    }
    
    /*public void run() throws Exception{
        try{
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket socket = serverSocket.accept();
            InputStreamReader IR = new InputStreamReader(socket.getInputStream());
            BufferedReader BR = new BufferedReader(IR);

            String message = BR.readLine();
            System.out.println(message);
            
            

            if(message != null){
                PrintStream ps = new PrintStream(socket.getOutputStream());
                ps.println("Message received\n");

            }
            socket.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }*/
    
}
