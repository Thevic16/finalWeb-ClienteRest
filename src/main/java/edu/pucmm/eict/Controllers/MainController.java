package edu.pucmm.eict.Controllers;

import edu.pucmm.eict.utils.BaseController;
import io.javalin.Javalin;

import static io.javalin.core.security.SecurityUtil.roles;

public class MainController extends BaseController {

    public MainController(Javalin app) {
        super(app);
    }

    @Override
    public void applyRoutes() {

        app.get("/", ctx -> {
            ctx.render("/public/templates/login.html");
        });

    }


}
