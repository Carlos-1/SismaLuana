package modelDAO;

import controller.ConexaoPostgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Carlos Barromeu
 */
public class UsuarioDAO {
    
    private Connection conn = ConexaoPostgres.getConnection();
    
public void cadastrar(Usuario usuario){
        
        //montar a sql
        String sql = "INSERT INTO usuario (nome_usu, senha_usu, id_per) VALUES (?, ?, ?)";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, usuario.getNome_usu());
        pstm.setString(2, usuario.getSenha_usu());
        pstm.setInt   (3, usuario.getId_per());
       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Usuário Cadastrado com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Usuário: " + ex.getMessage());
        } 
    } 
public void alterar(Usuario usuario){
        
        //montar a sql
        String sql = " UPDATE  usuario SET nome_usu=?, senha_usu=?, id_per=? WHERE id_su=?";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, usuario.getNome_usu());
        pstm.setString(2, usuario.getSenha_usu());
        pstm.setInt   (3, usuario.getId_per());
        pstm.setInt    (4, usuario.getId_usu());
       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Usuário Atualisado com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualisar Usuário: " + ex.getMessage());
        } 
}
public void excluir(Usuario usuario){
        
        //montar a sql
        String sql = " DELETE FROM  usuario WHERE id_su=?";
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
      
        pstm.setInt    (1, usuario.getId_usu());
       
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Usuário Excluido com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Usuário: " + ex.getMessage());
        } 
}


public List<Usuario> buscarTodos(){
        
        //montar a sql
        String sql = " SELETE * FROM  usuario ";
        
         List<Usuario> lista = new ArrayList<Usuario>();
        // constroe o PreparedStatement e o SQL
        try{
        PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
         
            while(rs.next()){
                Usuario usu = new Usuario();
                usu.setId_usu(rs.getInt("id_usu"));
                usu.setNome_usu(rs.getString("nome_usu"));
                usu.setSenha_usu(rs.getString("senha_usu"));
                usu.setId_per(rs.getInt("id_per"));
                
                lista.add(usu);
            }
       
        pstm.close();
        
        JOptionPane.showMessageDialog(null, " Usuário Excluido com Sucesso: " );
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Usuário: " + ex.getMessage());
        } 
return lista;
}
}
