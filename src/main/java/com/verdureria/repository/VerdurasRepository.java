
package com.verdureria.repository;

import com.verdureria.entity.Verduras;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerdurasRepository extends CrudRepository<Verduras,Long>{
    
}
