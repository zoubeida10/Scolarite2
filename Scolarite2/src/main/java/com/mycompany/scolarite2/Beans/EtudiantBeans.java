/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.Beans;

import com.mycompany.scolarite2.data.Etudiant;
import com.mycompany.scolarite2.serviceInterface.IEtudiantService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author SANDA FIROS
 */

@ManagedBean
@RequestScoped
public class EtudiantBeans {
    
      
    @ManagedProperty(value = "#{IEtudiantService}")
    IEtudiantService iEtudiantService;
    
    Etudiant etudiant = new Etudiant();

    public EtudiantBeans(IEtudiantService iEtudiantService) {
        this.iEtudiantService = iEtudiantService;
    }

    public IEtudiantService getiEtudiantService() {
        return iEtudiantService;
    }

    public void setiEtudiantService(IEtudiantService iEtudiantService) {
        this.iEtudiantService = iEtudiantService;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    
      public Etudiant createEtudiant() throws ServiceException{

        return iEtudiantService.createEtudiant(etudiant);
    }
   public Etudiant updateEtudiant() throws ServiceException{
       return iEtudiantService.updateEtudiant(etudiant);
   }
   public void deleteEtudiant() throws ServiceException{
       iEtudiantService.deleteEtudiant(etudiant);
   }
   public Etudiant findEtudiantById() throws ServiceException{
     return iEtudiantService.findEtudiantById(etudiant.getId());
   }
   public List<Etudiant> findAllEtudiant() throws ServiceException{
     return iEtudiantService.findAllEtudiant();
   }
    
}
