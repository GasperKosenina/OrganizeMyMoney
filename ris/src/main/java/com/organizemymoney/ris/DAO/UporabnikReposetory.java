package com.organizemymoney.ris.DAO;

import com.organizemymoney.ris.Models.Strosek;
import com.organizemymoney.ris.Models.Uporabnik;
import org.springframework.data.repository.CrudRepository;

public interface UporabnikReposetory extends CrudRepository<Uporabnik, Long> {
}
