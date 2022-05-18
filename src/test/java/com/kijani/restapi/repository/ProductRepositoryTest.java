package com.kijani.restapi.repository;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductRepositoryTest {
  // CRUD tests
  /*
  @Autowired ProductService productService;
  private int supplierId = 1;
  // Create
  @Test
  void testCreateProduct() {

    // Arrange

    Product product = new Product();
    String productName = "createProduct";
    String productDesc = "Test product creation";
    product.setName(productName);
    product.setDescription(productDesc);

    // Act
    productService.create(product, supplierId);

    Product productDb = productService.findByName(productName);

    // Assert
    Assertions.assertEquals(productDb.getDescription(), productDesc);

    // Teardown
    productService.delete(product.getProductId());
  }

  // Read
  @Test
  void testFindProductByName() {

    // Arrange
    Product product = new Product();
    String productName = "Test#01";
    String productDesc = "Test#02";
    product.setName(productName);
    product.setDescription(productDesc);

    // Act
    productService.create(product, supplierId);

    Product productDb =
        productService.findByNameAndDescription(product.getName(), product.getDescription());

    // Assert
    Assertions.assertEquals(productDb.getDescription(), productDesc);

    // Teardown
    productService.delete(product.getProductId());
  }

  // Update
  @Test
  void testUpdateProductName() {

    // Arrange
    Product product = new Product();
    String productName = "Test#01";
    product.setName(productName);
    product = productService.create(product, supplierId);

    // Act
    product.setName("new name");
    productService.update(product);

    // Assert
    Assertions.assertEquals(
        product.getName(),
        productService
            .findByNameAndDescription(product.getName(), product.getDescription())
            .getName());

    // Teardown
    productService.delete(product.getProductId());
  }

  // Delete
  @Test
  void testDeleteProduct() {
    // Arrange
    Product product = new Product();
    String productName = "Test#01";
    product.setName(productName);
    product = productService.create(product, supplierId);

    // Act
    productService.delete(product.getProductId());

    // Assert
    Assertions.assertNull(productService.findByName(product.getName()));
  }*/
}
