package com.drag.xiongji.wm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.drag.xiongji.wm.entity.ProductActivity;



public interface ProductActivityDao extends JpaRepository<ProductActivity, String>, JpaSpecificationExecutor<ProductActivity> {
	
	
	
}
