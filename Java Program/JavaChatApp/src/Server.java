import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    //treat it like extension board
    //Responsible for listening to incoming connection or cllients and create socket object to communicate with them

    public Server(ServerSocket serverSocket){
        this.serverSocket=serverSocket;
    }
    public void startServer(){
        //Responsible of keeping server running
        try {
            while(!serverSocket.isClosed())//To run server to infinity
            {
                Socket socket =serverSocket.accept();
                System.out.println("A new Client has connected");
                //Each obj of this class is responsible to communicate with client
                ClientHandler clientHandler=new ClientHandler(socket);
                //This class implement runnable because each instance is executed by seprate thread;
                Thread thread =new Thread(clientHandler);
                thread.start();

            }
        }catch (Exception e){
        e.printStackTrace();
    }

    }

    public void closeServerSocket(){
        try {
            if(serverSocket!=null){
                serverSocket.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(1234);
        Server server=new Server(serverSocket);
        server.startServer();

    }
}
