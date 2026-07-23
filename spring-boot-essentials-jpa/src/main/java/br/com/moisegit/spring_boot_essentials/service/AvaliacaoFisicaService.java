package br.com.moisegit.spring_boot_essentials.service;

import br.com.moisegit.spring_boot_essentials.dto.AvaliacaoFisicaDto;
import br.com.moisegit.spring_boot_essentials.exception.BadRequestException;
import br.com.moisegit.spring_boot_essentials.exception.NotFoundException;
import br.com.moisegit.spring_boot_essentials.model.AlunosEntity;
import br.com.moisegit.spring_boot_essentials.model.AvaliacoesFisicasEntity;
import br.com.moisegit.spring_boot_essentials.repository.AlunosRepository;
import br.com.moisegit.spring_boot_essentials.repository.AvaliacoesFisicasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaService {

    private final AlunosRepository alunosRepository;
    private final AvaliacoesFisicasRepository avaliacoesFisicasRepository;

    public void criarAvaliacaoFisica(AvaliacaoFisicaDto avaliacaoFisicaDto) throws NotFoundException, BadRequestException {
         AlunosEntity aluno = alunosRepository.findById(avaliacaoFisicaDto.getAlunoId())
                .orElseThrow(() -> new NotFoundException("Aluno não encontrado"));

        AvaliacoesFisicasEntity avaliacaoFisica = aluno.getAvaliacaoFisica();
        if (avaliacaoFisica != null) {
            throw new BadRequestException("Avaliação física já cadastrada para este aluno");
        }

        avaliacaoFisica = AvaliacoesFisicasEntity.builder()
                .peso(avaliacaoFisicaDto.getPeso())
                .altura(avaliacaoFisicaDto.getAltura())
                .porcentagemGorduralCorporal(avaliacaoFisicaDto.getPercentualGorduraCorporal())
                .build();

        aluno.setAvaliacaoFisica(avaliacaoFisica);
        alunosRepository.save(aluno);
    }
}

