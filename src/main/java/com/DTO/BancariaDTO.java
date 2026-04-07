package com.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class BancariaDTO 
{
    @Getter
    @Setter
    @NoArgsConstructor
    public class TransaçaoRequest
    {
        private int numConta;
        private double valor;
    }

}
