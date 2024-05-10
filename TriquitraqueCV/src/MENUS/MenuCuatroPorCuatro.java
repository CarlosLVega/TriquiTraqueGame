package MENUS;

import MENUS.TABLEROS.GameCuatroPorCuatro;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class MenuCuatroPorCuatro extends javax.swing.JFrame {
    
    Color ColorParaX;
    Color ColorParaO;
    
    public MenuCuatroPorCuatro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private GameCuatroPorCuatro CuatroPorCuatro;

    public void actualizarTriquitraqueTresPorTres() {
        
        String nombreX = Nombre1.getText();
        String nombreO = Nombre2.getText();
        CuatroPorCuatro.setlbturno1Text(nombreX);
        CuatroPorCuatro.setlbturno2Text(nombreO);
    }
    
    public Color getColorX() {
    return ColorParaX;
    }

    public Color getColorO() {
        return ColorParaO;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Player2 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JTextField();
        Nombre2 = new javax.swing.JTextField();
        Player2G = new javax.swing.JLabel();
        Player1G = new javax.swing.JLabel();
        Player3 = new javax.swing.JLabel();
        ColorJugadorx = new javax.swing.JButton();
        ColorJugadoro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(11, 37, 89));

        jPanel2.setBackground(new java.awt.Color(11, 37, 89));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 26, 64)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Player2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        Player2.setForeground(new java.awt.Color(92, 200, 242));
        Player2.setText("COLOR");
        jPanel2.add(Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));
        jPanel2.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 198, 33));
        jPanel2.add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 198, 33));

        Player2G.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        Player2G.setForeground(new java.awt.Color(242, 181, 68));
        Player2G.setText("JUGADOR 2");
        jPanel2.add(Player2G, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        Player1G.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        Player1G.setForeground(new java.awt.Color(242, 181, 68));
        Player1G.setText("JUGADOR 1");
        jPanel2.add(Player1G, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        Player3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        Player3.setForeground(new java.awt.Color(92, 200, 242));
        Player3.setText("COLOR");
        jPanel2.add(Player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        ColorJugadorx.setBackground(new java.awt.Color(27, 55, 140));
        ColorJugadorx.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        ColorJugadorx.setForeground(new java.awt.Color(255, 255, 255));
        ColorJugadorx.setText("ELEGIR");
        ColorJugadorx.setOpaque(true);
        ColorJugadorx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorJugadorxActionPerformed(evt);
            }
        });
        jPanel2.add(ColorJugadorx, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        ColorJugadoro.setBackground(new java.awt.Color(27, 55, 140));
        ColorJugadoro.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        ColorJugadoro.setForeground(new java.awt.Color(255, 255, 255));
        ColorJugadoro.setText("ELEGIR");
        ColorJugadoro.setOpaque(true);
        ColorJugadoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorJugadoroActionPerformed(evt);
            }
        });
        jPanel2.add(ColorJugadoro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jButton2.setBackground(new java.awt.Color(27, 55, 140));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INICIAR");
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(27, 55, 140));
        jButton3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("INICIO");
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("OCR A Extended", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(242, 181, 68));
        Titulo.setText("TRIQUITRAQUE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(Titulo))
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (Nombre1.getText().isEmpty() || Nombre2.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa Ambos Nombres :)");
        return;
    }
        if (ColorParaX == null || ColorParaO == null) {
        JOptionPane.showMessageDialog(this, "Seleciona Ambos Colores :)");
        return;
    }
        String nombreX = Nombre1.getText();
        String nombreO = Nombre2.getText();
        GameCuatroPorCuatro Gam = new GameCuatroPorCuatro();
        Gam.setlbturno1Text(nombreX);
        Gam.setlbturno2Text(nombreO);
        Gam.setColorX(ColorParaX);
        Gam.setColorO(ColorParaO);
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
        Color nuevoColor = JColorChooser.showDialog(null, "Color del Jugador X", ColorParaX);

        if (nuevoColor != null) {
            ColorParaX = nuevoColor;
        } else {
            System.out.println("Falta Color para X");
        }
    }//GEN-LAST:event_ColorJugadorxActionPerformed

    private void ColorJugadoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadoroActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Color del Jugador O", ColorParaO);

        if (nuevoColor != null) {
            ColorParaO = nuevoColor;
        } else {
            System.out.println("Falta Color para O");
        }
    }//GEN-LAST:event_ColorJugadoroActionPerformed
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCuatroPorCuatro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColorJugadoro;
    private javax.swing.JButton ColorJugadorx;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JTextField Nombre2;
    private javax.swing.JLabel Player1G;
    private javax.swing.JLabel Player2;
    private javax.swing.JLabel Player2G;
    private javax.swing.JLabel Player3;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
