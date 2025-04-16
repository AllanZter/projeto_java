
package br.com.sistema.ultilitarios;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ultilitarios {
    public void limparTela(JPanel container){
        Component conponents[] = container.getComponents();
      for(Component component : conponents){
          if(component instanceof JTextField){
              ((JTextField)component).setText(null);
          }
      }
    }
    
}
