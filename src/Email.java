public class Email implements Command {
    String text;

    public Email(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println("Анкета по кредитам "+ text);
    }
}
