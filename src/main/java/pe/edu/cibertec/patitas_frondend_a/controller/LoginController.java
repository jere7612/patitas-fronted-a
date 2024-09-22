package pe.edu.cibertec.patitas_frondend_a.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.patitas_frondend_a.viewmodel.LoginModel;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/inicio")
    public String inicio(Model model) {
        LoginModel loginModel = new LoginModel("00", "", "");
        model.addAttribute("loginModel", loginModel);
        return "inicio";
    }

    @PostMapping("/autenticar")
    public String autenticar(@RequestParam("tipoDocumento") String tipoDocumento,
                             @RequestParam("numeroDocumento") String numeroDocumento,
                             @RequestParam("password") String password,
                             Model model) {

        //validar campos de entrada
        if (tipoDocumento ==null || tipoDocumento.trim().length() ==0 ||
                numeroDocumento == null || numeroDocumento.trim().length() ==0 ||
                password == null || password.trim().length() == 0){


            //Invocar servicio

            LoginModel loginModel = new LoginModel("01", "Debe completar correctamente sus credenciales", "");
            model.addAttribute("loginModel", loginModel);
            return "inicio";
        }

        LoginModel loginModel = new LoginModel("00", "", "Jeremias Perez");
        model.addAttribute("loginModel", loginModel);
        return "principal";


    }
}
