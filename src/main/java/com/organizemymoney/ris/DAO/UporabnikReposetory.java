package com.organizemymoney.ris.DAO;

import com.organizemymoney.ris.Models.Strosek;
import com.organizemymoney.ris.Models.Uporabnik;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UporabnikReposetory extends CrudRepository<Uporabnik, Long> {


    @Query("select u from Uporabnik u where size(u.uporabikoviStroski) > 1")
    List<Uporabnik> vrniUporabnikePoStroskih();

    @Query("select u from Uporabnik u where size(u.uporabikoviStroski) <= 1")
    List<Uporabnik> vrniUporabnikePoStroskih1();


}
