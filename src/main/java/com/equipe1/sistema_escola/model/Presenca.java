package com.equipe1.sistema_escola.model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_presenca")
    private Date datapresenca;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatapresenca() {
        return datapresenca;
    }

    public void setDatapresenca(Date datapresenca) {
        this.datapresenca = datapresenca;
    }
}