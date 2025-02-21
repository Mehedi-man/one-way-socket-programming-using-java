package socket;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(3000);
        System.out.println("Server is connected");
        System.out.println("Waiting For Clinet");
        Socket s = ss.accept();
        System.out.println("Client Request Accepted");
        
    DataInputStream input = new DataInputStream (s.getInputStream());
    String str = "";
    while(!str.equals("Bye")){
    
        str=input.readUTF();
        System.out.println("Client Says : "+str);
        
    }
s.close();
    }

}
