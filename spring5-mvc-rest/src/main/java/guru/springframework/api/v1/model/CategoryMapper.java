package guru.springframework.api.v1.model;

import java.util.ArrayList;
import java.util.List;

import guru.springframework.domain.Category;

/**
 * Created by jt on 9/25/17.
 */
public class CategoryMapper {

    public CategoryMapper() {
	}

	public static CategoryDTO categoryToCategoryDTO(Category category) {
		
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(category.getId());
		categoryDTO.setName(category.getName());
		
		return categoryDTO;
	};
	
	public static List<CategoryDTO> categoryListToCategoryDTOList(List<Category> categoryList) {
		
		List<CategoryDTO> categoryDTOList = new ArrayList<>();
		
		for(Category category : categoryList) {
			categoryDTOList.add(categoryToCategoryDTO(category));
		}
		
		return categoryDTOList;
	};
}
