package controllers;

import play.mvc.*;

import play.mvc.Results;

import views.html.*;

import models.*;

import java.util.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class ClientController extends Controller {

    public Result index() {
      String message = "Primera pagina ... ";
      return ok(message);
    }

    public Result show(Long id) {
        List<String > clients = new ArrayList<String>();
        clients.add("Primero");
        clients.add("Segundo");
        clients.add("Tercero");
        clients.add("Cuarto");
        clients.add("Quinto");
        String client = "";
        if(id>=clients.size()){
            client = "Otro";
        }else{
            client = clents.get(id);
        }
        HashMap<String,String> data = new HasMap<String,String>();
        data.put("client",client);
        String json = Json.stringify(Json.toJson(data));
        return ok(json).as("application/json");
    }
}
