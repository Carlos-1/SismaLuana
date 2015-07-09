package modelDAO;

import controller.ConexaoPostgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;


/**
 *
 * @author Carlos Barromeu
 */
public class FornecedorDAO {
    
    private Connection conn = ConexaoPostgres.getConnection();
    
public void cadastrar(Fornecedor fornecedor){
        
        //montar a sql
        String sql = "INSERT INTO fornecedor (nome_for, endereco_for, num_for, com_for, bairro_for, cidade_for, estado_for, cep_for, rg_for, cpf_for, cnpj_for, telefone_for, celular_for, email_for) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, fornecedor.getNome_for());
	pstm.setString(2, fornecedor.getEndereco_for());
	pstm.setString(3, fornecedor.getNumero_for());
	pstm.setString(4, fornecedor.getComp_for());
	pstm.setString(5, fornecedor.getBairro_for());
	pstm.setString(6, fornecedor.getCidade_for());
	pstm.setString(7, fornecedor.getUf_for());
	pstm.setString(8, fornecedor.getCep_for());
	pstm.setString(9, fornecedor.getRg_for());
	pstm.setString(10, fornecedor.getCpf_for());
	pstm.setString(11, fornecedor.getCnpj_for());
	pstm.setString(12, fornecedor.getFone_for());
	pstm.setString(13, fornecedor.getCelular_for());
	pstm.setString(14, fornecedor.getEmail_for());

       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Fornecedor Cadastrado com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Fornecedor: " + ex.getMessage());
        } 
    } 
public void alterar(Fornecedor fornecedor){
        
        //montar a sql
        String sql = " UPDATE  fornecedor SET nome_for=?, endereco_for=?, num_for=?, com_for=?, bairro_for=?, cidade_for=?, estado_for=?, cep_for=?, rg_for=?, cpf_for=?, cnpj_for=?, telefone_for=?, celular_for=?, email_for=?) WHERE id_for=?";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, fornecedor.getNome_for());
	pstm.setString(2, fornecedor.getEndereco_for());
	pstm.setString(3, fornecedor.getNumero_for());
	pstm.setString(4, fornecedor.getComp_for());
	pstm.setString(5, fornecedor.getBairro_for());
	pstm.setString(6, fornecedor.getCidade_for());
	pstm.setString(7, fornecedor.getUf_for());
	pstm.setString(8, fornecedor.getCep_for());
	pstm.setString(9, fornecedor.getRg_for());
	pstm.setString(10, fornecedor.getCpf_for());
	pstm.setString(11, fornecedor.getCnpj_for());
	pstm.setString(12, fornecedor.getFone_for());
	pstm.setString(13, fornecedor.getCelular_for());
	pstm.setString(14, fornecedor.getEmail_for());
       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Fornecedor Atualisado com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualisar Fornecedor: " + ex.getMessage());
        } 
}
public void excluir(Fornecedor fornecedor){
        
        //montar a sql
        String sql = " DELETE FROM fornecedor WHERE id_for=?";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
      
        pstm.setInt    (1, fornecedor.getId_for());
       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Fornecedor Excluido com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Fornecedor: " + ex.getMessage());
        } 
}

/*
public List<Fornecedor> buscarTodos(){
        
        //montar a sql
        String sql = " SELETE * FROM  fornecedor ";
        
         List<Fornecedor> lista = new ArrayList<Fornecedor>();
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
         
            while(rs.next()){
                Fornecedor for = new Fornecedor();
                for.setNome_for    (rs.getString("Nome_for"));
		for.setEndereco_for(rs.getString("Endereco_for"));
        	for.setNumero_for  (rs.getString("Num_for"));
		for.setComp_for    (rs.getString("Com_for"));
		for.setBairro_for  (rs.getString("Bairro_for"));
		for.setCidade_for  (rs.getString("Cidade_for"));
		for.setUf_for      (rs.getString("Estado_for"));
		for.setCep_for     (rs.getString("Cep_for"));
		for.setRg_for      (rs.getString("Rg_for"));
		for.setCpf_for     (rs.getString("Cpf_for"));
		for.setCnpj_for    (rs.getString("Cnpj_for"));
		for.setFone_for    (rs.getString("Telefone_for"));
		for.setCelular_for (rs.getString("Celular_for"));
		for.setEmail_for   (rs.getString("Email_for"));
                
                lista.add(for);
            }
       
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Fornecedor Excluido com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Fornecedor: " + ex.getMessage());
        } 
return lista;
}  */ 
}