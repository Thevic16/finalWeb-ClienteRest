package edu.pucmm.eict;

import edu.pucmm.eict.Controllers.MainController;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        //Creando la instancia del servidor.
        Javalin app = Javalin.create(config ->{
            config.addStaticFiles("/public"); //desde la carpeta de resources
            config.enableCorsForAllOrigins();
        });

        app.start(8000);

        new MainController(app).applyRoutes();

    }
}
