package com.testapi.ChangBeoSiTinh.service;

import com.testapi.ChangBeoSiTinh.api.model.dookki;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class dookkiServie {
    private List<dookki> dookkiList;
    public dookkiServie(){
        dookkiList= new ArrayList<>();
        dookki dookki = new dookki(1,"sotbeo","rongbien","pepsi");
        dookki dookki2 = new dookki(2,"sotbeo1","rongbien2","pepsi3");
        dookki dookki3 = new dookki(3,"sotbeo11","rongbien22","pepsi33");
        dookki dookki4 = new dookki(4,"sotbeo111","rongbien222","pepsi333");
        dookki dookki5 = new dookki(5,"sotbeo1111","rongbien2222","pepsi3333");
        dookkiList.addAll(Arrays.asList(dookki,dookki2,dookki3,dookki4,dookki5));

    }
    public Optional<dookki> getID(Integer id){
        Optional optional = Optional.empty();
        for (dookki dookkiCon : dookkiList){
            if (id == dookkiCon.getId()){
                optional = Optional.of(dookkiCon);
                return optional;
            }
        }
        return optional;
    }
}
