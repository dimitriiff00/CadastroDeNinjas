package dev.Java10x.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasVindas") //pega informações
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
