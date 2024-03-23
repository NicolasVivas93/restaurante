
package com.restaurant.restaurante.service;

import com.restaurant.restaurante.model.Menu;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MenuService implements IMenuService {
    
    @Override
    public List<Menu> createMenu() {
        
        List<Menu> listMenu = new ArrayList<>();
        listMenu.add(new Menu(1,"Milanesa napolitana",2000,"Con guarnicion(papas fritas, puré o ensalada)"));
        listMenu.add(new Menu(2,"Spaghetti a la bolognesa",3000,"Se puede agregar crema"));
        listMenu.add(new Menu(3,"Papas fritas con cheddar",1500,"Se puede agregar bacon"));
        
        return listMenu;
    }
    
}
