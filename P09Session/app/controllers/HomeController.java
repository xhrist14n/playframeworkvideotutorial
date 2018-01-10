package controllers;

import play.mvc.*;

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
        return ok(
            views.html.index.render()
        );
    }


    public Result start() {
        int count = 1;
        session("counter",String.valueOf(count) );

        return ok(
            views.html.count.render(String.valueOf(count))
        );
    }
    
    public Result counter() {
        int count = Integer.parseInt(
            session("counter").toString()
        );
        count++;
        session("counter",String.valueOf(count));

        return ok(
            views.html.count.render(String.valueOf(count))
        );
    }

    public Result remove() {
        int count = 1;
        session().remove("counter");
        session("counter",String.valueOf(count) );

        return ok(
            views.html.count.render(String.valueOf(count))
        );
    }

    public Result clear() {        
        session().clear();
        return ok(
            views.html.count.render("--")
        );
    }    
    
}
