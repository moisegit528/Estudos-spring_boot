package br.com.moisegit.spring_boot_essentials.service;

import br.com.moisegit.spring_boot_essentials.repository.AlunosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlunosService {

    private final AlunosRepository alunosRepository;


}
