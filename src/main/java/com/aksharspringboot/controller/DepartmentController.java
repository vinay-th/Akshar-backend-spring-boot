package com.aksharspringboot.controller;

import com.aksharspringboot.dto.DepartmentDto;
import com.aksharspringboot.dto.Response;
import com.aksharspringboot.model.DepartmentVo;
import com.aksharspringboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("admin/department/addDepartment")
    public ResponseEntity<Response> addDepartment(@RequestBody DepartmentDto departmentDto) {
        Response response = this.departmentService.addDepartment(departmentDto);
        return new ResponseEntity<>( response, HttpStatus.OK);
    }

    @GetMapping("admin/department/getAllDepartment")
    public ResponseEntity<Response> getAllDepartment() {
        Response response = this.departmentService.getAllDepartment();
        return new ResponseEntity<>( response, HttpStatus.OK);
    }

    @PostMapping("admin/department/updateDepartment")
    public ResponseEntity<Response> updateDepartment(@RequestBody DepartmentDto departmentDto) {
        Response response = this.departmentService.updateDepartment(departmentDto);
        return new ResponseEntity<>( response, HttpStatus.OK);
    }


}
