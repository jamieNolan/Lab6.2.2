package controllers;

import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result home() {
        return ok(home.render("Welcome to home"));
    }


  
    public Result about() {
        return ok(about.render("Welcome to about"));

    }

}

