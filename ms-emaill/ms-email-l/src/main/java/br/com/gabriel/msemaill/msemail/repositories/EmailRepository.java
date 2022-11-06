package br.com.gabriel.msemaill.msemail.repositories;

import br.com.gabriel.msemaill.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {




}
