public class EmailNotificador implements Notificador {
  public void enviar(String destino, String mensagem) {
    System.out.println("Enviado Email para " + destino + ": " + mensagem);
  }
}
