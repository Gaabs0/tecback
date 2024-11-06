package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.CartaoCredito;
import br.com.fujideia.iesp.tecback.service.CartaoCreditoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
public class CartaoCreditoController {

    private final CartaoCreditoService cartaoCreditoService;

    public CartaoCreditoController(CartaoCreditoService cartaoCreditoService) {
        this.cartaoCreditoService = cartaoCreditoService;
    }

    @PostMapping
    public ResponseEntity<CartaoCredito> criarCartao(@RequestBody CartaoCredito cartaoCredito) {
        // Implementar lógica de criação de cartão de crédito
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartaoCredito> buscarPorId(@PathVariable Long id) {
        // Implementar lógica de busca por ID
        return null;
    }

    @GetMapping
    public ResponseEntity<List<CartaoCredito>> listarTodos() {
        // Implementar lógica de listagem de todos os cartões de crédito
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        // Implementar lógica de deleção
        return null;
    }
}