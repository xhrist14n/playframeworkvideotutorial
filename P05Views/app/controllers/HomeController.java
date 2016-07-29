package controllers;

import classes.*;

import play.mvc.*;

import views.html.*;

import views.html.mainviews.*;
import views.html.aboutviews.*;
import views.html.atviews.*;
import views.html.parametersviews.*;
import views.html.iterationviews.*;
import views.html.blockifviews.*;
import views.html.blockreuseviews.*;
import views.html.expressionviews.*;
import views.html.commentsviews.*;
import views.html.characterviews.*;
import views.html.usecaseviews.*;
import views.html.layoutviews.*;
import views.html.tagsviews.*;
import views.html.includesviews.*;

import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
     public Result index() {
         return ok(index.render("Your new application is ready."));
     }

     public Result main() {
         String title = "Plantillas en Play Framework";
         String informacion = "Creado por Christian Portilla Pauca";
         return ok(mainview.render(title,informacion));
     }

     public Result about() {
         return ok(aboutview.render());
     }

     public Result at() {
         Data person = new Data();
         person.setNombre("jose");
         person.setApellido("alvarez");
         person.setEmail("jose@gmail.com");
         return ok(atview.render(person));
     }

     public Result parameters() {
         String title = "Parametros en plantillas";
         return ok(parametersview.render(title));
     }

     public Result iteration() {
         List<Data> persons = new ArrayList<Data>();
         for(int i =1;i<=5;i++){
           Data person = new Data();
           person.setNombre("nombre "+i);
           person.setApellido("apellido "+i);
           person.setEmail("mail"+i+"@gmail.com");
           persons.add(person);
         }
         return ok(iterationview.render(persons));
     }

     public Result blockif() {
         boolean flag = true;
         List<Data> persons = new ArrayList<Data>();
         /*for(int i =0;i<6;i++){
           Data person = new Data();
           person.setNombre("nombre "+i);
           person.setApellido("apellido "+i);
           person.setEmail("mail"+i+"@gmail.com");
           persons.add(person);
         }*/
         flag = !(persons.size()==0);
         return ok(blockifview.render(flag,persons));
     }

     public Result blockreuse() {
         List<Data> persons = new ArrayList<Data>();
         for(int i =1;i<=2;i++){
           Data person = new Data();
           person.setNombre("nombre "+i);
           person.setApellido("apellido "+i);
           person.setEmail("mail"+i+"@gmail.com");
           persons.add(person);
         }
         return ok(blockreuseview.render(persons));
     }

     public Result expression() {

         List<Data> persons = new ArrayList<Data>();
         for(int i =1;i<=2;i++){
           Data person = new Data();
           person.setNombre("nombre "+i);
           person.setApellido("apellido "+i);
           person.setEmail("mail"+i+"@gmail.com");
           persons.add(person);
         }

         Data person = new Data();
         person.setNombre("alguien ");
         person.setApellido("apellido desconocido");
         person.setEmail("mail@gmail.com");

         return ok(expressionview.render(persons,person));
     }

     public Result comments() {
         return ok(commentsview.render());
     }

     public Result character() {//--
         String article = " este detalle de texto es un tipo de texto raw o salida de texto simple";
         return ok(characterview.render(article));
     }

     public Result usecase() {
         return ok(usecaseview.render());
     }

     public Result layout() {
         String detailed = "Detalles de nuestra app.";
         String text = "Informacion con detalles de la implementacion";
         return ok(layoutview.render(detailed,text));
     }

     public Result tags() {
         return ok(tagsview.render());
     }

     public Result includes() {
         return ok(includesview.render());
     }


}
