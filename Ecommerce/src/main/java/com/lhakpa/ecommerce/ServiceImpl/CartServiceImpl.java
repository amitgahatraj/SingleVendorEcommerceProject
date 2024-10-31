package com.lhakpa.ecommerce.serviceImpl;

import com.lhakpa.ecommerce.dto.CartDTO;
import com.lhakpa.ecommerce.entity.CartItem;
import com.lhakpa.ecommerce.repository.CartRepository;
import com.lhakpa.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public CartDTO addToCart(CartDTO cartDTO) {
        CartItem cartItem = new CartItem();
        cartItem.setUserId(cartDTO.getUserId());
        cartItem.setProductId(cartDTO.getProductId());
        cartItem.setQuantity(cartDTO.getQuantity());
        cartRepository.save(cartItem);
        return cartDTO;
    }

    @Override
    public List<CartDTO> getCartItems(Long userId) {
        return cartRepository.findByUserId(userId).stream()
                .map(cartItem -> new CartDTO(cartItem.getId(), cartItem.getUserId(), cartItem.getProductId(), cartItem.getQuantity()))
                .collect(Collectors.toList());
    }

    @Override
    public void removeFromCart(Long id) {
        cartRepository.deleteById(id);
    }
}
