// Перечисление для статуса заказа
enum OrderStatus {
    NEW("Новый"),
    PROCESSING("В обработке"),
    COMPLETED("Завершен"),
    CANCELLED("Отменен");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // проверка активен ли статус
    public boolean isActive() {
        return this == NEW || this == PROCESSING;
    }

    // можно ли отменить заказ
    public boolean canBeCancelled() {
        return this != COMPLETED && this != CANCELLED;
    }
}


public class Practice2 {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.NEW;

        System.out.println("Статус: " + status.getDescription());
        System.out.println("Активный: " + status.isActive());
        System.out.println("Можно отменить: " + status.canBeCancelled());

        // Проверка для всех статусов
        System.out.println("\nВсе статусы:");
        for (OrderStatus s : OrderStatus.values()) {
            System.out.println(s.name() + ": активный=" + s.isActive() +
                             ", можно отменить=" + s.canBeCancelled());
        }
    }
}