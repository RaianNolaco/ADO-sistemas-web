    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.demo;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author raian.mnolaco
 */

@Controller
@RequestMapping("/curriculoSimples")
public class CurriculoSimplesController {
    
    @GetMapping("/dados")
    public ModelAndView exemploViewObj(){
        ModelAndView mv = new ModelAndView("curriculoSimples.html");
        mv.addObject("nome",CurriculoClass.nome);
        mv.addObject("numero",CurriculoClass.numero);
        mv.addObject("email",CurriculoClass.email);
        mv.addObject("nasc",CurriculoClass.nasc);
        mv.addObject("linkedin",CurriculoClass.linkedin);
        mv.addObject("github",CurriculoClass.github);
        return mv;
    }
}