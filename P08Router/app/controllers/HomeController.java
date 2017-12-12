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
}
