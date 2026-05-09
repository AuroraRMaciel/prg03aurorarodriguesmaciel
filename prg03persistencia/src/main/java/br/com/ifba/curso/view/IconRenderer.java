package br.com.ifba.curso.view;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class IconRenderer extends DefaultTableCellRenderer {
    private ImageIcon icon;

    public IconRenderer(String path) {
        // Busca o ícone no local que confirmamos no seu log anterior
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            this.icon = new ImageIcon(imgURL);
        }
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        label.setIcon(icon); // Define o ícone (lixeira ou lápis)
        label.setText("");   // Remove qualquer texto da célula
        label.setHorizontalAlignment(JLabel.CENTER); // Centraliza o ícone
        
        return label;
    }
}