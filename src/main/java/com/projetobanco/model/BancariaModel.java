package com.projetobanco.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BancariaModel 
{
    private double saldo;
    public void depositar(double valor)
    {
        if (valor > 0)
        {
            this.saldo += valor;
        }
    }
    public void sacar(double valor)
    {
        if ( valor > 0 && valor <= this.saldo)
        {
            this.saldo -= valor;
        }
    }
    public double getSaldo()
    {
        return this.saldo;
    }
}
