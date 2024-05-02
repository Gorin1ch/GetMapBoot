package org.example.Service;

import org.example.DTO.ClassNamesDTO;
import org.example.Entity.ClassNames;
import org.example.Repository.ClassNamesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ClassNamesService {

    private final ClassNamesRepository classNamesRepository;

    public ClassNames create(ClassNamesDTO dto){
        ClassNames classNames = ClassNames.builder()
                .productName(dto.getProductName())
                .build();
        return classNamesRepository.save(classNames);
    }

    public List<ClassNames> readAll(){
        return classNamesRepository.findAll();
    }

    public void delete(Integer id){
        classNamesRepository.deleteById(id);
    }
}
