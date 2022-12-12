package com.organizemymoney.ris.DAO;

import com.organizemymoney.ris.Models.Strosek;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StrosekReposetory extends CrudRepository<Strosek, Long> {

    @Query("select s from Strosek s where znesek > 10 and opomba = 'Trgovina' ")
    List<Strosek> vrniStroskePoZnesku();
}
