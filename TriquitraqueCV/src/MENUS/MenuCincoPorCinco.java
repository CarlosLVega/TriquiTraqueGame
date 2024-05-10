package MENUS;

import MENUS.TABLEROS.GameCincoPorCinco;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class MenuCincoPorCinco extends javax.swing.JFrame {
    
    Color ColorDeX;
    Color ColorDeO;
    
    public MenuCincoPorCinco() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private GameCincoPorCinco CincoPorCinco;

    public void actualizarTriquitraqueTresPorTres() {
        
        String nombreX = txtNombreX.getText();
        String nombreO = txtNombreO.getText();
        CincoPorCinco.setlbturno1Text(nombreX);
        CincoPorCinco.setlbturno2Text(nombreO);
    }
    
    public Color getColorX() {
    return ColorDeX;
    }

    public Color getColorO() {
        return ColorDeO;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        colorDos = new javax.swing.JLabel();
        txtNombreX = new javax.swing.JTextField();
        txtNombreO = new javax.swing.JTextField();
        player2 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        colorUno = new javax.swing.JLabel();
        ColorJugadorx = new javax.swing.JButton();
        ColorJugadoro = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(11, 37, 89));

        jPanel2.setBackground(new java.awt.Color(11, 37, 89));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 26, 64)));

        colorDos.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        colorDos.setForeground(new java.awt.Color(92, 200, 242));
        colorDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorDos.setText("COLOR");

        player2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(242, 181, 68));
        player2.setText("JUGADOR 2");

        player1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        player1.setForeground(new java.awt.Color(242, 181, 68));
        player1.setText("JUGADOR 1");

        colorUno.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        colorUno.setForeground(new java.awt.Color(92, 200, 242));
        colorUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorUno.setText("COLOR");

        ColorJugadorx.setBackground(new java.awt.Color(11, 37, 89));
        ColorJugadorx.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        ColorJugadorx.setForeground(new java.awt.Color(255, 255, 255));
        ColorJugadorx.setText("ELEGIR");
        ColorJugadorx.setOpaque(true);
        ColorJugadorx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorJugadorxActionPerformed(evt);
            }
        });

        ColorJugadoro.setBackground(new java.awt.Color(11, 37, 89));
        ColorJugadoro.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        ColorJugadoro.setForeground(new java.awt.Color(255, 255, 255));
        ColorJugadoro.setText("ELEGIR");
        ColorJugadoro.setOpaque(true);
        ColorJugadoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorJugadoroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreX, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(player1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(player2)
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ColorJugadorx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ColorJugadoro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1)
                    .addComponent(player2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorUno)
                    .addComponent(colorDos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorJugadorx)
                    .addComponent(ColorJugadoro))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Titulo.setFont(new java.awt.Font("OCR A Extended", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(242, 181, 68));
        Titulo.setText("TRIQUITRAQUE");

        jButton3.setBackground(new java.awt.Color(11, 55, 140));
        jButton3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("INICIO");
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(11, 55, 140));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INICIAR");
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton3)
                .addGap(36, 36, 36)
                .addComponent(Titulo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jButton2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Titulo)))
                .addGap(59, 59, 59)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton2))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 517, 451));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (txtNombreX.getText().isEmpty() || txtNombreO.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa Ambos Nombres :)");
        return;
    }
        if (ColorDeX == null || ColorDeO == null) {
        JOptionPane.showMessageDialog(this, "Seleciona Ambos Colores :)");
        return;
    }
        String nombreX = txtNombreX.getText();
        String nombreO = txtNombreO.getText();
        GameCincoPorCinco Gam = new GameCincoPorCinco();
        Gam.setlbturno1Text(nombreX);
        Gam.setlbturno2Text(nombreO);
        Gam.setColorX(ColorDeX);
        Gam.setColorO(ColorDeO);
        Gam.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                MenuPrincipal Gam = new MenuPrincipal();
                Gam.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ColorJugadorxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadorxActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Color del Jugador X", ColorDeX);

        if (nuevoColor != null) {
            ColorDeX = nuevoColor;
        } else {
            System.out.println("Falta Color para X");
        }
    }//GEN-LAST:event_ColorJugadorxActionPerformed

    private void ColorJugadoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadoroActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Color del Jugador O", ColorDeO);

        if (nuevoColor != null) {
            ColorDeO = nuevoColor;
        } else {
            System.out.println("Falta Color para O");
        }
    }//GEN-LAST:event_ColorJugadoroActionPerformed
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCincoPorCinco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColorJugadoro;
    private javax.swing.JButton ColorJugadorx;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel colorDos;
    private javax.swing.JLabel colorUno;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JTextField txtNombreO;
    private javax.swing.JTextField txtNombreX;
    // End of variables declaration//GEN-END:variables
}
