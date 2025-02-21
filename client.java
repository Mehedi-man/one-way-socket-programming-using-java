package socket;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {        
        Socket s = new Socket("localhost", 3000);
        System.out.print("Connected Successful");
      DataOutputStream output = new DataOutputStream(s.getOutputStream());
      Scanner scn = new Scanner(System.in);
      String str = "";
      
      while(!str.equals("Bye")){
          str = scn.nextLine();
          output.writeUTF(str);
      }
      s.close();
      
    }
    
}
