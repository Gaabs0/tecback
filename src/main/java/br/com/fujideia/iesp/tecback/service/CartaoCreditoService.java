
package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.CartaoCredito;
import br.com.fujideia.iesp.tecback.repository.CartaoCreditoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoCreditoService {

    private final CartaoCreditoRepository cartaoCreditoRepository;

    public CartaoCreditoService(CartaoCreditoRepository cartaoCreditoRepository) {
        this.cartaoCreditoRepository = cartaoCreditoRepository;
    }

    public CartaoCredito salvar(CartaoCredito cartaoCredito) {
        // Implementar lógica de salvamento
        return null;
    }

    public CartaoCredito buscarPorId(Long id) {
        // Implementar lógica de busca por ID
        return null;
    }

    public List<CartaoCredito> listarTodos() {
        // Implementar lógica de listagem de todos os cartões de crédito
        return null;
    }

    public void deletar(Long id) {
        // Implementar lógica de deleção
    }
}