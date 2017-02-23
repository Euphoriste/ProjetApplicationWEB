/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernate;

import java.util.ArrayList;

/**
 *
 * @author Ophelie
 */
public class Utilisateur {
    
    private Integer idUtilisateur;
    private String pseudoUtilisateur;
    private String emailUtilisateur;
    private String motDePasseUtilisateur;
    private ArrayList<Video> videosFavorites;
    
    public Utilisateur(){
        
    }
    
    public Utilisateur(Integer id, String ps, String e, String mdp, ArrayList<Video> v){
        this.idUtilisateur = id;
        this.pseudoUtilisateur = ps;
        this.emailUtilisateur = e;
        this.motDePasseUtilisateur = mdp;
        this.videosFavorites = v;
    }
    
    public Integer getIdUtlisateur(){
        return idUtilisateur;
    }
    
    public String getPseudoUtlisateur(){
        return pseudoUtilisateur;
    }
    
    public String getEmailUtlisateur(){
        return emailUtilisateur;
    }
    
    public String getMotDePasseUtilisateur(){
        return motDePasseUtilisateur;
    }
    
    public ArrayList<Video> getVideosFavorites(){
        return videosFavorites;
    }
    
    public void setIdUtlisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
    
    public void setPseudoUtilisateur(String pseudoUtilisateur) {
        this.pseudoUtilisateur = pseudoUtilisateur;
    }
    
    public void setEmailUtilisateur(String emailUtilisateur) {
        this.emailUtilisateur = emailUtilisateur;
    }
    
    public void setMotDePasseUtilisateur(String motDePasseUtilisateur) {
        this.motDePasseUtilisateur = motDePasseUtilisateur;
    }
     
    public void setVideosFavorites(ArrayList<Video> videosFavorites) {
        this.videosFavorites = videosFavorites;
    }
    
    
    public void mettreEnFavoris(Video video){
        
    }
            
     public void voterUnSousTitre(){
         
     }    
    
     public void proposerSousTitre(){
         
     }
}
