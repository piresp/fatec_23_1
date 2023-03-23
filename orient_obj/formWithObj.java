public class Client {
    private String name;
    private String cpf;
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCpf(){
        return this.cpf;
    }
}
  public class ClientFrame extends javax.swing.JFrame {
    private Client client = new Client();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        client.setName(txtName.getText());
        client.setCpf(txtCpf.getText());
        
        txtName.setText("");
        txtCpf.setText("");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JOptionPane.showMessageDialog(rootPane, "Name " + client.getName() + "\nCpf: " + client.getCpf());
    }
  }
