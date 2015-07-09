package testeconexao;

import java.util.List;
import model.Usuario;
import modelDAO.UsuarioDAO;

/**
 *
 * @author Carlos Barromeu
 */
public class TesteUsuario {
    
    public static void main (String []args){
        
        //testCadastrar();
        //testAlterar();
        //testExcluir();
        //testBuscarTodos();
    }
    
public static void testCadastrar(){
    
    Usuario usu = new Usuario();
    usu.setNome_usu("");
    usu.setSenha_usu("");
    usu.setId_per('3');
    
    UsuarioDAO usuDao = new UsuarioDAO();
    usuDao.cadastrar(usu);
    
}
    

private static void testAlterar(){
    Usuario usu = new Usuario();
    usu.setId_usu(5);
    usu.setNome_usu("");
    usu.setSenha_usu("");
    usu.setId_per('3');
    
    UsuarioDAO usuDao = new UsuarioDAO();
    usuDao.alterar(usu);
}

private static void testExcluir(){
    Usuario usu = new Usuario();
    usu.setId_usu(5);
    
    UsuarioDAO usuDao = new UsuarioDAO();
    usuDao.excluir(usu);
}

public static  void testBuscarTodos(){
    UsuarioDAO usuDao = new UsuarioDAO();
    List<Usuario> listaResultado = usuDao.buscarTodos();
    
    for( Usuario u: listaResultado){
        System.out.println(u.getId_usu()+ ""+ u.getNome_usu()+""+ u.getSenha_usu()+""+ u.getId_per());
    }
}
}
