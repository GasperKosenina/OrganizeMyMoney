package com.organizemymoney.ris.Controlers;


import com.organizemymoney.ris.DAO.Bancni_racunReposetory;
import com.organizemymoney.ris.Models.Bancni_racun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class Bancni_racunControler {
    @Autowired
    private Bancni_racunReposetory Bancni_racunDao;

    @GetMapping("/getVseBr")
    public Iterable<com.organizemymoney.ris.Models.Bancni_racun>vrniBancniRacun(){
        return Bancni_racunDao.findAll();
    }

    @GetMapping("/getBr/{id}")
    public Optional<Bancni_racun> getBancniRacunById(@PathVariable(value = "id") Long id){
        return Bancni_racunDao.findById(id);
    }

    @PostMapping("/postBr")
    public Bancni_racun dodajBancni_racun(@RequestBody Bancni_racun bancni_racun){

        return Bancni_racunDao.save(bancni_racun);
    }

    @PutMapping("/putBr/{id}")
    public Bancni_racun posodobiBancni_racun(@PathVariable(value = "id") Long id, @RequestBody Bancni_racun bancni_racunPodatki){
        ArrayList<Bancni_racun> racuni = (ArrayList<Bancni_racun>) Bancni_racunDao.findAll();
        for (int i = 0; i< racuni.size(); i++){
            Bancni_racun bancni_racun = racuni.get(i);
            if(bancni_racun.getId() == id){
                bancni_racun.setStanje(bancni_racunPodatki.getStanje());
                Bancni_racunDao.save(bancni_racun);
                return bancni_racun;
            }
        }
        return null;
    }


    @DeleteMapping("/izbrisiBr/{id}")
    public Bancni_racun izbrisRacuna(@PathVariable(value = "id") Long id){
        ArrayList<Bancni_racun> racuni = (ArrayList<Bancni_racun>) Bancni_racunDao.findAll();
        for(int i = 0; i< racuni.size(); i++){
            Bancni_racun bancni_racun = racuni.get(i);
            if(bancni_racun.getId() == id){
                Bancni_racunDao.delete(bancni_racun);
                return bancni_racun;
            }
        }
        return null;

    }


    @GetMapping("/getBrPoStanju")
    public Iterable<Bancni_racun> poStanju(){
        return Bancni_racunDao.vrniRacunePoStanju();
    }








}