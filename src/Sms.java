public class Sms implements Command {
    String message;

    public Sms(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Ссылка для скачивания анкеты "+ message);
    }
}
