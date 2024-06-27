package com.example.springdata.repository;

import com.example.springdata.model.CustomerOrderDTO;
import com.example.springdata.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    /*
    select c.customer_name, o.order_name from customers c inner join orders o on o.customer_id = c.customer_id;

     */

    /*

     */
    @Query("select new com.example.springdata.model.CustomerOrderDTO(c.customerName, o.orderName) from Customer c inner join Order o on o.customerId = c.customerId")
    List<CustomerOrderDTO>findOrderNameAndCustomerName();
}
