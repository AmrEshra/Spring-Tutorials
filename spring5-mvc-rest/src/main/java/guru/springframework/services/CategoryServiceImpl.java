package guru.springframework.services;

import java.util.List;

import org.springframework.stereotype.Service;

import guru.springframework.api.v1.model.CategoryDTO;
import guru.springframework.api.v1.model.CategoryMapper;
import guru.springframework.domain.Category;
import guru.springframework.repositories.CategoryRepository;

/**
 * Created by jt on 9/26/17.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {

        return CategoryMapper.categoryListToCategoryDTOList(categoryRepository.findAll());
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
    	
    	Category category = categoryRepository.findByName(name);
    	if(category == null)
    		return new CategoryDTO();
        return CategoryMapper.categoryToCategoryDTO(category);
    }
}
