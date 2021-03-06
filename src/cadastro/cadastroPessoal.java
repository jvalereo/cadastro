/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.annotation.processing.Messager;

/**
 *
 * @author JONAS
 */
public class cadastroPessoal extends javax.swing.JFrame {

    /**
     * Creates new form cadastroPessoal
     */
    public cadastroPessoal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox();
        jComboBoxPais = new javax.swing.JComboBox();
        jButtonClique = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jTextFieldSexo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Pessoal");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo.setText("CADASTRO PESSOAL");

        jLabelNome.setText("Nome:");

        jLabelSobrenome.setText("Sobrenome:");

        jLabelIdade.setText("Idade: ");

        jLabelCidade.setText("Cidade: ");

        jLabelEstado.setText("Estado: ");

        jLabelPais.setText("Pais: ");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre", "Amap??", "Alagoas", "Amazonas", "Esp??rito Santo", "Goiais", "Mato Grosso", "Minas Gerais", "Mato Grosso", "Maranh??o", "Paran??", "Piau??", "Par??", "Para??ba", "Pernambuco", "S??o Paulo", "Sergipe", "Santa Catarina", "Roraima ", "Rond??nia", "Rio de Janeiro", "Rio Grande do Sul", "Rio Grande do Norte", "Tocantins" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        jComboBoxPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Brasil", "Argentina", "Paraguai", "Chile", "Venezuela", "Uruguai", "Colombia", "Estado Unidos", "Fran??a", "Reino Unido", "Inglaterra", "Alemanha", "M??xico", "Canad??", "Espanha", "Africa", "Haiti", "Nigeria", "Autraliza", "Nova Zel??ndia" }));

        jButtonClique.setText("Clique ");
        jButtonClique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliqueActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar ");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCep.setText("Cep: ");

        jLabelPeso.setText("Peso:");

        jLabelSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSexo.setText("Sexo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClique, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCidade)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addGap(107, 107, 107))
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCidade)
                            .addComponent(jLabelSexo))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSobrenome)
                            .addComponent(jLabelCep)
                            .addComponent(jLabelEstado)
                            .addComponent(jLabelTitulo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldCep, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPais)
                    .addComponent(jTextFieldPeso)
                    .addComponent(jComboBoxPais, 0, 133, Short.MAX_VALUE)
                    .addComponent(jLabelIdade)
                    .addComponent(jLabelPeso)
                    .addComponent(jTextFieldIdade))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCidade)
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCep)
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelIdade)
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPeso)
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClique)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSair))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jButtonCliqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliqueActionPerformed
        //Treinamento - Aula Java, Cadastro Pessoal, tipo string, int, double
        //Jonas Valero - T??cnico em Inform??tica
        
        //declarando as variaveis tipo int, string, double
        
        String nome;
        String sobrenome;
        int idade;
        String cidade;
        String cep;
        double peso;
        String sexo;
        String estado;
        String pais;
        
        //declarando o codigo de entrada, campos jTextField
        
        nome = jTextFieldNome.getText();
        sobrenome = jTextFieldSobrenome.getText();
        idade = Integer.parseInt(jTextFieldIdade.getText());
        cidade = jTextFieldCidade.getText();
        cep = jTextFieldCep.getText();
        peso = Double.parseDouble(jTextFieldPeso.getText());
        sexo = jTextFieldSexo.getText();
        estado = String.valueOf(jComboBoxEstado.getSelectedItem());
        pais = String.valueOf(jComboBoxPais.getSelectedItem());
      
       /*declarando o codigo limpar jTextiField, JComboBox, 
                 focus, quando finalizar cadastro*/
        
        jTextFieldNome.setText(" ");
        jTextFieldSobrenome.setText(" ");
        jTextFieldIdade.setText(" ");
        jTextFieldCidade.setText(" ");
        jTextFieldCep.setText(" ");
        jTextFieldSexo.setText(" ");
        jTextFieldPeso.setText(" ");
        jComboBoxEstado.removeAll();
        jComboBoxPais.removeAll();
        jTextFieldNome.requestFocus();
                  
        
        //Imprimir, saida de dados, no console 
        
        JOptionPane.showMessageDialog(null,"Meu nome: " + nome + " " +  sobrenome);
        JOptionPane.showMessageDialog(null, "Idade: " + idade + " anos");
        JOptionPane.showMessageDialog(null, "Cidade: " + cidade);
        JOptionPane.showMessageDialog(null, "Cep: " + cep);
        JOptionPane.showMessageDialog(null, "Peso: " +  peso+  " Kg");
        JOptionPane.showMessageDialog(null, "Estado: " +  estado);
        JOptionPane.showMessageDialog(null, "Pais: " + pais );
        JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!!!",
                "Messagem", JOptionPane.INFORMATION_MESSAGE);
                
         
                 
    }//GEN-LAST:event_jButtonCliqueActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
      
        //declarando o codigo limpar jTextiField, JComboBox, focus
        
        jTextFieldNome.setText(" ");
        jTextFieldSobrenome.setText(" ");
        jTextFieldIdade.setText(" ");
        jTextFieldCidade.setText(" ");
        jTextFieldCep.setText(" ");
        jTextFieldSexo.setText(" ");
        jTextFieldPeso.setText(" ");
        jComboBoxEstado.removeAll();
        jComboBoxPais.removeAll();
        jTextFieldNome.requestFocus();
        
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
       
        //declarando saida da aplica????o 
        
        System.exit(0);
        
        
        //fim do programa
        
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastroPessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroPessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroPessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroPessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroPessoal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClique;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JComboBox jComboBoxPais;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables
}
