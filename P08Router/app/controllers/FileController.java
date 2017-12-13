package controllers;

import play.mvc.*;

import play.mvc.Results;

import views.html.*;

import models.*;

import java.util.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class FileController extends Controller{

    public Result download(String name) {
        return redirect("/assets/uploads/"+name);
    }
}