public class Service {
    Command sms = new Sms("https://www.sberbank.ru/ru/person/credits/money");
    Command email = new Email("Самый популярный кредит в России\n" +
            "Снизили ставку до 8,9%\n" +
            "Без справок, нужен только паспорт\n" +
            "Без комиссий");

    Command smsNotification = new Sms("На ваш Email поступило письмо с акетой по кредитам");

    void execute(int mode) {
        switch (mode) {
            case 1:
                sms.execute();
                break;
            case 2:
                email.execute();
                smsNotification.execute();
                break;
            case 3:
                sms.execute();
                email.execute();
                smsNotification.execute();
                break;
            default:
                System.out.println("Был введен неправильный режим.");
        }

    }

}
