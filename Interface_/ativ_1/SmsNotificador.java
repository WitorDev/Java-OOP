public class SmsNotificador implements Notificador {
  public void enviar(String destino, String mensagem) {
    System.out.println("Enviado SMS para " + destino + ": " + mensagem);
  }
}
