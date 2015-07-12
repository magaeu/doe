package com.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.database.DoacaoDao;
import com.models.Doacao;

@ManagedBean(name = "doacaoBean")
public class DoacaoBean {
	
    private Doacao doacao = new Doacao();
    private List<Doacao> doacoes;
    
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

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}


}
