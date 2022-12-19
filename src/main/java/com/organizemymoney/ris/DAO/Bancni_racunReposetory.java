package com.organizemymoney.ris.DAO;

import com.organizemymoney.ris.Models.Bancni_racun;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Bancni_racunReposetory extends CrudRepository<Bancni_racun, Long> {
    @Query("select b from Bancni_racun b where b.stanje > 300 and b.stanje <= 1500")
    List<Bancni_racun> vrniRacunePoStanju();


}
