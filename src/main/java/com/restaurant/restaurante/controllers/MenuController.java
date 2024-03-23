
package com.restaurant.restaurante.controllers;

import com.restaurant.restaurante.model.Menu;
import com.restaurant.restaurante.service.MenuService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
    
    @GetMapping("/menu")
    //@ResponseBody
    public Menu getMenuItem(@RequestParam int id) {
        
        Menu platoMenu = null;
        MenuService servMenu = new MenuService();
        
        List<Menu> listMenu = servMenu.createMenu();
         
        for (Menu plato : listMenu) {
            if (plato.getId() == id) {
               platoMenu = plato;
            }
        }                
 
        return platoMenu;
    }
}
