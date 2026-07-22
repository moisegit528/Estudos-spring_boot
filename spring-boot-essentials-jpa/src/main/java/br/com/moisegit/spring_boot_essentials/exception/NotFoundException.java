package br.com.moisegit.spring_boot_essentials.exception;

//Exception class do java (que já existe na biblioteca padrão java.lang)
public class NotFoundException extends Exception{
    public NotFoundException(String message) {
        super(message);
    // pega o "message" repassa para o construtor e armazena, e aí pode ser exibida em ‘logs’.
    }
}
