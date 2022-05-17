# kijani-rest-api

## Explore Rest APIs

The app defines following CRUD APIs.

### Products

| Method | Url                             | Description                    | Sample Valid Request Body |
|--------|---------------------------------|--------------------------------| ------------------------- |
| GET    | /products/{productId}           | Get a product by product Id    | |
| GET    | /products                       | Get all products               | |
| GET    | /products?category={categoryId} | Filter by category             | |
| PUT    | /products/{productId}           | Edit a product by product Id   | |
| DELETE | /products/{productId}           | Delete a product by product Id | |

### Suppliers

| Method | Url                                          | Description                      | Sample Valid Request Body |
|--------|----------------------------------------------|----------------------------------| ------------------------- |
| GET    | /suppliers                                   | Get all suppliers                | |
| GET    | /suppliers/{supplierId}/profile              | Get a supplier profile by Id     | |
| GET    | /suppliers/{supplierId}/products             | Get all products from a supplier | |
| GET    | /suppliers/{supplierId}/products/{productId} | Get a product by from a supplier | |
| POST   | /suppliers/{supplierId}/products             |    Create a product by supplierId   | |
| POST   | /suppliers                                   | Create a supplier                | |
| PUT    | /suppliers/{supplierId}                      | Edit a supplier by supplierId    | |
| DELETE | /suppliers/{supplierId}                      | Delete a supplier by supplierId  | |

### Categories

| Method | Url                                    | Description                                    | Sample Valid Request Body |
|--------|----------------------------------------|------------------------------------------------| ------------------------- |
| GET    | /categories/{categoryId}               | Get a category and subcategories by categoryId | |
| GET    | /categories                            | Get all categories and subcategories           | |
| POST   | /categories/{categoryId}               | Create a category by category Id               | |
| POST   | /categories/{categoryId}/subCategories | Create a subcategory for a given category      | |
| PUT    | /categories/{categoryId}               | Edit a category by category Id                 | |
| DELETE | /categories/{categoryId}               | Delete a category by category Id               | |

### SubCategories

| Method | Url                         | Description                                | Sample Valid Request Body |
|--------|-----------------------------|--------------------------------------------| ------------------------- |
| GET    | /subCategories/{categoryId} | Get a subCategories by Id                  | |
| PUT    | /subCategories/{categoryId} | Edit a subCategories by subCategories Id   | |
| DELETE | /subCategories/{categoryId} | Delete a subCategories by subCategories Id | |

### EcoLabels

| Method | Url                     | Description                                | Sample Valid Request Body |
|--------|-------------------------|--------------------------------------------| ------------------------- |
| GET    | /ecoLabels              | Get all ecolabels                          | |
| GET    | /ecoLabels/{ecoLabelId} | Get a ecolabel by Id                       | |
| POST   | /ecoLabels/{ecoLabelId} | Create a ecolabel by ecolabel Id | |
| PUT    | /ecoLabels/{ecoLabelId} | Edit a ecolabel by ecolabel Id   | |
| DELETE | /ecoLabels/{ecoLabelId} | Delete a ecolabel by ecolabel Id | |
