package br.com.moisegit.Delivery_Local.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Builder
@Data
@Entity(name = "entregador")
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(nullable = false, unique = true)
    private int cpf;
    @Column(unique = true, nullable = false)
    private int rg;
    @Column(nullable = false, unique = true)
    private int telefone;
    private String nome;
    private String tipoveiculo;
    @Column(unique = true, nullable = false)
    private String placa;

    @CreationTimestamp
    private LocalDateTime CadastroEntregador;

    @OneToMany(mappedBy = "entregador")
    private Set<PedidoEntity>  pedidosEntregador = new HashSet<>();

    @ManyToMany(mappedBy = "entregadores")
    private Set<PedidoEntity> pedidosClienteEntregadores = new HashSet<>();

}
