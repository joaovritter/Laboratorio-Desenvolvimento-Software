/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author salam
 */
public class View_HistoricoEmprestimo {
    private int idHistorico;
    private int idEmprestimo;
    private String responsavel;
    private String item;
    private String status;
    private Date dataAtualizacao;

    public View_HistoricoEmprestimo() {}

    public View_HistoricoEmprestimo(int idHistorico, int idEmprestimo, String responsavel, String item, String status, Date dataAtualizacao) {
        this.idHistorico = idHistorico;
        this.idEmprestimo = idEmprestimo;
        this.responsavel = responsavel;
        this.item = item;
        this.status = status;
        this.dataAtualizacao = dataAtualizacao;
    }

    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "HistoricoEmprestimo{" +
                "idHistorico=" + idHistorico +
                ", idEmprestimo=" + idEmprestimo +
                ", responsavel='" + responsavel + '\'' +
                ", item='" + item + '\'' +
                ", status='" + status + '\'' +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final View_HistoricoEmprestimo other = (View_HistoricoEmprestimo) obj;
        if (this.idHistorico != other.idHistorico) {
            return false;
        }
        if (this.idEmprestimo != other.idEmprestimo) {
            return false;
        }
        if (!Objects.equals(this.responsavel, other.responsavel)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return Objects.equals(this.dataAtualizacao, other.dataAtualizacao);
    }
    
}
