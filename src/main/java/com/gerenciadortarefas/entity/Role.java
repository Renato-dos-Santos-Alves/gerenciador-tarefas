package com.gerenciadortarefas.entity;

import com.gerenciadortarefas.permissoes.PermissaoEnum;
import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="roles")
@Data
@Getter
@Setter
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private PermissaoEnum nome;

    @ManyToMany(mappedBy = "roles")
    private List<Usuario> usuarios;
}
