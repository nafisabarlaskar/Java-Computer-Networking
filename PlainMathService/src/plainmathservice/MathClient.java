
package plainmathservice;

import java.io.*;
import java.net.*;
import java.util.*;

public class MathClient{
    public static void main(String[] args)
    {
        String hostname = "localhost";
        int port = 1234;
        if(args.length!=2)
        {
            System.out.println("Use default setting");
        }
        else
        {
            hostname = args[0];
            port = Integer.parseInt(args[1]);
        }
        try{
            Socket socket = new Socket(hostname, port);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("+:12:21");
            writer.newLine();;
            writer.flush();
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             reader.close();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

    
