package com.ramacciotti.ecommerce.domain.dto.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO é utilizado para a transferência de dados entre camadas. Por exemplo, podemos ter um DTO que pega os dados de um formulário de cadastro (Camada de interface do usuário) e transporta os dados para um Controller (camada de aplicação).
 * <br>
 * 1) Se você utilizar um MODEL, que poderia ter uma senha, ela ficará visivel no retorno da requisição. Com o DTO você pode remover campos que não quer mostrar
 * 2) Com um DTO você pode adicionar configurações adicionais para remover espaços nulos, por exemplo
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseDTO implements Serializable {

    private int status;

    private String message;

}
