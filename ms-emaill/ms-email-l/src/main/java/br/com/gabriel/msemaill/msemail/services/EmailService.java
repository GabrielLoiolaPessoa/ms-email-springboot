package br.com.gabriel.msemaill.msemail.services;


import br.com.gabriel.msemaill.msemail.models.EmailModel;
import br.com.gabriel.msemaill.msemail.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {

    }
}
