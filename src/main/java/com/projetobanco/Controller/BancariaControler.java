package com.projetobanco.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.BancariaDTO.TransaçaoRequest;

import jakarta.annotation.PostConstruct;
import com.projetobanco.model.BancariaModel;
@RestController
@RequestMapping("/Bancario")
public class BancariaControler 
{
    private BancariaModel contaBanco1 = new BancariaModel();

    public String funcionamento()
    {
        return "Conta bancaria";
    }
    @PostMapping("/Depositar")
    public String depositar(@RequestBody TransaçaoRequest request)
    {
        contaBanco1.depositar(request.getValor());
        return "Deposito de RS " + request.getValor() + "realizado com sucesso";
    }
    @PostMapping("/Sacar")
    public String sacar(@RequestBody TransaçaoRequest request)
    {
        contaBanco1.sacar(request.getValor());
        return "Saque de RS " + request.getValor() + "realizado com sucesso";
    }
}
