// 1. Interfaz común
interface Notification {
    void notifyUser();
}

// 2. Productos concretos
class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Enviando notificación por Email");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Enviando notificación por SMS");
    }
}

// 3. Creador abstracto (usa la interfaz como tipo de retorno)
abstract class NotificationCreator {
    public abstract Notification createNotification();
}

// 4. Creadores concretos
class EmailNotificationCreator extends NotificationCreator {
    public Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSNotificationCreator extends NotificationCreator {
    public Notification createNotification() {
        return new SMSNotification();
    }
}

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