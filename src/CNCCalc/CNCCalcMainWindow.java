/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CNCCalc;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author matsandersson
 */
public class CNCCalcMainWindow extends javax.swing.JFrame {

    static final String floatRegex = "[-+]?[0-9]*\\.?[0-9]+";
    static final String[] opMenuSelections = { "Addition",
                                               "Multiplikation",
                                               "Division",
                                               "Spegla",
                                               "Rotera 90+"    };


    enum OpType { ADD, MULTIPLY, DIVIDE, MIRROR, ROTATE90P, NONE };
    
    static final OpType[] operationTypes = { OpType.ADD,
                                             OpType.MULTIPLY,
                                             OpType.DIVIDE,
                                             OpType.MIRROR,
                                             OpType.ROTATE90P
    };
    
    /**
     * Creates new form CNCCalcMainWindow
     */
    public CNCCalcMainWindow() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTaInputArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTaOutputArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTfAdress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTfValue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCbOperation = new javax.swing.JComboBox();
        jBtnCalculate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBtnMoveTo1st = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTaInputArea.setColumns(20);
        jTaInputArea.setRows(5);
        jTaInputArea.setDragEnabled(true);
        jScrollPane1.setViewportView(jTaInputArea);

        jTaOutputArea.setColumns(20);
        jTaOutputArea.setRows(5);
        jTaOutputArea.setDragEnabled(true);
        jScrollPane2.setViewportView(jTaOutputArea);

        jLabel1.setText("Adress");

        jTfAdress.setText("X");

        jLabel2.setText("Värde");

        jTfValue.setText("0.0");

        jLabel3.setText("Operation");

        jCbOperation.setModel(new DefaultComboBoxModel(opMenuSelections));

        jBtnCalculate.setText("Räkna!");
        jBtnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalculateActionPerformed(evt);
            }
        });

        jLabel4.setText("CNCCalc 0.1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTfAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(867, 867, 867))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTfValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCbOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCalculate)
                    .addComponent(jLabel4)))
        );

        jLabel5.setText("Startkod");

        jLabel6.setText("Beräknad kod");

        jBtnMoveTo1st.setText("<--");
        jBtnMoveTo1st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMoveTo1stActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnMoveTo1st)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(437, 437, 437))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jBtnMoveTo1st)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalculateActionPerformed
        calculate();
    }//GEN-LAST:event_jBtnCalculateActionPerformed

    private void jBtnMoveTo1stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMoveTo1stActionPerformed
        jTaInputArea.setText(jTaOutputArea.getText());
        jTaOutputArea.setText("");
        
    }//GEN-LAST:event_jBtnMoveTo1stActionPerformed

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
            java.util.logging.Logger.getLogger(CNCCalcMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CNCCalcMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CNCCalcMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CNCCalcMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CNCCalcMainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCalculate;
    private javax.swing.JButton jBtnMoveTo1st;
    private javax.swing.JComboBox jCbOperation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTaInputArea;
    private javax.swing.JTextArea jTaOutputArea;
    private javax.swing.JTextField jTfAdress;
    private javax.swing.JTextField jTfValue;
    // End of variables declaration//GEN-END:variables


    private OpType getOperation() {
        String selItem = (String) jCbOperation.getSelectedItem();
        for ( int i = 0 ; i < opMenuSelections.length ; i++ ) {
            if ( selItem.equals( opMenuSelections[i]) ) {
                return operationTypes[i];
            }
        }
        return OpType.NONE;
    }

    private String swapCodes(String line, String s1, String s2) {
        String placeHolder = "§§§";
        line = line.replaceAll(s1, placeHolder);
        line = line.replaceAll(s2, s1);
        line = line.replaceAll(placeHolder, s2);
        return line;
    }

    
    private void calculate() {
        OpType operation = getOperation();
        switch (operation ) {
            case MIRROR : 
                mirror();
                break;
            case ROTATE90P : 
                rotate90p();
                break;
            default :
                aritCalc();
        }
    }
    
    private String reCalcLine(String line, String address, Pattern regexPattern, OpType operation) {
        Matcher m = regexPattern.matcher(line);
        String resultLine = line;
        double numberToAdd = Double.parseDouble(jTfValue.getText());
        boolean found = false;
        int relIndex = 0;
        while ( m.find() ) {
            found = true;
            String s = m.group();
            resultLine = resultLine.substring(0, m.start()+relIndex);
            //System.out.println("Hittat " + ncLetter + " : " + s );
            s = address + operateOnNumber(s.substring(1) , numberToAdd, operation );
            relIndex += s.length() - m.end() + m.start() ;
            //System.out.println("Ändrat till : " + s );
            resultLine += s + line.substring(m.end(), line.length() );
        }
        if ( !found ) return line;
        else return resultLine;
    }

    private String operateOnNumber(String numString, double value, OpType operation) {
        Double number = Double.parseDouble(numString);
        switch (operation ) {
            case ADD :
                number += value ;
                break;
            case MULTIPLY : 
                number *= value;
                break;
            case DIVIDE :
                number /= value;
                break;
            case MIRROR :
                number = -number;
                break;
            default : ;
        }
        numString = new DecimalFormat("#0.0###").format(number);

        return numString.replaceAll(",", ".");
    }

    private void aritCalc() {
        String address = jTfAdress.getText();
        String regex = address + floatRegex ;
        Pattern regexPattern = Pattern.compile(regex);
        OpType operation = getOperation();
        for (String line : jTaInputArea.getText().split("\\n")) {
            System.out.println("Före :" + line);
            line = reCalcLine(line, address, regexPattern, operation );
            jTaOutputArea.append( line + "\n" );
            System.out.println("Efter :" + line);

        }

    }

    
    private void mirror() {
        String mirrorAxis = jTfAdress.getText();
        String mirrorAxisRegex = mirrorAxis + floatRegex;
        Pattern mARegexPattern = Pattern.compile(mirrorAxisRegex);
        
        String ijkAdress;
        switch ( mirrorAxis ) {
            case "X" :
                ijkAdress = "I";
                break;
            case "Y" :
                ijkAdress = "J";
                break;
            case "Z" :
                ijkAdress = "K";
                break;
            default : 
                ijkAdress = "";
        }
        
        String arcCenterAxisRegex = ijkAdress + floatRegex;
        Pattern aCRegexPattern = Pattern.compile(arcCenterAxisRegex);
        
        for (String line : jTaInputArea.getText().split("\\n")) {
            System.out.println("Före :" + line);
            line = reCalcLine(line, mirrorAxis, mARegexPattern, OpType.MIRROR);

            // Change G41 to G42 and vv
            line = swapCodes( line, "G41", "G42");

            // Change G02 to G03 and vv
            line = swapCodes(line, "G2", "G3");
            line = swapCodes(line, "G02", "G03");
            
            line = reCalcLine(line, ijkAdress, aCRegexPattern, OpType.MIRROR );
            
            jTaOutputArea.append(line + "\n");
            System.out.println("Efter :" + line);
        }

    }
    
    
    private void rotate90p() {
        RotateInfo rotateInfo = new RotateInfo( jTfAdress.getText());


        for (String line : jTaInputArea.getText().split("\\n")) {
            System.out.println("Före :" + line);
            line = rotateInfo.rotateLine( line );
            //line = rotateLine(line, rotateInfo);

            jTaOutputArea.append(line + "\n");
            System.out.println("Efter :" + line);
        }

    }
}
