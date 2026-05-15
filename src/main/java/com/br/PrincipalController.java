package com.br;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class PrincipalController {

    public Button sair;

    public void clicarBotao(ActionEvent actionEvent) {
        System.out.println("saindo...");
        System.exit(0);
    }
}
