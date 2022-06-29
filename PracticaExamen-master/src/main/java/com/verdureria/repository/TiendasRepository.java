
package com.verdureria.repository;

import com.verdureria.entity.Tiendas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendasRepository extends CrudRepository<Tiendas,Long>{
    
}
