/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.prático;

/**
 *
 * @author PORTOMASTER
 */
public class ExercicioPrático {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pessoa[] p = new Pessoa[2];
      Livro[] l = new Livro[3];
      
//PESSOAS
      p[0]= new Pessoa("Joao ",25, "M");
      p[1]= new Pessoa ("Maria ", 33, "F");
     
   //   p[2]= new Pessoa ("Joyce " ,25,"F ");
//LIVROS
      l[0]= new Livro("Os Sertões " , "Euclides da Cunha ", 330, p[0]); 
      l[1]= new Livro("Capitães de Areia ", "Jorge Amado ", 500,p[1]);
      l[1].abrir();
      l[1].folhear(501);
     l[1].avancarPag();
        System.out.println(l[1].detalhes());
      
    }
    
    
}
