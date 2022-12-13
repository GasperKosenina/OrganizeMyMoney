package com.organizemymoney.ris.Controlers;

import com.organizemymoney.ris.DAO.UporabnikReposetory;
import com.organizemymoney.ris.Models.Strosek;
import com.organizemymoney.ris.Models.Uporabnik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;



@RestController
public class UporabnikControler {
    @Autowired
    private UporabnikReposetory UporabnikDao;

    @GetMapping("/getVseUpo")
    public Iterable<Uporabnik> vrniUporabnika(){
        return UporabnikDao.findAll();
    }

    @PostMapping("/postVseUpo")
    public Uporabnik dodajUporabnika(@RequestBody Uporabnik uporabnik){
        return UporabnikDao.save(uporabnik);
    }

    @DeleteMapping("/izbrisiUpo/{id}")
    public Uporabnik izbrisUporabnika(@PathVariable(value = "id") Long id){
        ArrayList<Uporabnik> uporabniki = (ArrayList<Uporabnik>) UporabnikDao.findAll();
        for(int i = 0; i< uporabniki.size(); i++){
            Uporabnik uporabnik = uporabniki.get(i);
            if(uporabnik.getId() == id){
                UporabnikDao.delete(uporabnik);
                return uporabnik;
            }
        }
        return null;

    }

    @GetMapping("/getUprPoStr")
    public Iterable<Uporabnik> poStr(){
        return UporabnikDao.vrniUporabnikePoStroskih();
    }

    @GetMapping("/getUprPoStr1")
    public Iterable<Uporabnik> poStr1(){
        return UporabnikDao.vrniUporabnikePoStroskih1();
    }


}
