package util;

import modelo.Usuario;
import modelo.Vaca;

/**
 *
 * @author Usuário
 */
public class DaoTest {
    
    public DaoTest() {
    }
    
    
//    @org.junit.jupiter.api.Test
//    public void testBuscar(){
//        Dao<Vaca> dao = new Dao(Vaca.class, "vaca");
//        Vaca v = dao.buscarPorChave("brinco", "A4");
//        System.out.println(v.getNome() + " " + v.getRaca());
//        System.out.println("\n");
//    }
    
    @org.junit.jupiter.api.Test
    public void testBuscar(){
        Dao<Usuario> dao = new Dao(Usuario.class);
        Usuario u = dao.buscarPorChave("login", "ZE");
        System.out.println(u.getNome());
        System.out.println("\n");
    }
    
//    @org.junit.jupiter.api.Test
//    public void testInserirUsuario() {
//        Dao<Usuario> dao = new Dao(Usuario.class);
//        Usuario u = new Usuario("ZE", "José", "123");
//        dao.inserir(u);
//    }

//    @org.junit.jupiter.api.Test
//    public void testInserirVaca() {
//        Dao<Vaca> dao = new Dao(Vaca.class);
//        Vaca vaca = new Vaca("A1", "Genoveva", "Holandesa");
//        dao.inserir(vaca);
//    }
    
//    @org.junit.jupiter.api.Test
//    public void testListarVacas(){
//        Dao<Vaca> dao = new Dao(Vaca.class);
//        List<Vaca> lista = dao.listarTodos();
//        for (Vaca v : lista){
//            System.out.println(v.getNome());            
//        }
//        System.out.println("\n");
//    }
    
//    @org.junit.jupiter.api.Test
//    public void testBuscarAlterar() {
//        Dao<Vaca> dao = new Dao(Vaca.class);
//        Vaca v = dao.buscarPorChave("brinco", "A6");
//        System.out.println(v.getNome());
//        System.out.println(v.getRaca());
//        v.setRaca("Gir"); 
//        dao.alterar("brinco", "A6", v);
//    }
    
    
}
