package exerc11_janelas;

import janelas.JanelaLogin;
import java.awt.Color;
import javax.swing.JFrame;

public class Exerc11_Janelas {
    
    public static void main(String[] args) {
        // DONE 01 - crie aqui um objeto da classe JanelaLogin de nome janelaLogin
        JanelaLogin janelaLogin = new JanelaLogin();
        // DONE 02 - através do objeto janelaLogin, acesse o método setSize 
        ////////// e passe os seguintes valores: 300, 300
        janelaLogin.setSize(300, 300);
        janelaLogin.setBackground(Color.yellow);
        
        // DONE 03 - através do objeto janelaLogin, acesse o método setDefaultCloseOperation 
        ////////// e passe o seguinte valor: JFrame.EXIT_ON_CLOSE (realize importação)
        janelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // DONE 04 - através do objeto janelaLogin, acesse o método setVisible 
        ////////// e passe o seguinte valor: true
        janelaLogin.setVisible(true);
        // TODO 05 - execute o projeto, digite valores nos campos e clique no botão!
        ////////// o que acontece?

    }
    
}
