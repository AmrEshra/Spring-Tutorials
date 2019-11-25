package guru.springframework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.model.FinancialElementDTO;
import guru.springframework.services.FinancialElementService;

/**
 * Created by jt on 1/10/17.
 */
@RestController
@RequestMapping(FinancialElementController.BASE_URL)
public class FinancialElementController {
	
	public static final String BASE_URL = "/financialElements/";
	
    private FinancialElementService financialElementService;

    @Autowired
    public void setFinancialElementService(FinancialElementService financialElementService) {
        this.financialElementService = financialElementService;
    }

    @GetMapping
    public List<FinancialElementDTO> getAllFinancialElements(){

        return financialElementService.listAll();
    }

    @GetMapping("{id}")
    public FinancialElementDTO getFinancialElementById( @PathVariable Long id){
        return financialElementService.getById(id);
    }
}
