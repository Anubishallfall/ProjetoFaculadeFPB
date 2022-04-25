package com.example.fpbproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.fpbproject.model.usuario.Usuario;

public interface IUsuarioRepository   extends JpaRepository<Usuario, Long>{

}



