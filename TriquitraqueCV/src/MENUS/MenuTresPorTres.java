package MENUS;
import MENUS.TABLEROS.GameTresPorTres;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class MenuTresPorTres extends javax.swing.JFrame {
    
    Color JugadorUnoColor;
    Color JugadorDosColor;
    
    public MenuTresPorTres() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private GameTresPorTres TresPorTres;

    public void actualizarTriquitraqueTresPorTres() {
        
        String nombreX = JugadorUnoNombre.getText();
        String nombreO = JugadorDosNombre.getText();
        TresPorTres.setlbturno1Text(nombreX);
        TresPorTres.setlbturno2Text(nombreO);
    }
    
    public Color getColorX() {
    return JugadorUnoColor;
    }

    public Color getColorO() {
        return JugadorDosColor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ColorDos = new javax.swing.JLabel();
        JugadorUnoNombre = new javax.swing.JTextField();
        JugadorDosNombre = new javax.swing.JTextField();
        JugadorDos = new javax.swing.JLabel();
        JugadorUno = new javax.swing.JLabel();
        ColorUno = new javax.swing.JLabel();
        ColorJugadorx = new javax.swing.JButton();
        ColorJugadoro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(11, 37, 89));

        Titulo.setFont(new java.awt.Font("OCR A Extended", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(242, 181, 68));
        Titulo.setText("TRIQUITRAQUE");

        jPanel2.setBackground(new java.awt.Color(11, 37, 89));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 26, 64)));

        ColorDos.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        ColorDos.setForeground(new java.awt.Color(92, 200, 242));
        ColorDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColorDos.setText("COLOR");

        JugadorUnoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorUnoNombreActionPerformed(evt);
            }
        });

        JugadorDosNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorDosNombreActionPerformed(evt);
            }
        });

        JugadorDos.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        JugadorDos.setForeground(new java.awt.Color(242, 181, 68));
        JugadorDos.setText("JUGADOR 2");

        JugadorUno.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        JugadorUno.setForeground(new java.awt.Color(242, 181, 68));
        JugadorUno.setText("JUGADOR 1");

        ColorUno.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        ColorUno.setForeground(new java.awt.Color(92, 200, 242));
        ColorUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColorUno.setText("COLOR");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JugadorUnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(JugadorDosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(JugadorUno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JugadorDos)
                .addGap(54, 54, 54))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ColorJugadorx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ColorJugadoro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ColorUno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ColorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JugadorUno)
                    .addComponent(JugadorDos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JugadorUnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JugadorDosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorUno)
                    .addComponent(ColorDos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorJugadorx)
                    .addComponent(ColorJugadoro))
                .addContainerGap(24, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(Titulo))
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
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
        if (JugadorUnoNombre.getText().isEmpty() || JugadorDosNombre.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa Ambos Nombres :)");
        return;
    }
        if (JugadorUnoColor == null || JugadorDosColor == null) {
        JOptionPane.showMessageDialog(this, "Seleciona Ambos Colores :)");
        return;
    }
        String nombreX = JugadorUnoNombre.getText();
        String nombreO = JugadorDosNombre.getText();
        GameTresPorTres Gam = new GameTresPorTres();
        Gam.setlbturno1Text(nombreX);
        Gam.setlbturno2Text(nombreO);
        Gam.setColorX(JugadorUnoColor);
        Gam.setColorO(JugadorDosColor);
        Gam.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                MenuPrincipal Gam = new MenuPrincipal();
                Gam.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JugadorUnoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorUnoNombreActionPerformed
        // TODO add your handling code here:
        String nombreX = JugadorUnoNombre.getText();
    }//GEN-LAST:event_JugadorUnoNombreActionPerformed

    private void JugadorDosNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorDosNombreActionPerformed
        // TODO add your handling code here:
        String nombreO = JugadorDosNombre.getText();
    }//GEN-LAST:event_JugadorDosNombreActionPerformed

    private void ColorJugadorxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadorxActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Color del Jugador X", JugadorUnoColor);

        if (nuevoColor != null) {
            JugadorUnoColor = nuevoColor;
        } else {
            System.out.println("Falta Color para X");
        }
    }//GEN-LAST:event_ColorJugadorxActionPerformed

    private void ColorJugadoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorJugadoroActionPerformed
        // TODO add your handling code here:
        Color nuevoColor = JColorChooser.showDialog(null, "Color del Jugador O", JugadorDosColor);

        if (nuevoColor != null) {
            JugadorDosColor = nuevoColor;
        } else {
            System.out.println("Falta Color para O");
        }
    }//GEN-LAST:event_ColorJugadoroActionPerformed
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTresPorTres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ColorDos;
    private javax.swing.JButton ColorJugadoro;
    private javax.swing.JButton ColorJugadorx;
    private javax.swing.JLabel ColorUno;
    private javax.swing.JLabel JugadorDos;
    private javax.swing.JTextField JugadorDosNombre;
    private javax.swing.JLabel JugadorUno;
    private javax.swing.JTextField JugadorUnoNombre;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
