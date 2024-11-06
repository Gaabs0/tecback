package br.com.fujideia.iesp.tecback.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartaoCreditoDTO {
    private Long id;

    private String numeroCartao;

    private String nomeTitular;

    private String validade;

    private Integer cvv;

    private Double limite;

    private Double faturaAtual;
}
