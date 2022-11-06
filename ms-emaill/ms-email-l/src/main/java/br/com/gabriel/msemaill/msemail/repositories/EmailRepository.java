package br.com.gabriel.msemaill.msemail.repositories;

import br.com.gabriel.msemaill.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {


}
