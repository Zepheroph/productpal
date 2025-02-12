package org.launchcode.productpal.models.data;

import org.launchcode.productpal.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer>{
    public long countById(Integer id);

}
