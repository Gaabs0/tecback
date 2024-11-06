package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.CartaoCredito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoCreditoRepository extends JpaRepository<CartaoCredito, Long> {
}