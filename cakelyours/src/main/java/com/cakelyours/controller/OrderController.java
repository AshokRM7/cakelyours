package com.cakelyours.controller;

import com.cakelyours.model.CakeOrder;
import com.cakelyours.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/order")
    public String showOrderForm(CakeOrder order) {
        return "order";
    }

    @PostMapping("/submitOrder")
    public String submitOrder(@ModelAttribute CakeOrder order) {
        orderRepository.save(order);
        return "redirect:/order?success=true";
    }

    @GetMapping("/admin/orders")
    public String viewAllOrders(Model model) {
        List<CakeOrder> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "orders";  // orders.html page
    }



}
// This controller handles the order submission process.