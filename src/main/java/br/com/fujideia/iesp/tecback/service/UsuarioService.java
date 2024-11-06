package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.model.dto.*;
import br.com.fujideia.iesp.tecback.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    private Usuario convertToEntity(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        return usuario;
    }
    private UsuarioDTO convertToDTO(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()

        );
    }


    public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
        Usuario usuario = convertToEntity(usuarioDTO);
        return convertToDTO(usuarioRepository.save(usuario));
    }

public Optional<UsuarioDTO> atualizar(Long id, UsuarioDTO usuarioDTO) {
    return usuarioRepository.findById(id).map(usuario -> {
        usuario.setId(usuarioDTO.getId());
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());

        return UsuarioRepository.save(usuario);
    });

     }

public boolean deletar(Long id) {
    if (usuarioRepository.existsById(id)) {
        usuarioRepository.deleteById(id);
        return true;
    }
    return false;
}


}