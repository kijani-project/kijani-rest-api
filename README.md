# kijani-rest-api

## Explore Rest APIs

The app defines following CRUD APIs.

### Products


| Method | Url                                 | Description                    | Sample Valid Request Body    |
|--------|-------------------------------------|--------------------------------|------------------------------|
| GET    | /products/{productId}               | Get a product by product Id    |                              |
| GET    | /products                           | Get all products               |                              |
| GET    | /products?category={categoryId}     | Filter by category             |                              |
| GET    | /products?designer={designerName}   | Get products by designer       | Write whole name of designer |
| GET    | /products?ecoLabelId={ecoLabelId}   | Get products by EcoLabelId     | Write whole name of designer |
| PUT    | /products/{productId}               | Edit a product by product Id   |                              |
| DELETE | /products/{productId}               | Delete a product by product Id |                              |

### Suppliers

| Method | Url                                          | Description                      | Sample Valid Request Body |
|--------|----------------------------------------------|----------------------------------|---------------------------|
| GET    | /suppliers                                   | Get all suppliers                |                           |
| GET    | /suppliers/{supplierId}/profile              | Get a supplier profile by Id     |                           |
| GET    | /suppliers/{supplierId}/products             | Get all products from a supplier |                           |
| GET    | /suppliers/{supplierId}/products/{productId} | Get a product by from a supplier |                           |
| POST   | /suppliers/{supplierId}/products             | Create a product by supplierId   |                           |
| POST   | /suppliers                                   | Create a supplier                |                           |
| PUT    | /suppliers/{supplierId}                      | Edit a supplier by supplierId    |                           |
| DELETE | /suppliers/{supplierId}                      | Delete a supplier by supplierId  |                           |

### Categories

| Method | Url                                    | Description                                    | Sample Valid Request Body |
|--------|----------------------------------------|------------------------------------------------|---------------------------|
| GET    | /categories/{categoryId}               | Get a category and subcategories by categoryId |                           |
| GET    | /categories                            | Get all categories and subcategories           |                           |
| POST   | /categories/{categoryId}               | Create a category by category Id               |                           |
| POST   | /categories/{categoryId}/subCategories | Create a subcategory for a given category      |                           |
| PUT    | /categories/{categoryId}               | Edit a category by category Id                 |                           |
| DELETE | /categories/{categoryId}               | Delete a category by category Id               |                           |

### SubCategories

| Method | Url                             | Description                                           | Sample Valid Request Body |
|--------|---------------------------------|-------------------------------------------------------|---------------------------|
| GET    | /subCategories/{subCategoryId}  | Get a subCategories by subCategoryId                  |                           |
| PUT    | /subCategories/{subCategoryId}  | Edit a subCategories by subCategories subCategoryId   |                           |
| DELETE | /subCategories/{subCategoryId}  | Delete a subCategories by subCategories subCategoryId |                           |

### Designers

| Method | Url                    | Description                     | Sample Valid Request Body |
|--------|------------------------|---------------------------------|---------------------------|
| GET    | /designer              | Get all designers               |                           |
| GET    | /designer/{designerId} | Get a designer by designerId    |                           |
| POST   | /designer/             | Create a designer               |                           |
| DELETE | /designer/{designerId} | Delete a designer by designerId |                           |


### ProductEcoLabels

| Method | Url                                   | Description                                    | Sample Valid Request Body |
|--------|---------------------------------------|------------------------------------------------|---------------------------|
| GET    | /productEcoLabels                     | Get all productEcoLabels                       |                           |
| GET    | /productEcoLabels/{productEcoLabelId} | Get a productEcoLabel by productEcoLabel Id    |                           |
| POST   | /productEcoLabels                     | Create a productEcoLabel                       |                           |
| PUT    | /productEcoLabels/{productEcoLabelId} | Edit a productEcoLabel by productEcoLabel Id   |                           |
| DELETE | /productEcoLabels/{productEcoLabelId} | Delete a productEcoLabel by productEcoLabel Id |                           |
