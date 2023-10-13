package br.com.pedroBraganca.todolist.task;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    /*
     * Usuário
     * Id
     * Descrição
     * Título
     * Data início
     * Data fim
     * Prioridade
     */
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;
    
    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private LocalDateTime createdAt;

    private UUID idUser;

    public void setTitle(String title) throws Exception{
        
        if(title.length() > 50){
            throw new Exception("O campo title deve conter no máximo 50 caracteres");
        }
        this.title = title;
    }

}
