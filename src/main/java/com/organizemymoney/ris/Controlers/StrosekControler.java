package com.organizemymoney.ris.Controlers;

import com.organizemymoney.ris.DAO.StrosekReposetory;
import com.organizemymoney.ris.Models.Strosek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class StrosekControler {
    @Autowired
    private StrosekReposetory StrosekDao;


    @GetMapping("/getVseStr")
    public Iterable<com.organizemymoney.ris.Models.Strosek>vrniStrosek(){
        return StrosekDao.findAll();
    }

    @PostMapping("/postVseStr")
    public Strosek dodajStrosek(@RequestBody Strosek strosek){
        return StrosekDao.save(strosek);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @PutMapping("/putStroski/{id}")
    public Strosek posodobiStrosek(@PathVariable(value = "id") Long id, @RequestBody Strosek strosekPodatki){
        ArrayList<Strosek> stroski = (ArrayList<Strosek>) StrosekDao.findAll();
        for (int i = 0; i< stroski.size(); i++){
            Strosek strosek = stroski.get(i);
            if(strosek.getId() == id){
                strosek.setZnesek(strosekPodatki.getZnesek());
                strosek.setOpomba(strosekPodatki.getOpomba());

                StrosekDao.save(strosek);
                return strosek;
            }
        }
        return null;
    }

    @GetMapping("/getStrPoParam")
    public Iterable<Strosek> poParam(){
        return StrosekDao.vrniStroskePoZnesku();
    }

    @GetMapping("/getStr/{id}")
    public Optional<Strosek> getStrosekById(@PathVariable(value = "id") Long id){
        return StrosekDao.findById(id);
    }

    @DeleteMapping("/izbrisiStr/{id}")
    public Strosek izbrisStroska(@PathVariable(value = "id") Long id){
        ArrayList<Strosek> stroski = (ArrayList<Strosek>) StrosekDao.findAll();
        for(int i = 0; i< stroski.size(); i++){
            Strosek strosek = stroski.get(i);
            if(strosek.getId() == id){
                StrosekDao.delete(strosek);
                return strosek;
            }
        }
        return null;

    }

}
