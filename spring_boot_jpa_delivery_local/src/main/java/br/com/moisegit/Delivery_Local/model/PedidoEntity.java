package br.com.moisegit.Delivery_Local.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Builder
@Data
@Entity(name = "pedidos")
@NoArgsConstructor
@AllArgsConstructor
public class PedidoEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(nullable = false)
    private String nomedoitem;
    @Column(nullable = false)
    private int quantidade;
    private BigDecimal valorTotal;

    @CreationTimestamp
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private RestauranteEntity restaurante;

    @ManyToOne
    @JoinColumn(name = "entregador_id")
    private EntregadorEntity entregador;

    @ManyToMany
    @JoinTable(
            name = "pedido_entregador",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "entregador_id")
    )
    private Set<EntregadorEntity> entregadores = new HashSet<>();
}
