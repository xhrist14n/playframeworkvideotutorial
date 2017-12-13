package controllers;

import play.mvc.*;

import play.mvc.Results;

import views.html.*;

import models.*;

import java.util.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class HomeController extends Controller {

    public Result index() {
      String message = "Primera pagina ... ";
      return ok(message);
    }

    public Result main() {
      String message = "Primera pagina ... ";
      return ok(message);
    }

    public Result viewpage(String page){
        Result view = null;
        view = redirect(controllers.routes.HomeController.other());
        if(page.compareTo("home")==0){
            view = redirect(controllers.routes.HomeController.home());
        }
        if(page.compareTo("start")==0){
            view = redirect(controllers.routes.HomeController.start());
        }
        if(page.compareTo("test")==0){
            view = redirect(controllers.routes.HomeController.test());
        }
        if(page.compareTo("other")==0){
            view = redirect(controllers.routes.HomeController.other());
        }                
        return view;
    }

    public Result home() {
      String message = "Home page ... ";
      return ok(message);
    }
    public Result start() {
      String message = "Start page ... ";
      return ok(message);
    }

    public Result test() {
      String message = "Test page ... ";
      return ok(message);
    }
    public Result other() {
      String message = "other page ... ";
      return ok(message);
    }
}
