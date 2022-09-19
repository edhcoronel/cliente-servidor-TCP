package py.una.server.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

import py.una.entidad.Cliente;
import py.una.entidad.ClienteJSON;


public class TCPSevidor {
    public static void main(String[] args) throws Exception {
        
        ServerSocket servidor = null;
        Socket sc = null;  // socket del cliente
        DataInputStream in;
        DataOutputStream out;
        //Lista de los bancos/financieras clientes
        Hashtable<Long, Cliente> bancosClientes = new Hashtable<Long, Cliente>();

        bancosClientes.put((long) 1, new Cliente(1, "Banco Familiar", "6850"));
        bancosClientes.put((long) 2, new Cliente(1, "Banco Continental", "6920"));
        bancosClientes.put((long) 3, new Cliente(1, "Banco Vision", "7020"));
        bancosClientes.put((long) 3, new Cliente(1, "Banco Vision", "7020"));

        final int PUERTO = 10000;

        try {
            // Creamos el socket servidor (TCP)
            servidor = new ServerSocket(PUERTO);
            System.out.println("\nAlumno: Edher Emigdio Coronel Gamarra");
            System.out.println("\nServidor TCP iniciado");
            

            // Servidor siempre esperaando
            while(true){

                System.out.println("\n\nEsperando algun cliente...");
                
                
                //accept Llamada bloqueante
                sc = servidor.accept();


                System.out.println("\nCliente conectado");
                
                //buffer de datos(entrada y salida)
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                 //esperamos el mensaje del cliente
                
                Long identificador = in.readLong();
                System.out.println("________________________________________________");
                System.out.println("Aceptamos el mensaje");
                System.out.println("Mensaje recibido = "+ identificador);
                System.out.println("Procesamos el dato...");
                System.out.println("------------------------------------------------");
                


            
                if(bancosClientes.get(identificador) != null){
                    
                    Cliente aux = bancosClientes.get(identificador);
                    String cotizacion = aux.getCotizacion();
                    String banco = aux.getCliente();
                    String resp = " La cotizacion es: 1$ - "+cotizacion +"\n Gracias por su cotizacion "+banco+"!\n";
                    out.writeUTF("\n Cotizacion Exitosa!!!\n"+resp);
                    System.out.println("Datos del cliente ");
                    System.out.println(ClienteJSON.objetoString(aux));
                    System.out.println("Cotizacion enviada");
                }
                else{
                    out.writeUTF("Cliente no reconocido");
                    System.out.println("Id no reconocido, no existe en la bd");

                }

                sc.close(); //cerramos el cliente

                System.out.println("Cliente desconectado");


            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
