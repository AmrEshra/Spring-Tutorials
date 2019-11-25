package guru.springframework.controllers.v1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.api.v1.model.CategoryDTO;
import guru.springframework.services.CategoryService;

/**
 * Created by jt on 9/26/17.
 */
@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {

	public static final String BASE_URL = "/api/v1/categories/";
	
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryDTO> getAllCatetories(){

        return categoryService.getAllCategories();
    }

    @GetMapping("{name}")
    public CategoryDTO getCategoryByName( @PathVariable String name){
        return categoryService.getCategoryByName(name);
    }

}
