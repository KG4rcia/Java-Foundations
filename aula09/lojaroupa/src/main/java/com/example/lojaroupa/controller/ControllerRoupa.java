package com.example.lojaroupa.controller;

import org.springframework.web.bind.annotation.*;

// Controlller - Responsável por receber as requisições em HTTP
// Rest - API Rest

// Funcionamento da API REST - Ela usa metodos HTTP para definir ações:
// Metodo GET -> Busca dados.
// Metodo POST -> Criar dados.
// Metodo PUT -> Atualizar dados.
// Metodo DELETE -> Remover/excluir dados.

@RestController
// Define o URL do Controller
// Nosso controler terá o seguinte Endpoint:
// http://localhost:8080/roupas
@RequestMapping("/roupas")
// Liberar acesso:
@CrossOrigin(origins = "*")
public class ControllerRoupa {

    // Registrar uma roupa no banco:
    @PostMapping
    public void cadastrarRoupa(@RequestBody String roupa) {
        System.out.println(roupa);
    }

}
