package com.kijani.restapi.repository;

import com.kijani.restapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  Optional<Product> findProductByName(String name);

  Optional<Product> findProductByNameAndAndDescription(String name, String description);

  Optional<Product> findProductByProductIdAndSupplierSupplierId(int productId, int supplierId);

  List<Product> findProductBySupplierSupplierId(int supplierId);

  @Query(
      value =
          "SELECT * from product\n"
              + "INNER JOIN product_category pc on product.product_id = pc.product_id\n"
              + "    JOIN sub_category sc on sc.sub_category_id = pc.sub_category_id\n"
              + "    JOIN category c on c.category_id = sc.category_id where c.category_id = ?1",
      nativeQuery = true)
  List<Product> findProductsByCategoryId(Integer categoryId);
}
