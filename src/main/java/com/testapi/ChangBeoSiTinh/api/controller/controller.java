package com.testapi.ChangBeoSiTinh.api.controller;

import com.testapi.ChangBeoSiTinh.api.model.dookki;
import com.testapi.ChangBeoSiTinh.service.dookkiServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class controller {
    private dookkiServie DookkiServie;
    @Autowired
    public controller(dookkiServie dookkiServie){
        this.DookkiServie = dookkiServie;
    }
    @GetMapping("/dookki")
    public dookki getOnebyID(@RequestParam Integer id){
        Optional<dookki> onethdookicon = DookkiServie.getID(id);
        if (onethdookicon.isPresent()){
            return (dookki) onethdookicon.get();
        }
        return null;
    }

}
