package br.com.brunorousenq.todolist.taks;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends  JpaRepository <TaskModel, UUID>{
    
}
