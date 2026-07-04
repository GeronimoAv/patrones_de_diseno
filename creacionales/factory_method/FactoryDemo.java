// 5. Cliente aún más simple
public class FactoryDemo {
    public static void main(String[] args) {
        NotificationCreator creator = new EmailNotificationCreator();
        Notification notification = creator.createNotification();
        notification.notifyUser();

        creator = new SMSNotificationCreator();
        notification = creator.createNotification();
        notification.notifyUser();
    }
}