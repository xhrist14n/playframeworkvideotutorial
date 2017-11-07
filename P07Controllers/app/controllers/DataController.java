package controllers;

import play.mvc.*;

import views.html.*;

import models.*;

import java.util.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class DataController extends Controller {

    public Result index() {
        List<Person> persons = Person.find.all();
        String data = Json.stringify(Json.toJson(persons));
        System.out.println(data);
        return ok(index.render(data));
    }

}
