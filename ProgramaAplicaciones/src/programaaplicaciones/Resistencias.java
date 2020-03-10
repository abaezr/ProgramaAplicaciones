package programaaplicaciones;

import java.awt.Color;
import static java.lang.Math.pow;
import javax.swing.JOptionPane;

public class Resistencias extends javax.swing.JFrame {
    Color cafe = new Color(92, 63, 9);
    Color violeta = new Color(90, 16, 114);
    Color fondo = new Color(9, 72, 111);
    Color verde = new Color(21, 98, 8);
    Color dorado = new Color(205, 180, 68);
    Color plata = new Color(229, 228, 227);
  CalculoResistencia res = new CalculoResistencia();
    public Resistencias() {
        initComponents();
        this.getContentPane().setBackground(fondo);
        this.setLocationRelativeTo(null);
        this.banda1.setOpaque(true);
        this.banda1.setBackground(Color.white);
        this.banda2.setOpaque(true);
        this.banda2.setBackground(Color.white);
        this.multiplicador.setOpaque(true);
        this.multiplicador.setBackground(Color.white);
        this.tolerancia.setOpaque(true);
        this.tolerancia.setBackground(Color.white);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBoxBanda1 = new javax.swing.JComboBox<>();
        banda1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        banda2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        multiplicador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tolerancia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxBanda2 = new javax.swing.JComboBox<>();
        jComboBoxMultiplicador = new javax.swing.JComboBox<>();
        jComboBoxTolerancia = new javax.swing.JComboBox<>();
        botonGenerarValor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTolerancia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxBanda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banda No. 1", "Negro", "Café", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jComboBoxBanda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBanda1ActionPerformed(evt);
            }
        });

        banda1.setBackground(new java.awt.Color(255, 51, 51));
        banda1.setText(" ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte1Resistencia.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte2Resistencia.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte3Resistencia.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte4Resistencia.png"))); // NOI18N

        tolerancia.setBackground(new java.awt.Color(255, 51, 51));
        tolerancia.setText(" ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte5Resistencia.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("VALOR DE RESISTENCIA POR CODIGO DE COLORES");

        jComboBoxBanda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banda No. 2", "Negro", "Café", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jComboBoxBanda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBanda2ActionPerformed(evt);
            }
        });

        jComboBoxMultiplicador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Multiplicador", "Negro", "Café", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jComboBoxMultiplicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMultiplicadorActionPerformed(evt);
            }
        });

        jComboBoxTolerancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tolerancia", "Dorado", "Plata", "Café", "Rojo", " " }));
        jComboBoxTolerancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxToleranciaActionPerformed(evt);
            }
        });

        botonGenerarValor.setText("GENERAR VALOR");
        botonGenerarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarValorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel7.setText("VALOR RESISTENCIA:");

        labelValor.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelValor.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setText("TOLERANCIA           :");

        labelTolerancia.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelTolerancia.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(banda1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(banda2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jComboBoxBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(botonGenerarValor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(banda1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(banda2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGenerarValor))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxBanda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBanda1ActionPerformed
        // TODO add your handling code here:
        if(jComboBoxBanda1.getSelectedIndex()==1)
         this.banda1.setBackground(Color.black); 
        if(jComboBoxBanda1.getSelectedIndex()==2)
         this.banda1.setBackground(cafe); 
        if(jComboBoxBanda1.getSelectedIndex()==3)
         this.banda1.setBackground(Color.red); 
        if(jComboBoxBanda1.getSelectedIndex()==4)
         this.banda1.setBackground(Color.orange); 
        if(jComboBoxBanda1.getSelectedIndex()==5)
         this.banda1.setBackground(Color.yellow); 
        if(jComboBoxBanda1.getSelectedIndex()==6)
         this.banda1.setBackground(verde); 
        if(jComboBoxBanda1.getSelectedIndex()==7)
         this.banda1.setBackground(Color.blue); 
        if(jComboBoxBanda1.getSelectedIndex()==8)
         this.banda1.setBackground(violeta);     
        if(jComboBoxBanda1.getSelectedIndex()==9)
         this.banda1.setBackground(Color.gray); 
        if(jComboBoxBanda1.getSelectedIndex()==8)
         this.banda1.setBackground(Color.white); 
    }//GEN-LAST:event_jComboBoxBanda1ActionPerformed

    private void botonGenerarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarValorActionPerformed
       if(jComboBoxBanda1.getSelectedIndex() == 0){
           JOptionPane.showMessageDialog(null, "Ingrese un color en la Banda No. 1");
           labelValor.setText("");
           labelTolerancia.setText("");
       }
       if(jComboBoxBanda2.getSelectedIndex() == 0){
           JOptionPane.showMessageDialog(null, "Ingresar un color en la Banda No. 2");
           labelValor.setText("");
           labelTolerancia.setText("");
       }
       if(jComboBoxMultiplicador.getSelectedIndex() == 0){
           JOptionPane.showMessageDialog(null, "Ingresar un color en el Multiplicador");
           labelValor.setText("");
           labelTolerancia.setText("");
       }
       if(jComboBoxTolerancia.getSelectedIndex() == 0){
           JOptionPane.showMessageDialog(null, "Ingresar un color en la Tolerancia");
           labelValor.setText("");
           labelTolerancia.setText("");
       }
       else{
       double banda1 = jComboBoxBanda1.getSelectedIndex()-1;
       double banda2 = jComboBoxBanda2.getSelectedIndex()-1;
       double Multiplicador = pow(10.0,jComboBoxMultiplicador.getSelectedIndex()-1);
       double Tolerancia = jComboBoxTolerancia.getSelectedIndex();
       String valor = Double.toString(res.calculoValorResistencia(banda1,banda2,Multiplicador));
       String tolerancia = Double.toString(res.calculoTolerancia(Tolerancia));
       labelValor.setText(""+valor+"Ω");
       labelTolerancia.setText("±"+tolerancia+"%");
       }
    }//GEN-LAST:event_botonGenerarValorActionPerformed

    private void jComboBoxBanda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBanda2ActionPerformed
         if(jComboBoxBanda2.getSelectedIndex()==1)
         this.banda2.setBackground(Color.black); 
        if(jComboBoxBanda2.getSelectedIndex()==2)
         this.banda2.setBackground(cafe); 
        if(jComboBoxBanda2.getSelectedIndex()==3)
         this.banda2.setBackground(Color.red); 
        if(jComboBoxBanda2.getSelectedIndex()==4)
         this.banda2.setBackground(Color.orange); 
        if(jComboBoxBanda2.getSelectedIndex()==5)
         this.banda2.setBackground(Color.yellow); 
        if(jComboBoxBanda2.getSelectedIndex()==6)
         this.banda2.setBackground(verde); 
        if(jComboBoxBanda2.getSelectedIndex()==7)
         this.banda2.setBackground(Color.blue); 
        if(jComboBoxBanda2.getSelectedIndex()==8)
         this.banda2.setBackground(violeta);     
        if(jComboBoxBanda2.getSelectedIndex()==9)
         this.banda2.setBackground(Color.gray); 
        if(jComboBoxBanda2.getSelectedIndex()==8)
         this.banda2.setBackground(Color.white); 
    }//GEN-LAST:event_jComboBoxBanda2ActionPerformed

    private void jComboBoxMultiplicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMultiplicadorActionPerformed
          if(jComboBoxMultiplicador.getSelectedIndex()==1)
         this.multiplicador.setBackground(Color.black); 
        if(jComboBoxMultiplicador.getSelectedIndex()==2)
         this.multiplicador.setBackground(cafe); 
        if(jComboBoxMultiplicador.getSelectedIndex()==3)
         this.multiplicador.setBackground(Color.red); 
        if(jComboBoxMultiplicador.getSelectedIndex()==4)
         this.multiplicador.setBackground(Color.orange); 
        if(jComboBoxMultiplicador.getSelectedIndex()==5)
         this.multiplicador.setBackground(Color.yellow); 
        if(jComboBoxMultiplicador.getSelectedIndex()==6)
         this.multiplicador.setBackground(verde); 
        if(jComboBoxMultiplicador.getSelectedIndex()==7)
         this.multiplicador.setBackground(Color.blue); 
        if(jComboBoxMultiplicador.getSelectedIndex()==8)
         this.multiplicador.setBackground(violeta);     
        if(jComboBoxMultiplicador.getSelectedIndex()==9)
         this.multiplicador.setBackground(Color.gray); 
        if(jComboBoxMultiplicador.getSelectedIndex()==8)
         this.multiplicador.setBackground(Color.white); 
    }//GEN-LAST:event_jComboBoxMultiplicadorActionPerformed

    private void jComboBoxToleranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxToleranciaActionPerformed
        if(jComboBoxTolerancia.getSelectedIndex()==1)
         this.tolerancia.setBackground(dorado); 
        if(jComboBoxTolerancia.getSelectedIndex()==2)
         this.tolerancia.setBackground(plata); 
        if(jComboBoxTolerancia.getSelectedIndex()==3)
         this.tolerancia.setBackground(cafe); 
        if(jComboBoxTolerancia.getSelectedIndex()==4)
         this.tolerancia.setBackground(Color.red); 
         
    }//GEN-LAST:event_jComboBoxToleranciaActionPerformed

    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(() -> {
            new Resistencias().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banda1;
    private javax.swing.JLabel banda2;
    private javax.swing.JButton botonGenerarValor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBoxBanda1;
    private javax.swing.JComboBox<String> jComboBoxBanda2;
    private javax.swing.JComboBox<String> jComboBoxMultiplicador;
    private javax.swing.JComboBox<String> jComboBoxTolerancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelTolerancia;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel multiplicador;
    private javax.swing.JLabel tolerancia;
    // End of variables declaration//GEN-END:variables
}

