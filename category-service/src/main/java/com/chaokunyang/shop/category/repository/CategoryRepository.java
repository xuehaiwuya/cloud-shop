package com.chaokunyang.shop.category.repository;

import com.chaokunyang.shop.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 分类仓库
 *
 * @author panxiang
 * @create 2017-08-24 15:10
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

//    List<Category> findByParentId(Long parentId);
//
//    List<Category> findByLevel(Integer level);

    List<Category> findByLevelAndName(Integer level, String name);
}
