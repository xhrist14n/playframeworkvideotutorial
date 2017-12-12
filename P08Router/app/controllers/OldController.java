package controllers;

import play.mvc.*;

import play.mvc.Results;

import views.html.*;

import models.*;

import java.util.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class OldController extends Controller {

    public Result index() {
      String message = "Esto funciona ok ... ";
      return ok(message);
    }


    public Result action() {
        String message = "Request obtenido de controller ... "+request();
        return ok(message);
    }

    public Result alguien(String nombre) {
        String message = "Este es alguien llamado: "+nombre;
        return ok(message);
    }

    public Result resultado(String codigo) {
        String message = "Este es el resultado:  ";
        Result resultado = ok(message);
        if(codigo.compareTo("ok")==0){
          resultado = ok(message);
        }
        if(codigo.compareTo("notfound")==0){
          resultado = notFound();
        }
        if(codigo.compareTo("pagenotfound")==0){
          message = codigo;
          resultado = notFound(message).as("text/html");
        }
        if(codigo.compareTo("badrequest")==0){
          message = codigo;
          resultado = badRequest(message);
        }
        if(codigo.compareTo("oops")==0){
          message = codigo;
          resultado = internalServerError(message);
        }
        if(codigo.compareTo("status")==0){
          message = codigo;
          resultado = status(488,message);
        }/**/
        return resultado;
    }

    public Result redirigir(String url){
      return redirect("/"+url);
    }
    public Result temporal(String url){
      return temporaryRedirect("/"+url);
    }
}
