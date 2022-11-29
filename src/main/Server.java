package main;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();

        System.out.println("Client Connected");

        InputStreamReader in = new InputStreamReader(socket.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("client: " +str);

        PrintWriter pr = new PrintWriter(socket.getOutputStream());
        pr.println("hello");
        pr.flush();

    }
}
