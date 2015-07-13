package com.controllers;

import javax.faces.bean.ManagedBean;

import com.database.DoacaoDao;
import com.models.Doacao;

@ManagedBean(name = "doacaoBean")
public class DoacaoBean {
	
    private Doacao doacao = new Doacao();
    
    public void doar() {
          
    		DoacaoDao doacaoDao = new DoacaoDao();
    		doacaoDao.inserir(this.doacao);
    }

    public Doacao getDoacao() {
          return this.doacao;
    }

    public void setDoacao(Doacao doacao) {
          this.doacao = doacao;
    }

}
