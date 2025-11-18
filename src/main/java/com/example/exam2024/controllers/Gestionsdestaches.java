/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.exam2024.controllers;

import com.example.exam2024.models.Listtaches;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author matiic
 */
@Controller
@SessionAttributes("listtaches")
public class Gestionsdestaches {
    @ModelAttribute("listtaches")
    public Listtaches creelist(){
        return new Listtaches();
    }
    @GetMapping("/start")
    public String affichepage(@ModelAttribute("listtaches")Listtaches list, Model model ){
      
        return "view";
    }
    @PostMapping("updatetache")
   public String  updatetache(@ModelAttribute("listtaches")Listtaches list, Model model,String tache){
       list.listeJours[list.jourAffiche].tache=tache;
       return "redirect:/start";
       
   }
   @PostMapping("joursuivant")
   public String  joursuivant(@ModelAttribute("listtaches")Listtaches list, Model model,String tache){
       list.joursuivant();
       return "redirect:/start";
       
   }
   @PostMapping("jourprecedent")
   public String  jourprecedent(@ModelAttribute("listtaches")Listtaches list, Model model,String tache){
       list.jourPrecedent();
       return "redirect:/start";
       
   }
    @PostMapping("supprimertaches")
   public String  supprimertaches(@ModelAttribute("listtaches")Listtaches list, Model model,String tache){
       list.supprimerToutesLesTaches();
       return "redirect:/start";
       
   }
}
