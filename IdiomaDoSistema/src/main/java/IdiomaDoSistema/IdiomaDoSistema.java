
package IdiomaDoSistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault(); 
        System.out.println("A linguagem do seu sistema está em: ");
        System.out.println(loc.getDisplayLanguage()); // retorna "Português"
    }
    
}
