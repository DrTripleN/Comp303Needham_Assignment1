package com.example.nahanielneedham_comp303_assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public String showOrderForm(Model model) {
        return "order";
    }

    @PostMapping("/submit")
    String getOrder(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("phone") String phone,@RequestParam("address") String address,@RequestParam("province") String province, @RequestParam("zipcode") String zipcode,@RequestParam("brand") String brand,@RequestParam("model") String model,@RequestParam("price") double price,@RequestParam("quantity") int quantity,  Model orderModel) {

        //Create an order object
        Order order = new Order(name,email,phone,address,province,zipcode,brand,model,price,quantity);

        orderModel.addAttribute("order", order);
        orderModel.addAttribute("totalPrice",order.calculateTotalPrice());
        return "showOrder";
    }
}
