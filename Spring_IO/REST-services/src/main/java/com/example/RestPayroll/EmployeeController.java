package com.example.RestPayroll;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class EmployeeController {

    private final EmployeeRepository repository;
    private final EmployeeModelAssembler assembler;

    public EmployeeController(EmployeeRepository repository, EmployeeModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

//    @GetMapping("/employees")
//    List<Employee> all() {
//        return repository.findAll();
//    }


    @GetMapping("/employees")
    CollectionModel<EntityModel<Employee>> all() {

        List<EntityModel<Employee>> employees = repository.findAll().stream()
                .map(employee -> EntityModel.of(employee,
                        linkTo(methodOn(EmployeeController.class).all()).withRel("employees")))
                .collect(Collectors.toList());

        return CollectionModel.of(employees,
                linkTo(methodOn(EmployeeController.class).all()).withSelfRel());
    }


    @PostMapping("/employees")
    ResponseEntity<?> newEmployee(@RequestBody Employee newEmployee) {
        EntityModel<Employee> entityModel =
                assembler.toModel(repository.save(newEmployee));

        return ResponseEntity
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
                .body(entityModel);
        //Employee newEmployee(@RequestBody Employee newEmployee) {
        //return repository.save(newEmployee);
    }


//    @GetMapping("employees/{id}")
//    Employee one(@PathVariable Long id) {
//
//        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
//    }

    @GetMapping("/employees/{id}")
    EntityModel<Employee> one(@PathVariable Long id) {

        Employee employee = repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

//        return EntityModel.of(employee,
//                linkTo(methodOn(EmployeeController.class).one(id)).withSelfRel(),
//                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));

        return assembler.toModel(employee);
    }

    @PutMapping("/employees/{id}")
        //Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
    ResponseEntity<?> replaceEmployee(@RequestBody Employee newEmployee,
                                      @PathVariable Long id) {

        Employee updateEmployee = repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
        EntityModel<Employee> entityModel = assembler.toModel(updateEmployee);

        return ResponseEntity
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
                .body(entityModel);
    }

    @DeleteMapping("/employees/{id}")
    ResponseEntity<?> deleteEmployee(@PathVariable Long id) {

        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
