package main;
import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost", 8080);

        PrintWriter pr = new PrintWriter(socket.getOutputStream());
        pr.println("Testing Testing Testing");
        pr.flush();

        InputStreamReader in = new InputStreamReader(socket.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("Server: " +str);



    }
}
