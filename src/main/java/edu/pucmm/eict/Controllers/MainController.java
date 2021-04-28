package edu.pucmm.eict.Controllers;

import edu.pucmm.eict.utils.BaseController;
import io.javalin.Javalin;



public class MainController extends BaseController {

    public MainController(Javalin app) {
        super(app);
    }

    @Override
    public void applyRoutes() {

        app.get("/", ctx -> {
            ctx.render("/public/templates/login.html");
        });

        app.get("/create-form", ctx -> {
            ctx.render("/public/templates/main-form.html");
        });

        app.get("/list-form", ctx -> {
            ctx.render("/public/templates/list-form.html");
        });



    }


}
