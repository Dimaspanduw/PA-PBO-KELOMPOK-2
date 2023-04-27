
package pa_music;

/**
 *
 * @author LENOVO
 */
public class Notif implements NewInterface  {

    @Override
    public void loginBenar() {
        System.out.println("Login Berhasil!");
    }

    @Override
    public void loginSalah() {
        System.out.println("Login Gagal");
    }
    
}    
  