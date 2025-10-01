package br.com.wellington.business;

import br.com.wellington.infrastructure.entity.Usuario;
import br.com.wellington.infrastructure.exception.ConflitException;
import br.com.wellington.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        try {

            emailExistente(usuario.getEmail());
            return usuarioRepository.save(usuario);

        }catch(ConflitException e){
            throw new ConflitException("email já cadastrado", e.getCause());

        }
    }
    public void emailExistente(String email){
        try {
            boolean exist = verificaEmailExistente(email);
            if (exist){
                throw new ConflitException("email ja cadastrado" + email);
            }
        }catch (ConflitException e){
            throw new ConflitException("email já cadastrado" + e.getCause());
        }
    }

    public boolean verificaEmailExistente(String email){
        return usuarioRepository.existsByEmail(email);
    }
}

