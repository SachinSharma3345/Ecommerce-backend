package com.example.ecommerce.controllers;

import com.example.ecommerce.models.Cart;
import com.example.ecommerce.security.services.UserDetailsImpl;
import com.example.ecommerce.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping
    public ResponseEntity<Cart> getCart() {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(cartService.getCartByUser(userDetails.getId()));
    }

    @PostMapping("/add/{productId}")
    public ResponseEntity<Cart> addToCart(@PathVariable Long productId, @RequestParam(defaultValue = "1") int quantity) {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Cart cart = cartService.addProductToCart(userDetails.getId(), productId, quantity);
        return ResponseEntity.ok(cart);
    }
}
