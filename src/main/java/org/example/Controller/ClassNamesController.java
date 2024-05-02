package org.example.Controller;

import org.example.DTO.ClassNamesDTO;
import org.example.Entity.ClassNames;
import org.example.Service.ClassNamesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClassNamesController {

    private final ClassNamesService classNamesService;

    @PostMapping
    public ResponseEntity<ClassNames> create(@RequestBody ClassNamesDTO dto){
        return new ResponseEntity<>(classNamesService.create(dto), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<ClassNames>> readAll(){
        return new ResponseEntity<>(classNamesService.readAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id){
        classNamesService.delete(id);
        return HttpStatus.OK;
    }
 }
