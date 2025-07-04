package com.cakelyours.repository;

import com.cakelyours.model.CakeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CakeOrder, Long> {
}
// This interface extends JpaRepository, providing CRUD operations for the Order entity.
// It allows you to perform operations like saving, deleting, and finding orders without needing to implement these methods manually.
// The Long type parameter indicates that the ID of the Order entity is of type Long.
// You can use this repository in your service layer to interact with the database.
// For example, you can autowire this repository in a service class and use it to manage orders in your application.
