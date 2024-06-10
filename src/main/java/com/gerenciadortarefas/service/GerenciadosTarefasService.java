package com.gerenciadortarefas.service;

import com.gerenciadortarefas.entity.Tarefa;
import com.gerenciadortarefas.repository.GerenciadorTarefasRepository;
import com.gerenciadortarefas.request.CadastrarTarefaRequest;
import com.gerenciadortarefas.status.TarefaStatusEnum;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GerenciadosTarefasService {

    @Autowired
    private GerenciadorTarefasRepository gerenciadorTarefasRepository;

    @Autowired
    private UsuarioService usuarioService;

    public Tarefa salvarTarefa(CadastrarTarefaRequest resquest){

        Tarefa tarefa = Tarefa.builder()
                .quantidadeHorasEstimadas(resquest.getQuantidadeHorasEstimadas())
                .status(TarefaStatusEnum.CRIADA)
                .titulo(resquest.getTitulo())
                .descricao(resquest.getDescricao())
                .criador(usuarioService.obterUsuarioId(resquest.getCriadorId()).get())
                .build();

        return this.gerenciadorTarefasRepository.save(tarefa);
    }
}
