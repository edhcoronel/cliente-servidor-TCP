package py.una.server.tcp;

import java.io.*;
import java.net.*;


public class TCPCliente {
    
    public static void main(String[] args) {
        
        final String HOST = "127.0.0.1";
        final int PUERTO = 10000;
        DataInputStream in;
        DataOutputStream out;

        try {
            BufferedReader inFromUser =
            new BufferedReader(new InputStreamReader(System.in));


            Socket sc = new Socket(HOST, PUERTO);

            InetAddress IPAddress = InetAddress.getByName(HOST);

            System.out.println("\nAlumno: Edher Emigdio Coronel Gamarra ");
            
            System.out.println("\nIntentando conectar a = " + IPAddress + ":" + HOST +  " via TCP...");
        

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            System.out.print("\nIngrese el identificador del (Banco/Entidad): ");
            Long id = Long.valueOf(inFromUser.readLine());
            out.writeLong(id);

            //Establecemos un tiempo de espera maximo
            sc.setSoTimeout(10000);

            String respuesta =  in.readUTF();
            

            System.out.println(respuesta);

            sc.close();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
}
