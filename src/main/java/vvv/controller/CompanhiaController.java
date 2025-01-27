package controller;

import java.time.LocalDate;

import dao.CompanhiaDAO;
import model.Companhia;

public class CompanhiaController {

    private CompanhiaDAO companhiaDAO;

    public CompanhiaController(){
        this.companhiaDAO = new CompanhiaDAO();
    }

    public boolean cadastrarCompanhia(String nome, String cnpj){
        
        try {
            LocalDate activatedAt = LocalDate.now();
            Companhia companhia = new Companhia(nome, cnpj, activatedAt);
            companhiaDAO.cadastrarCompanhia(companhia);

            return true;
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }
    }
}
