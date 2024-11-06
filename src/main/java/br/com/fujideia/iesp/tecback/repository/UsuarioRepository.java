
package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

