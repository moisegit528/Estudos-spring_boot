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
@Entity(name = "restaurantes")
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String endereco;
    @Column(unique = true, nullable = false)
    private String telefone;
    @Column(unique = true, nullable = false)
    private String cnpj;

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @OneToMany(mappedBy = "restaurante")
    private Set<PedidoEntity> pedidosRestaurante = new HashSet<>();

    @ManyToMany(mappedBy = "restaurante")
    private Set<PedidoEntity> pedidosClienteRestaurante = new HashSet<>();
}
