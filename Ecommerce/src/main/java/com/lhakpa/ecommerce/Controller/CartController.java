

package com.lhakpa.ecommerce.Controller;

import com.lhakpa.ecommerce.dto.CartDTO;
import com.lhakpa.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping
    public CartDTO addToCart(@RequestBody CartDTO cartDTO) {
        return cartService.addToCart(cartDTO);
    }

    @GetMapping("/{userId}")
    public List<CartDTO> getCartItems(@PathVariable Long userId) {
        return cartService.getCartItems(userId);
    }

    @DeleteMapping("/{id}")
    public void removeFromCart(@PathVariable Long id) {
        cartService.removeFromCart(id);
    }
}

