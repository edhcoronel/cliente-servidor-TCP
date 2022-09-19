package py.una.entidad;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ClienteJSON {

    /*public static void main(String[] args) {
        
        ClienteJSON representacion = new ClienteJSON();

    }*/

    //Este metodo pasa un objeto a un JSON usando cadenas
    public static String objetoString(Cliente p) {
    	
		JSONObject obj = new JSONObject();
        obj.put("idCliente", p.getIdCliente());
        obj.put("cliente", p.getCliente());
        obj.put("cotizacion", p.getCotizacion());

        return obj.toJSONString();
    }
    
    //Este metodo pasa una cadena JSON a un objeto
    public static Cliente stringObjeto(String str) throws Exception {
    	
        Cliente c = new Cliente();
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(str.trim());
        JSONObject jsonObject = (JSONObject) obj;

        Long idcliente = (Long) jsonObject.get("idCliente");
        c.setIdcliente(idcliente);
        c.setCliente((String)jsonObject.get("cliente"));
        c.setCotizacion((String)jsonObject.get("cotizacion"));
        
        
        return c;
	}

}
