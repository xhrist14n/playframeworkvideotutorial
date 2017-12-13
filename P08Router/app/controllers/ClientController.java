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

    public Result show(int id) {
        List<String > clients = new ArrayList<String>();
        clients.add("Primero");
        clients.add("Segundo");
        clients.add("Tercero");
        clients.add("Cuarto");
        clients.add("Quinto");
        String client = "";
        if(id>clients.size()){
            client = "Otro";
        }else{
            client = clients.get(id-1);
        }
        HashMap<String,String> data = new HashMap<String,String>();
        data.put("client",client);
        String json = Json.stringify(Json.toJson(data));
        return ok(json).as("application/json");
    }
    public Result list() {
        List<String > clients = new ArrayList<String>();
        clients.add("Primero");
        clients.add("Segundo");
        clients.add("Tercero");
        clients.add("Cuarto");
        clients.add("Quinto");
        HashMap<String,List<String>> data = new HashMap<String,List<String>>();
        data.put("clients",clients);
        String json = Json.stringify(Json.toJson(data));
        return ok(json).as("application/json");
    }
}
