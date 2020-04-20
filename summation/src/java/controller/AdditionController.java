/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.AdditionService;

/**
 *
 * @author Lenovo
 */
public class AdditionController extends SimpleFormController {
    private AdditionService additionService;
    public void setAdditionService(AdditionService additionService)
    {
        this.additionService=additionService;
    }
    
    public AdditionController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Addition.class);
        setCommandName("addition");
        setSuccessView("sumView");
        setFormView("numberView");
    }
    
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
            Addition addition = (Addition) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("result",AdditionService.doAddition(addition.getN1(),addition.getN2()));
      
        return mv;
    }
    
     
}
