package com.kasai.Senai.Interface;

import com.kasai.Senai.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {

}