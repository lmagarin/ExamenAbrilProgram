package gestisimal.almacen;

public class IvaInvalidoException extends Exception {
  public IvaInvalidoException(String mensaje) {
    System.err.println(mensaje);
  }
}
