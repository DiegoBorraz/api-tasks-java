package com.tasks.api.resources;


import java.util.List;

import com.tasks.api.models.Task;
import com.tasks.api.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/task")
@Api(value="API REST DE TAREFAS")
@CrossOrigin(origins="*")// Aqui voce coloca os dominios que quer ter acesso
public class TaskResource {

@Autowired
TaskRepository taskRepository;

@GetMapping("/all")
@ApiOperation(value="Retorna todas tarefas")
public List<Task> listTasks(){
    return taskRepository.findAll();
}

@GetMapping("/{id}")
@ApiOperation(value="Retorna uma tarefa")
public Task getTask(@PathVariable(value="id") long id) {
    return taskRepository.findById(id);
}

@PostMapping("")
@ApiOperation(value="Salva uma tarefa")
public Task saveTask(@RequestBody Task task){
    return taskRepository.save(task);
}

@DeleteMapping("/{id}")
@ApiOperation(value="Deleta uma tarefa")
public void deleteTask(@PathVariable(value="id") long id){
     taskRepository.deleteById(id);
}
@PutMapping("")
@ApiOperation(value="Atualiza uma tarefa")
public Task updateTask(@RequestBody Task task){
     return taskRepository.save(task);
}


}