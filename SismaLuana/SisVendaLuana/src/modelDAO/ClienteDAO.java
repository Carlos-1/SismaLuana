package modelDAO;

import controller.ConexaoPostgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Carlos Barromeu
 */
public class ClienteDAO {
    
    private Connection conn = ConexaoPostgres.getConnection();
    
public void cadastrar(Cliente cliente){
        
        //montar a sql
        String sql = "INSERT INTO cliente (nome_cli, endereco_cli, num_cli, com_cli, bairro_cli, cidade_cli, estado_cli, cep_cli, rg_cli, cpf_cli, cnpj_cli, telefone_cli, celular_cli, email_cli) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cliente.getNome_cli());
	pstm.setString(2, cliente.getEndereco_cli());
	pstm.setString(3, cliente.getNumero_cli());
	pstm.setString(4, cliente.getComp_cli());
	pstm.setString(5, cliente.getBairro_cli());
	pstm.setString(6, cliente.getCidade_cli());
	pstm.setString(7, cliente.getUf_cli());
	pstm.setString(8, cliente.getCep_cli());
	pstm.setString(9, cliente.getRg_cli());
	pstm.setString(10, cliente.getCpf_cli());
	pstm.setString(11, cliente.getCnpj_cli());
	pstm.setString(12, cliente.getFone_cli());
	pstm.setString(13, cliente.getCelular_cli());
	pstm.setString(14, cliente.getEmail_cli());

       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Cliente Cadastrado com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Cliente: " + ex.getMessage());
        } 
    } 
public void alterar(Cliente cliente){
        
        //montar a sql
        String sql = " UPDATE  cliente SET nome_cli=?, endereco_cli=?, num_cli=?, com_cli=?, bairro_cli=?, cidade_cli=?, estado_cli=?, cep_cli=?, rg_cli=?, cpf_cli=?, cnpj_cli=?, telefone_cli=?, celular_cli=?, email_cli=?) WHERE id_for=?";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
	pstm.setString(1, cliente.getNome_cli());
	pstm.setString(2, cliente.getEndereco_cli());
	pstm.setString(3, cliente.getNum_cli());
	pstm.setString(4, cliente.getComp_cli());
	pstm.setString(5, cliente.getBairro_cli());
	pstm.setString(6, cliente.getCidade_cli());
	pstm.setString(7, cliente.getUf_cli());
	pstm.setString(8, cliente.getCep_cli());
	pstm.setString(9, cliente.getRg_cli());
	pstm.setString(10, cliente.getCpf_cli());
	pstm.setString(11, cliente.getCnpj_cli());
	pstm.setString(12, cliente.getFone_cli());
	pstm.setString(13, cliente.getCelular_cli());
	pstm.setString(14, cliente.getEmail_cli());
       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Cliente Atualisado com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualisar Cliente: " + ex.getMessage());
        } 
}
public void excluir(Cliente cliente){
        
        //montar a sql
        String sql = " DELETE FROM cliente WHERE id_cli=?";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
      
        pstm.setInt    (1, cliente.getId_cli());
       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Cliente Excluido com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Cliente: " + ex.getMessage());
        } 
}


public List<Cliente> buscarTodos(){
        
        //montar a sql
        String sql = " SELETE * FROM  cliente ";
        
         List<Cliente> lista = new ArrayList<Cliente>();
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
         
            while(rs.next()){
                Cliente cli = new Cliente();
          	cli.setNome_cli(rs.getString("Nome_cli"));
		cli.setEndereco_cli(rs.getString("Endereco_cli"));
		cli.setNumero_cli(rs.getString("Num_cli"));
		cli.setComp_cli(rs.getString("Com_cli"));
		cli.setBairro_cli(rs.getString("Bairro_cli"));
		cli.setCidade_cli(rs.getString("Cidade_cli"));
		cli.setUf_cli(rs.getString("Estado_cli"));
		cli.setCep_cli(rs.getString("Cep_cli"));
		cli.setRg_cli(rs.getString("Rg_cli"));
		cli.setCpf_cli(rs.getString("Cpf_cli"));
		cli.setCnpj_cli(rs.getString("Cnpj_cli"));
		cli.setFone_cli(rs.getString("Telefone_cli"));
		cli.setCelular_cli(rs.getString("Celular_cli"));
		cli.setEmail_cli(rs.getString("Email_cli"));
                
                lista.add(cli);
            }
       
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Cliente Excluido com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Cliente: " + ex.getMessage());
        } 
return lista;
}
}