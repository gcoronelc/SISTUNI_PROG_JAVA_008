package pe.egcc.casosapp.view;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class PromedioView extends javax.swing.JInternalFrame {

  /**
   * Creates new form PromedioView
   */
  public PromedioView() {
    initComponents();
    cargarPaneles();
  }
  
  private void cargarPaneles(){
    jTabbedPane1.add("2 Números", new Promedio2NumPanel());
    //jTabbedPane1.add("3 Números", new Promedio3NumPanel());
    //jTabbedPane1.add("4 Números", new Promedio4NumPanel());
    //jTabbedPane1.add("5 Números", new Promedio5NumPanel());
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTabbedPane1 = new javax.swing.JTabbedPane();

    setClosable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("PROMEDIO");

    jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTabbedPane jTabbedPane1;
  // End of variables declaration//GEN-END:variables
}