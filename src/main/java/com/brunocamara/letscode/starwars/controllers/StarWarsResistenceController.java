package com.brunocamara.letscode.starwars.controllers;


import java.util.ArrayList;
import java.util.List;

import com.brunocamara.letscode.starwars.models.Rebelde;
import com.brunocamara.letscode.starwars.services.RebeldeService;
import com.sun.istack.NotNull;
import io.swagger.annotations.*;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class StarWarsResistenceController {

    @Autowired
    RebeldeService rebeldeService;


    @RequestMapping("/test")
    @ResponseBody
    public String getUsers() {
        return "Star Wars Challenge :) !";
    }


    @ApiOperation(value = " ", notes = "Adicionar Rebelde", response = StarWarsResistenceController.class, responseContainer = "List", tags = {"StarWars"})
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "Content-Type", required = true, dataType = "string", paramType = "header", defaultValue = "application/json")}
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = StarWarsResistenceController.class),
            @ApiResponse(code = 201, message = "Created", response = StarWarsResistenceController.class),
            @ApiResponse(code = 400, message = "Bad request", response = StarWarsResistenceController.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = StarWarsResistenceController.class),
            @ApiResponse(code = 403, message = "Forbidden", response = StarWarsResistenceController.class),
            @ApiResponse(code = 404, message = "Not Found", response = StarWarsResistenceController.class),
            @ApiResponse(code = 500, message = "The server encountered an unexpected condition which prevented it from fulfilling the request", response =  StarWarsResistenceController.class)})
    @RequestMapping("/addrebelde")
    @PostMapping(produces="application/json")
    public @ResponseBody List<Rebelde> addRebelde(@RequestBody @NotNull Rebelde data){

        System.out.println(data.getId());
        System.out.println(data.getNome());
        System.out.println(data.getGenero());
        System.out.println(data.getIdade());


        List<Rebelde> rebeldeList = new ArrayList<Rebelde>();
        rebeldeList.add(data);
        rebeldeService.saveRebelde(data);
        return  rebeldeList;
    }
}
