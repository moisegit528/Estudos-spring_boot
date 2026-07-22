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

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(unique = true, nullable = false)
    private String cpf;
    private String nome;
    private String endereco;
    @Column(unique = true, nullable = false)
    private String telefone;

    @CreationTimestamp
    private LocalDateTime CadastroCliente;


    @OneToMany(mappedBy = "cliente")
    private Set<PedidoEntity> pedidosCliente = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "cliente_restaurante",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurante_id")
    )
    private Set<RestauranteEntity> restaurante = new HashSet<>();

}
