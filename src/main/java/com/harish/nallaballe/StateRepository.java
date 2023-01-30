package com.harish.nallaballe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State,Integer>{
    
    @Query("select new com.harish.nallaballe.State(id,stateName) form state where country.id=:id")
    public List<State> findByCountry(@Param("id") Integer id);

}
