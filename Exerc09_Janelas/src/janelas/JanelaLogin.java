/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janelas;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author 04085453
 */
public class JanelaLogin extends JFrame {

private final JPanel painel = new JPanel(); 
private final BoxLayout layoutPainel = new BoxLayout(painel, BoxLayout.PAGE_AXIS);
private final JLabel txtLogin = new JLabel("Informe os seus dados: ");
private final JLabel txtEmail = new JLabel("E-mail: "); 
private final JLabel txtSenha = new JLabel("senha: ");
private final JTextField campoEmail = new JTextField(20);
private final JPasswordField campoSenha = new JPasswordField(20);
private final JButton botaoOK = new JButton("Entrar");

JanelaLogin(){
painel.setLayout(layoutPainel);
campoEmail.setMaximumSize(campoEmail.getPreferredSize());
campoSenha.setMaximumSize(campoSenha.getPreferredSize());
txtLogin.setAlignmentX(CENTER_ALIGNMENT);
txtEmail.setAlignmentX(CENTER_ALIGNMENT);
txtSenha.setAlignmentX(CENTER_ALIGNMENT);
campoEmail.setAlignmentX(CENTER_ALIGNMENT);
campoSenha.setAlignmentX(CENTER_ALIGNMENT);
botaoOK.setAlignmentX(CENTER_ALIGNMENT);
painel.add(txtLogin);
painel.add(txtEmail);
painel.add(campoEmail);
painel.add(txtSenha);
painel.add(campoSenha);
painel.add(botaoOK);






}




}







   
   
    
