/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.exam2024.models;

import java.util.ArrayList;

/**
 *
 * @author matiic
 */
public class Listtaches {

    public static int jourAffiche;
    public Tache[] listeJours;
    int taille;

    public Listtaches() {
        this.taille = 7;
        String[] jours = {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
        listeJours = new Tache[taille];
    for (int i = 0; i < taille; i++) {
        listeJours[i] = new Tache();   
        listeJours[i].jour = jours[i];
        listeJours[i].tache = "";
    }
        jourAffiche = 0;
    }

    public void joursuivant() {
        if (jourAffiche == 6) {
            jourAffiche = 0;
        } else {
            jourAffiche += 1;
        }
    }

    public void jourPrecedent() {
        if (jourAffiche == 0) {
            jourAffiche = 6;
        } else {
            jourAffiche -= 1;
        }
    }

    public String nomDuJourAffiche() {
       return listeJours[jourAffiche].jour;
    }

    public String tachesDuJourAffiche() {
        return this.listeJours[jourAffiche].tache;
    }
    public void supprimerToutesLesTaches(){
     for (int i = 0; i < taille; i++) {
            listeJours[i].tache = "";
        }
    }
}
